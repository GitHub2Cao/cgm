package org.softnovo.seckill.flyweight.simple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.softnovo.seckill.flyweight.TestDB;

public class SecurityMgr {
	private SecurityMgr() {
	}

	private static SecurityMgr securityMgr = new SecurityMgr();

	public static SecurityMgr getInstance() {
		return securityMgr;
	}

	private Map<String, Collection<Flyweight>> map = new HashMap<String, Collection<Flyweight>>();

	public void login(String user) {
		Collection<Flyweight> col = queryByUser(user);
		map.put(user, col);
	}

	private Collection<Flyweight> queryByUser(String user) {
		Collection<Flyweight> col = new ArrayList<Flyweight>();
		for (String s : TestDB.colDB) {
			String ss[] = s.split(",");
			if (ss[0].equals(user)) {
				Flyweight fm = FlyweightFactory.getFlyweight(ss[1] + "," + ss[2]);
				col.add(fm);
			}
		}
		return col;
	}

	public boolean hasPermit(String user, String securityEntity, String permit) {
		Collection<Flyweight> col = map.get(user);
		if (col == null || col.size() == 0) {
			System.out.println(user + "没有登录或是没有被分配任何权限");
			return false;
		}
		for (Flyweight fm : col) {
			System.out.println("fm==" + fm);
			if (fm.match(securityEntity, permit)) {
				return true;
			}
		}
		return false;
	}
}
