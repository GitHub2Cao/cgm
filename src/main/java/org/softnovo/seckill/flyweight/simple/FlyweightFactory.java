package org.softnovo.seckill.flyweight.simple;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private FlyweightFactory() {
	}

	//private static FlyweightFactory FACTORY = new FlyweightFactory();

//	public static FlyweightFactory getInstance() {
//		return FACTORY;
//	}

	private static Map<String, Flyweight> FSMAP = new HashMap<String, Flyweight>();

	public static Flyweight getFlyweight(String key) {
		Flyweight f = FSMAP.get(key);
		if (f == null) {
			f = new AuthorizationFlyweight(key);
			FSMAP.put(key, f);
		}
		return f;
	}
}
