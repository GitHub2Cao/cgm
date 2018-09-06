package org.softnovo.seckill.test.mongo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Test {
	public static void main(String[] args) {
		String aa = "{\"applyUser\":\"02406\",\"audited\":\"NO\",\"bizId\":\"1535528749643\",\"certificationRos\":[{\"certificationName\":\"测试商户88888\",\"certificationNo\":\"965478521236547\",\"certificationType\":\"1\",\"certificationUrl\":\"http://s00.qccr.com/qccr/g01/workorder/2018/08/e242f90a6afd3ddf.jpg\",\"createUser\":\"02406\",\"effectiveTime\":1535472000000,\"failureTime\":1536336000000,\"id\":0,\"updateUser\":\"02406\"},{\"certificationName\":\"杨群\",\"certificationNo\":\"340825198601194852\",\"certificationType\":\"2\",\"certificationUrl\":\"http://s00.qccr.com/qccr/g01/workorder/2018/08/527214684435073f.png\",\"createUser\":\"02406\",\"effectiveTime\":1535472000000,\"failureTime\":1536336000000,\"id\":0,\"updateUser\":\"02406\"}],\"contractRo\":{\"contractFailureTime\":1536336000000,\"contractName\":\"1436546546\",\"contractNo\":\"1478797898\",\"contractPhoto01\":\"http://s00.qccr.com/qccr/g01/workorder/2018/08/c1dd8841d8818057.png\",\"contractTime\":\"2018-08-29\",\"contractType\":\"1\",\"createPerson\":\"02406\",\"updatePerson\":\"02406\"},\"merchantRo\":{\"address\":\"测试\",\"area\":\"23\",\"chainsStoreNum\":0,\"chainsType\":\"NO\",\"cityCode\":\"22\",\"createPerson\":\"02406\",\"merchantId\":\"\",\"merchantName\":\"测试商户88888\",\"mobilephone\":\"15168305786\",\"provinceCode\":\"21\",\"responsePeople\":\"杨群\",\"shopChainsType\":0,\"streetCode\":\"29441\",\"updatePerson\":\"02406\"},\"shopRO\":{\"channelCode\":\"301\",\"createPerson\":\"02406\",\"platformId\":7,\"remark\":\"\",\"shopCategoryRefROs\":[{\"categoryCode\":\"AC3279E929E79E4\",\"categoryId\":98711,\"categoryName\":\"测试yq2\"},{\"categoryCode\":\"ACABAD\",\"categoryId\":97238,\"categoryName\":\"精细洗车-5座\"},{\"categoryCode\":\"ACABAC\",\"categoryId\":97239,\"categoryName\":\"普通洗车-7座\"},{\"categoryCode\":\"ACABAE\",\"categoryId\":97240,\"categoryName\":\"普通洗车-5座\"},{\"categoryCode\":\"ACABAB\",\"categoryId\":97241,\"categoryName\":\"精细洗车-7座\"},{\"categoryCode\":\"ACABAS\",\"categoryId\":97315,\"categoryName\":\"全车打蜡\"},{\"categoryCode\":\"ACABAF\",\"categoryId\":97289,\"categoryName\":\"全车抛光\"},{\"categoryCode\":\"ACABAR\",\"categoryId\":97313,\"categoryName\":\"全车封釉\"},{\"categoryCode\":\"ACABAQ\",\"categoryId\":97311,\"categoryName\":\"全车镀膜\"},{\"categoryCode\":\"ACABAP\",\"categoryId\":97309,\"categoryName\":\"全车镀晶\"},{\"categoryCode\":\"ACABAG\",\"categoryId\":97291,\"categoryName\":\"内饰清洗\"},{\"categoryCode\":\"ACABAN\",\"categoryId\":97305,\"categoryName\":\"臭氧消毒\"},{\"categoryCode\":\"ACABAJ\",\"categoryId\":97297,\"categoryName\":\"空调除臭\"},{\"categoryCode\":\"ACABAM\",\"categoryId\":97303,\"categoryName\":\"蒸汽桑拿\"},{\"categoryCode\":\"ACABAL\",\"categoryId\":97301,\"categoryName\":\"光触媒消毒\"},{\"categoryCode\":\"ACABAK\",\"categoryId\":97299,\"categoryName\":\"内饰镀膜\"},{\"categoryCode\":\"ACABAI\",\"categoryId\":97295,\"categoryName\":\"发动机外部镀膜\"},{\"categoryCode\":\"ACABAH\",\"categoryId\":97293,\"categoryName\":\"轮毂镀膜\"},{\"categoryCode\":\"ACABAO\",\"categoryId\":97307,\"categoryName\":\"全车玻璃雨膜\"},{\"categoryCode\":\"ACABAU\",\"categoryId\":97451,\"categoryName\":\"洗车次卡套餐\"},{\"categoryCode\":\"ACABBF\",\"categoryId\":26,\"categoryName\":\"贴膜\"},{\"categoryCode\":\"ACABBG\",\"categoryId\":97557,\"categoryName\":\"新年美容套餐\"},{\"categoryCode\":\"ACABBH\",\"categoryId\":97559,\"categoryName\":\"超宝镀晶大礼包\"},{\"categoryCode\":\"ACABBI\",\"categoryId\":97561,\"categoryName\":\"超宝进口 保养礼包\"},{\"categoryCode\":\"ACABBJ\",\"categoryId\":97563,\"categoryName\":\"超宝安全出行礼包\"},{\"categoryCode\":\"ACABBK\",\"categoryId\":97565,\"categoryName\":\"超值美容\"},{\"categoryCode\":\"ACABBL\",\"categoryId\":97575,\"categoryName\":\"局部抛光\"},{\"categoryCode\":\"ACABBO\",\"categoryId\":97581,\"categoryName\":\"局部沥青清洗\"},{\"categoryCode\":\"ACABBP\",\"categoryId\":97583,\"categoryName\":\"雨刮水添加\"},{\"categoryCode\":\"ACAQAB\",\"categoryId\":97801,\"categoryName\":\"精细洗车（新）\"},{\"categoryCode\":\"ACAQAC\",\"categoryId\":97803,\"categoryName\":\"普通洗车（新）\"},{\"categoryCode\":\"ACARAB\",\"categoryId\":97805,\"categoryName\":\"更换机油（新）\"},{\"categoryCode\":\"ACARAC\",\"categoryId\":97807,\"categoryName\":\"添加机油（新）\"},{\"categoryCode\":\"ACARAD\",\"categoryId\":97809,\"categoryName\":\"更换机油滤清器（新）\"},{\"categoryCode\":\"ACARAE\",\"categoryId\":97811,\"categoryName\":\"更换空气滤清器（新）\"},{\"categoryCode\":\"ACARAF\",\"categoryId\":97813,\"categoryName\":\"更换空调滤清器（新）\"},{\"categoryCode\":\"ACARAG\",\"categoryId\":97815,\"categoryName\":\"更换防冻液（新）\"},{\"categoryCode\":\"ACARAH\",\"categoryId\":97817,\"categoryName\":\"添加防冻液（新）\"},{\"categoryCode\":\"ACARAI\",\"categoryId\":97819,\"categoryName\":\"更换刹车油（新）\"},{\"categoryCode\":\"ACARAJ\",\"categoryId\":97821,\"categoryName\":\"添加刹车油（新）\"},{\"categoryCode\":\"ACARAK\",\"categoryId\":97823,\"categoryName\":\"更换变速箱油（新）\"},{\"categoryCode\":\"ACARAL\",\"categoryId\":97825,\"categoryName\":\"节气门清洗（新）\"},{\"categoryCode\":\"ACARAM\",\"categoryId\":97827,\"categoryName\":\"燃油系统养护（新）\"},{\"categoryCode\":\"ACARAN\",\"categoryId\":97829,\"categoryName\":\"刹车系统养护（新）\"},{\"categoryCode\":\"ACARAO\",\"categoryId\":97831,\"categoryName\":\"冷却系统养护（新）\"},{\"categoryCode\":\"ACARAP\",\"categoryId\":97833,\"categoryName\":\"水箱清洗（新）\"},{\"categoryCode\":\"ACARAQ\",\"categoryId\":97835,\"categoryName\":\"进气系统清洗（新）\"},{\"categoryCode\":\"ACARAR\",\"categoryId\":97837,\"categoryName\":\"三元催化清洗（新）\"},{\"categoryCode\":\"ACARAS\",\"categoryId\":97839,\"categoryName\":\"喷油嘴清洗（新）\"},{\"categoryCode\":\"ACARAT\",\"categoryId\":97841,\"categoryName\":\"润滑系统养护（新）\"},{\"categoryCode\":\"ACARAU\",\"categoryId\":97843,\"categoryName\":\"发动机内部清洗（新）\"},{\"categoryCode\":\"ACARAV\",\"categoryId\":97845,\"categoryName\":\"空调管路清洗（新）\"},{\"categoryCode\":\"ACARAW\",\"categoryId\":97847,\"categoryName\":\"蒸发箱清洗（新）\"},{\"categoryCode\":\"ACASAB\",\"categoryId\":97849,\"categoryName\":\"更换雨刮片（新）\"},{\"categoryCode\":\"ACASAC\",\"categoryId\":97851,\"categoryName\":\"更换刹车片（新）\"},{\"categoryCode\":\"ACASAD\",\"categoryId\":97853,\"categoryName\":\"更换火花塞（新）\"},{\"categoryCode\":\"ACASAE\",\"categoryId\":97855,\"categoryName\":\"更换燃油滤清器（新）\"},{\"categoryCode\":\"ACASAF\",\"categoryId\":97857,\"categoryName\":\"更换蓄电池（新）\"},{\"categoryCode\":\"ACASAG\",\"categoryId\":97859,\"categoryName\":\"冷却系统（新）\"},{\"categoryCode\":\"ACASAH\",\"categoryId\":97861,\"categoryName\":\"润滑系统（新）\"},{\"categoryCode\":\"ACASAI\",\"categoryId\":97863,\"categoryName\":\"燃油系统（新）\"},{\"categoryCode\":\"ACASAJ\",\"categoryId\":97865,\"categoryName\":\"进排气系统（新）\"},{\"categoryCode\":\"ACASAKAB\",\"categoryId\":97979,\"categoryName\":\"更换正时组件（新）\"},{\"categoryCode\":\"ACASAL\",\"categoryId\":97869,\"categoryName\":\"传动系统（新）\"},{\"categoryCode\":\"ACASAMAB\",\"categoryId\":97981,\"categoryName\":\"更换刹车盘（新）\"},{\"categoryCode\":\"ACASAMAC\",\"categoryId\":97983,\"categoryName\":\"更换制动鼓（新）\"},{\"categoryCode\":\"ACASANAB\",\"categoryId\":97985,\"categoryName\":\"更换助力转向油（新）\"},{\"categoryCode\":\"ACASAOAB\",\"categoryId\":97987,\"categoryName\":\"更换减震器（新）\"},{\"categoryCode\":\"ACASAPAB\",\"categoryId\":97989,\"categoryName\":\"更换车灯（新）\"},{\"categoryCode\":\"ACASAQAB\",\"categoryId\":97991,\"categoryName\":\"更换空调制冷剂（新）\"},{\"categoryCode\":\"ACASAR\",\"categoryId\":97881,\"categoryName\":\"模块类（新）\"},{\"categoryCode\":\"ACASAS\",\"categoryId\":97883,\"categoryName\":\"传感类（新）\"},{\"categoryCode\":\"ACASAT\",\"categoryId\":97885,\"categoryName\":\"车身部件（新）\"},{\"categoryCode\":\"ACASAU\",\"categoryId\":97887,\"categoryName\":\"车身外观（新）\"},{\"categoryCode\":\"ACASAV\",\"categoryId\":97889,\"categoryName\":\"辅助件（新）\"},{\"categoryCode\":\"ACATAB\",\"categoryId\":97891,\"categoryName\":\"充气（新）\"},{\"categoryCode\":\"ACATAC\",\"categoryId\":97893,\"categoryName\":\"补胎（新）\"},{\"categoryCode\":\"ACATAD\",\"categoryId\":97895,\"categoryName\":\"轮胎更换（新）\"},{\"categoryCode\":\"ACATAE\",\"categoryId\":97897,\"categoryName\":\"动平衡（新）\"},{\"categoryCode\":\"ACATAF\",\"categoryId\":97899,\"categoryName\":\"四轮定位（新）\"},{\"categoryCode\":\"ACATAG\",\"categoryId\":97901,\"categoryName\":\"轮毂更换（新）\"},{\"categoryCode\":\"ACATAH\",\"categoryId\":97903,\"categoryName\":\"轮胎换位（新）\"},{\"categoryCode\":\"ACATAI\",\"categoryId\":97905,\"categoryName\":\"胎压报警器（新）\"},{\"categoryCode\":\"ACATAJ\",\"categoryId\":97907,\"categoryName\":\"气门嘴更换（新）\"},{\"categoryCode\":\"ACATAK\",\"categoryId\":97909,\"categoryName\":\"钢圈修复（新）\"},{\"categoryCode\":\"ACATAL\",\"categoryId\":97911,\"categoryName\":\"胎压检测（新）\"},{\"categoryCode\":\"ACATAM\",\"categoryId\":97913,\"categoryName\":\"轮胎寄存（新）\"},{\"categoryCode\":\"ACAUAB\",\"categoryId\":97915,\"categoryName\":\"去污（新）\"},{\"categoryCode\":\"ACAUAC\",\"categoryId\":97917,\"categoryName\":\"抛光（新）\"},{\"categoryCode\":\"ACAUAD\",\"categoryId\":97919,\"categoryName\":\"打蜡（新）\"},{\"categoryCode\":\"ACAUAE\",\"categoryId\":97921,\"categoryName\":\"封釉（新）\"},{\"categoryCode\":\"ACAUAF\",\"categoryId\":97923,\"categoryName\":\"镀膜（新）\"},{\"categoryCode\":\"ACAUAG\",\"categoryId\":97925,\"categoryName\":\"镀晶（新）\"},{\"categoryCode\":\"ACAUAH\",\"categoryId\":97927,\"categoryName\":\"外饰件翻新（新）\"},{\"categoryCode\":\"ACAUAI\",\"categoryId\":97929,\"categoryName\":\"轮毂清洗（新）\"},{\"categoryCode\":\"ACAUAJ\",\"categoryId\":97931,\"categoryName\":\"内饰清洗（新）\"},{\"categoryCode\":\"ACAUAK\",\"categoryId\":97933,\"categoryName\":\"臭氧消毒（新）\"},{\"categoryCode\":\"ACAUAL\",\"categoryId\":97935,\"categoryName\":\"光触媒消毒（新）\"},{\"categoryCode\":\"ACAUAM\",\"categoryId\":97937,\"categoryName\":\"蒸汽桑拿（新）\"},{\"categoryCode\":\"ACAUAN\",\"categoryId\":97939,\"categoryName\":\"空调清洗（新）\"},{\"categoryCode\":\"ACAUAO\",\"categoryId\":97941,\"categoryName\":\"发动机舱清洗（新）\"},{\"categoryCode\":\"ACAVAB\",\"categoryId\":97943,\"categoryName\":\"车窗膜（新）\"},{\"categoryCode\":\"ACAVAC\",\"categoryId\":97945,\"categoryName\":\"车身膜（新）\"},{\"categoryCode\":\"ACAVAD\",\"categoryId\":97947,\"categoryName\":\"电器（新）\"},{\"categoryCode\":\"ACAVAE\",\"categoryId\":97949,\"categoryName\":\"内饰改装（新）\"},{\"categoryCode\":\"ACAVAF\",\"categoryId\":97951,\"categoryName\":\"车品安装（新）\"},{\"categoryCode\":\"ACAVAGAB\",\"categoryId\":97995,\"categoryName\":\"装饰灯（新）\"},{\"categoryCode\":\"ACAVAGAC\",\"categoryId\":97997,\"categoryName\":\"改色膜（新）\"},{\"categoryCode\":\"ACAVAGAD\",\"categoryId\":97999,\"categoryName\":\"车顶架（新）\"},{\"categoryCode\":\"ACAVAGAE\",\"categoryId\":98001,\"categoryName\":\"车顶箱（新）\"},{\"categoryCode\":\"ACAVAGAF\",\"categoryId\":98003,\"categoryName\":\"太阳膜（新）\"},{\"categoryCode\":\"ACAVAGAG\",\"categoryId\":98005,\"categoryName\":\"装饰条（新）\"},{\"categoryCode\":\"ACAVAH\",\"categoryId\":98009,\"categoryName\":\"lsq车品安装\"},{\"categoryCode\":\"ACAWAB\",\"categoryId\":97955,\"categoryName\":\"钣金（新）\"},{\"categoryCode\":\"AC27F34E8C167D4\",\"categoryId\":98719,\"categoryName\":\"保险杠喷漆\"},{\"categoryCode\":\"AC61897CE23CD94\",\"categoryId\":98721,\"categoryName\":\"车门喷漆\"},{\"categoryCode\":\"AC712295ADF0674\",\"categoryId\":98723,\"categoryName\":\"叶子板喷漆\"},{\"categoryCode\":\"ACAB8C54E9AD674\",\"categoryId\":98725,\"categoryName\":\"机盖喷漆\"},{\"categoryCode\":\"AC4D45D2FD6DA64\",\"categoryId\":98727,\"categoryName\":\"车顶喷漆\"},{\"categoryCode\":\"ACF0D1F70AB1E04\",\"categoryId\":98729,\"categoryName\":\"尾门\"},{\"categoryCode\":\"ACA005557F6CF34\",\"categoryId\":98731,\"categoryName\":\"倒车镜喷漆\"},{\"categoryCode\":\"AC063B243580584\",\"categoryId\":98733,\"categoryName\":\"下边梁喷漆\"},{\"categoryCode\":\"ACFDD0DC97C3AE4\",\"categoryId\":98735,\"category...";
		aa = aa + aa;
		
		System.out.println("+++++++++++++ " + aa.length());
		
		System.out.println("------------- " + zipString(aa).length());
		System.out.println("------------- " + zipString(aa));
		
		//System.out.println(unzipString(zipString(aa)));
	}

	public static String zipString(String str) {
		try {
			ByteArrayOutputStream bos = null;
			GZIPOutputStream os = null;
			byte[] bs = null;
			try {
				bos = new ByteArrayOutputStream();
				os = new GZIPOutputStream(bos);
				os.write(str.getBytes());
				os.close();
				bos.close();
				bs = bos.toByteArray();
				return new String(bs, "iso-8859-1");
			} finally {
				bs = null;
				bos = null;
				os = null;
			}
		} catch (Exception ex) {
			return str;
		}
	}

	public static String unzipString(String str) {
		ByteArrayInputStream bis = null;
		ByteArrayOutputStream bos = null;
		GZIPInputStream is = null;
		byte[] buf = null;
		try {
			bis = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
			bos = new ByteArrayOutputStream();
			is = new GZIPInputStream(bis);
			buf = new byte[1024];
			int len;
			while ((len = is.read(buf)) != -1) {
				bos.write(buf, 0, len);
			}
			is.close();
			bis.close();
			bos.close();
			return new String(bos.toByteArray());
		} catch (Exception ex) {
			return str;
		} finally {
			bis = null;
			bos = null;
			is = null;
			buf = null;
		}
	}
}
