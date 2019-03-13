package org.softnovo.seckill.test.java8.exercise;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.print.attribute.standard.JobOriginatingUserName;

public class TransactionTest {
	public static void main(String[] args) {
		// 找出2011年的所有交易并按交易额排序(从低到高)
		List<Transaction> transactions = TransactionFactory.buildTransactions();
		List<Transaction> list2011 = transactions.stream().
			filter(d -> d.getYear() == 2011).
			sorted(Comparator.comparing(Transaction::getValue))
			.collect(Collectors.toList());
		System.out.println("list2011 == " + list2011);

		// 交易员都在哪些不同的城市工作过
		List<String> traderCitys = transactions.stream().map(d -> d.getTrader().getCity()).distinct().collect(Collectors.toList());
		System.out.println("traderCitys == " + traderCitys);
		Set<String> traderCitySet = transactions.stream().map(d -> d.getTrader().getCity()).collect(Collectors.toSet());
		System.out.println("traderCitySet == " + traderCitySet);
		
		// 查找所有来自于剑桥的交易员，并按姓名排序
		List<Trader> cambridgeTraders = transactions.stream()
				.map(d -> d.getTrader())
				.filter(d -> "Cambridge".equals(d.getCity()))
				.distinct()
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
		System.out.println("cambridgeTraders == " + cambridgeTraders);
		
		// 返回所有交易员的姓名字符串，按字母顺序排序
		String traderStr = transactions.stream()
				.map(d -> d.getTrader().getName())
				.distinct()
				.sorted()
				//.reduce("", (a, b) -> a + b);
				.collect(Collectors.joining());
		System.out.println("traderStr == " + traderStr);
		
		// 有没有交易员是在米兰工作的
//		boolean milanBased = transactions.stream()
//				.map(d -> d.getTrader().getCity())
//				.anyMatch(d -> "".equals(d))
		
	}

}
