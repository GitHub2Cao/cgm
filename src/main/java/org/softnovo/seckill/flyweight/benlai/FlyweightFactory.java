package org.softnovo.seckill.flyweight.benlai;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	/**
	 * 缓存多个flyweight对象，这里只是示意一下
	 */

	private Map<String, Flyweight> fsMap = new HashMap<String, Flyweight>();

	public Flyweight getFlyweight(String key) {
		Flyweight f = fsMap.get(key);
		if (f == null) {
			f = new ConcreteFlyweight(key);
			fsMap.put(key, f);
		}
		return f;
	}
}
