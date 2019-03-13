package org.softnovo.seckill.test.orika;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class Test {
	public static void main(String[] args) throws UnsupportedEncodingException {
//		String store = "{\"action\":\"ADD\",\"actionDesc\":\"门店新增\",\"content\":{\"accountNo\":\"10022200010\",\"address\":\"4\",\"alipayAccount\":\"10022200010\",\"alipayAccountType\":\"1\",\"alipayName\":\"测试\",\"area\":\"45\",\"areaType\":2,\"bizEndTime\":\"18:30\",\"bizStartTime\":\"09:30\",\"busi\":[{\"approveStatus\":0,\"busiType\":2,\"cashStatus\":0,\"contractStatus\":0,\"createPerson\":\"03838\",\"status\":10,\"updatePerson\":\"03838\"}],\"certificationEffectiveTime\":\"2019-02-14 00:00:00\",\"certificationFailureTime\":\"2019-03-09 00:00:00\",\"certificationName\":\"好快全\",\"certificationNo\":\"333000111230256302\",\"certificationPermanent\":\"N\",\"certificationUrl\":\"http://s00.zhangzhongpei.com/qccr/g01/workorder/2019/02/a6726463fbb27c72.jpg\",\"cityCode\":\"41\",\"closedCycle\":\"MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY\",\"createPerson\":\"03838\",\"createTime\":\"2019-02-14 16:39:06\",\"hasCustomerLounge\":\"Y\",\"hasToilet\":\"Y\",\"header\":\"测试\",\"headerMobilePhone\":\"10022200010\",\"idCardEmblemUrl\":\"http://s00.zhangzhongpei.com/qccr/g01/workorder/2019/02/ac02a3495a1190b1.jpg\",\"idCardHeadUrl\":\"http://s00.zhangzhongpei.com/qccr/g01/workorder/2019/02/f96ab328ad70e71d.jpg\",\"idCardName\":\"测试\",\"idCardNo\":\"350423198908175023\",\"indoorStationsNumber\":\"3\",\"parentId\":\"0\",\"provinceCode\":\"39\",\"safety\":{\"bankBranch\":\"\",\"bankCityCode\":\"\",\"bankName\":\"\",\"bankProvinceCode\":\"\",\"changeCount\":0,\"createUser\":\"03838\",\"mobile\":\"\",\"payAccount\":\"\",\"receiver\":\"\",\"updateUser\":\"03838\"},\"storeEnvironmentUrl\":\"[]\",\"storeFacilitiesUrl\":\"[]\",\"storeImageUrl\":\"[{\\\"url\\\":\\\"http://s00.zhangzhongpei.com/qccr/g01/workorder/2019/02/7bb4fc8142384105.jpg\\\",\\\"value\\\":\\\"\\\"}]\",\"storeManager\":\"N\",\"storeName\":\"测试4333\",\"storeOperateArea\":\"444\",\"storeServiceRange\":[],\"storeTeamUrl\":\"[]\",\"storeTel\":\"-\",\"storeTelephone\":\"10022200010\",\"storeType\":1,\"storeWorkshopUrl\":\"[]\",\"uid\":\"117532320\",\"updatePerson\":\"03838\",\"updateTime\":\"2019-02-14 16:39:06\"},\"opId\":\"04d35c16-aefc-46d4-9478-ca10de69cd46\",\"operator\":\"03838\",\"status\":0,\"target\":\"STORE\",\"targetId\":\"15012191\",\"timestamp\":\"2019-02-14 16:39:06\"}";
//		
//		
//		Object address = JSONObject.parse(store);
//		Map<String, Object> map = new HashMap<>();
//		map = (Map<String, Object>) address;
//		System.out.println("_+_+_+_+_+_+_+_+ " + map.get("address"));
		
		
		
		
		
		
		String commit = "万年难买的Ysl圆12# 斩男色❤️排名No.1最难买到的色号之一，圣罗兰Rouge Volupte Shine迷魅亮彩系列（金圆管）12号正桃红色，显白，好气色 提气色，shine系列应该是显色度和滋润度平衡最好的唇膏了！好用到没朋友，也叫珊瑚红色，白皮黄皮都能hold住，不挑肤色💓";
		String encommit = URLEncoder.encode(commit, "UTF-8");
		System.out.println(encommit);
		
		
//		try {
//			String commitStr =  URLDecoder.decode(commit, "UTF-8");
//			System.out.println("_+_+_+_+_+ " + commitStr);
//		} catch (UnsupportedEncodingException e) {
//			
//			
//			e.printStackTrace();
//		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
//        Map<String, Object> params = new HashMap<>();
//        params.put("id", 123);
//        params.put("name", "cccccgggmm");
//        
//        
////        String paramStrinngfy = JSON.toJSONString(params);
////        JSONObject jsonObject = JSON.parseObject(paramStrinngfy);
//        
//        
//        mapperFactory.classMap(HashMap.class, UserA.class)
//                .field("id", "id")
//                .field("name", "name")
//                
//                .register();
//
////        User user = new User();
////        user.setId1(123L);
////        user.setName("小明");
//
//        MapperFacade mapper = mapperFactory.getMapperFacade();
//        
//        
//        //mapperFactory.
//        
//
//        UserA userA = mapper.map(params, UserA.class);
//        //mapper.
//        System.out.println("_+_+_+_+_+_+ " + JSON.toJSONString(userA));
//    }
	
	

}
