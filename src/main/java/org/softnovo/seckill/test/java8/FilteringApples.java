package org.softnovo.seckill.test.java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilteringApples {
	public static void main(String... args) throws IOException {

		List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));

//		System.out.println("_+_+_+_+_+_+_+ green --- " + filterGreenApples(inventory));
//
//		System.out.println("_+_+_+_+_+_+_+ filterHeavyApples --- " + filterHeavyApples(inventory));
//
//		System.out.println("_+_+_+_+_+_+_+ filterHeavyApples --- " + filterApples(inventory, FilteringApples::isGreenApple));
//		
//		System.out.println("_+_+_+_+_+_+_+ green --- " + filterApples(inventory, (Apple a) -> "green".equals(a.getColor())));

//		List<Apple> heavyApples = inventory.stream().filter((Apple a) -> a.getWeight() > 100).collect(Collectors.toList());
//		System.out.println("_+_+_+_+_+_+_+ 150 --- " + heavyApples);
//		
//		List<Apple> apples = inventory.parallelStream().filter((Apple a) -> a.getWeight() > 70).collect(Collectors.toList());
//		System.out.println("_+_+_+_+_+_+_+ 150 --- " + apples);

//		inventory.sort(new Comparator<Apple>() {
//			@Override
//			public int compare(Apple o1, Apple o2) {
//				return o1.getWeight().compareTo(o2.getWeight());
//			}
//		});
//		
//		System.out.println(inventory);
//		
//		
//		inventory.sort((Apple o1, Apple o2) -> o2.getWeight().compareTo(o1.getWeight()));
//		System.out.println(inventory);

		// String result = processFile((BufferedReader br) -> br.readLine() +
		// br.readLine());

//		String result = processFileLimited();
//        System.out.println(result);
//
//        System.out.println("---------");
//
//		String oneLine = processFile((BufferedReader b) -> b.readLine());
//		System.out.println(oneLine);
//		
//		System.out.println("+++++++++");
//
//		String twoLines = processFile((BufferedReader b) -> b.readLine() + b.readLine());
//		System.out.println(twoLines);

//		int portNumber = 1337;
//		Runnable r = () -> System.out.println(portNumber);
//		Thread t = new Thread(r);
//		t.start();
		// portNumber = 31337;

		List<String> str = Arrays.asList("a", "b", "A", "B");
		System.out.println(str);
		//str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
		
		str.sort(String::compareToIgnoreCase);
		System.out.println(str);
		

	}

	public static String processFile() throws IOException {
		try (BufferedReader br = new BufferedReader(
				new FileReader("/Users/cgm/git/cgm/src/main/resources/lambdasinaction/chap3/data.txt"))) {
			return br.readLine();
		}
	}

	public static String processFileLimited() throws IOException {
		try (BufferedReader br = new BufferedReader(
				new FileReader("/Users/cgm/git/cgm/src/main/resources/lambdasinaction/chap3/data.txt"))) {
			return br.readLine() + " " + br.readLine() + " " + br.readLine() + " " + br.readLine();
		}
	}

	public static String processFile(BufferedReaderProcessor p) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new FileReader("/Users/cgm/git/cgm/src/main/resources/lambdasinaction/chap3/data.txt"))) {
			return p.process(br);
		}
	}

	@FunctionalInterface
	public interface BufferedReaderProcessor {
		public String process(BufferedReader b) throws IOException;
	}

	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if ("green".equals(apple.getColor())) {
				result.add(apple);
			}
		}

		return result;
	}

	public static List<Apple> filterHeavyApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getWeight() > 150) {
				result.add(apple);
			}
		}
		return result;
	}

	static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	public static boolean isGreenApple(Apple apple) {
		return "green".equals(apple.getColor());
	}

	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}

	// public static boolean filterApplesLambda(inventory)
}
