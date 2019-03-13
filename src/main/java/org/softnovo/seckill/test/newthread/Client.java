package org.softnovo.seckill.test.newthread;

import com.alibaba.fastjson.JSON;

/***************************************
 * @author:Alex Wang
 * @Date:2017/3/19 QQ:532500648
 * QQ交流群:286081824
 ***************************************/
public class Client {
    public static void main(String[] args) {
    	F6Msg f6Msg = new F6Msg();
		f6Msg.setOpCode("123213");
		f6Msg.setStoreId("2111");
		
		String param = JSON.toJSONString(f6Msg);
		System.out.println("_+_+_+_+_+_+_+ " + param);
    }
    
    static class F6Msg {
		private String opCode;
		private String storeId;
		public String getOpCode() {
			return opCode;
		}
		public void setOpCode(String opCode) {
			this.opCode = opCode;
		}
		public String getStoreId() {
			return storeId;
		}
		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}
	}
}
