package org.softnovo.seckill.test.thread;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.softnovo.seckill.dto.Exposer;

public class Test {
	public static void main(String[] args) {
		try {
			System.out.println(objectToMap(new Exposer(true, 1)));
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Map<String, String> objectToMap(Object obj) throws IllegalArgumentException, IllegalAccessException {
		Map<String, String> map = new HashMap<>();
		Class<?> clazz = obj.getClass();
		System.out.println(clazz);
		for (Field field : clazz.getDeclaredFields()) {
			field.setAccessible(true);
			String fieldName = field.getName();
			Object value = field.get(obj);
			map.put(fieldName, String.valueOf(value));
		}
		return map;
	}
}
