package org.softnovo.seckill.test.thread;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.alibaba.fastjson.JSON;

public class Test {
	public static void main(String[] args) {
		String aa = "[]";
		
		List<String> list = JSON.parseArray(aa, String.class);
		
		System.out.println(JSON.toJSONString(list));
		
		
	}
	
	public static String getUUID32() {
		String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		return uuid;
		//   return UUID.randomUUID().toString().replace("-", "").toLowerCase();
	}
	
	private class AAA {
		private String a;
		private Integer b;
		
		public AAA(String a, Integer b) {
			this.a = a;
			this.b = b;
		}

		public String getA() {
			return a;
		}

		public void setA(String a) {
			this.a = a;
		}

		public Integer getB() {
			return b;
		}

		public void setB(Integer b) {
			this.b = b;
		}
	}
	
	private <T> T convert2Ro(Class<T> clazz, Map<String, Object> paramMap) {
        T t = null;
        try {
            t = clazz.newInstance();
            Field[] fs = clazz.getDeclaredFields();
            Iterator<Map.Entry<String, Object>> iter = paramMap.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry<String, Object> next = iter.next();
                for (Field field : fs) {
                    field.setAccessible(true);
                    if (next.getKey().equals(field.getName())) {
                    	if("Integer".equals(field.getType().getSimpleName())) {
                            field.set(t, Integer.valueOf(next.getValue()+""));
                        } else if("Long".equals(field.getType().getSimpleName())) {
                            field.set(t, Long.valueOf(next.getValue()+""));
                        } else if("Double".equals(field.getType().getSimpleName())) {
                            field.set(t, Double.valueOf(next.getValue()+""));
                        } else {
                        	field.set(t, String.valueOf(next.getValue()));
                        }
                        iter.remove();
                    }
                }
            }
        } catch (Exception e) {
		}
        return t;
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
