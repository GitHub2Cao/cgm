package org.softnovo.seckill.flyweight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SecurityMgr {
	private static SecurityMgr securityMgr = new SecurityMgr();

	private SecurityMgr() {
	}

	public static SecurityMgr getInstance() {
		return securityMgr;
	}

	// 缓存时间长度的问题
	// 缓存数据和真实数据的同步问题
	// 缓存的多线程并发控制
	/**
	 * 需要分离出被缓存对象实例中，哪些数据是不变且重复出现的，哪些数据是经常变化的，
	 * 真正应该被缓存的数据是那些不变且重复出现的数据，把它们称为对象的内部状态，
	 * 而那些变化的数据就不缓存了，把它们称为对象的外部状态。
	 */
	private Map<String, Collection<AuthorizationModel>> map = new HashMap<String, Collection<AuthorizationModel>>();

	public void login(String user) {
		Collection<AuthorizationModel> col = queryByUser(user);
		map.put(user, col);
	}

	public boolean hasPermit(String user, String securityEntity, String permit) {
		Collection<AuthorizationModel> col = map.get(user);
		if (col == null || col.size() == 0) {
			System.out.println(user + "没有登录或是没有被分配任何权限");
			return false;
		}

		for (AuthorizationModel am : col) {
			System.out.println("am==" + am);
			if (am.getSecurityEntity().equals(securityEntity) && am.getPermit().equals(permit)) {
				return true;
			}
		}

		return false;
	}

	private Collection<AuthorizationModel> queryByUser(String user) {
		Collection<AuthorizationModel> col = new ArrayList<AuthorizationModel>();
		for (String s : TestDB.colDB) {
			String ss[] = s.split(",");
			if (ss[0].equals(user)) {
				AuthorizationModel am = new AuthorizationModel();
				am.setUser(ss[0]);
				am.setSecurityEntity(ss[1]);
				am.setPermit(ss[2]);
				col.add(am);
			}
		}

		return col;
	}
}
