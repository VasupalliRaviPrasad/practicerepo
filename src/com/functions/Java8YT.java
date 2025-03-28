package com.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8YT {


	public static void main(String[] args) {

//		List<Integer> nums = Arrays.asList(-2,0,1, 4, 5, 10, 20, 21, 22, 26, 32, 28, 1, 4, 5, 10);
//		Optional<Integer> reduce = nums.stream().reduce((a, b) -> a + b);
//		if (reduce.isPresent()) {
//			Integer i = reduce.get();
//			Double i1 = (double) (i / 15);
//			System.out.println(i1);
//		}
//		
//		Double collect = nums.stream().collect(Collectors.averagingDouble(num -> num));
//		System.out.println(collect);
//
//		OptionalDouble average = nums.stream().mapToInt(e -> e).average();
//		if (average.isPresent()) {
//			Double d = average.getAsDouble();
//			System.out.println(d);
//		}
//		int sum = nums.stream().mapToInt(e -> e * e).sum();
//		System.out.println(sum);
//
//		OptionalDouble average2 = nums.stream().mapToInt(e -> e * e).average();
//
//		if (average2.isPresent()) {
//			Double d = average2.getAsDouble();
//			System.out.println(d);
//		}
//
//		int sum2 = nums.stream().mapToInt(num -> num).sum();
//		System.out.println(sum2);
//
//		OptionalDouble sum3 = nums.stream().mapToInt(e -> e * e).average();
//		Double d1 = sum3.getAsDouble();
//		System.out.println(d1);
//
//		DoubleSummaryStatistics collect2 = nums.stream().map(e -> e * e)
//				.collect(Collectors.summarizingDouble(e -> e));
//		System.out.println(collect2);
//
//		List<Integer> collect3 = nums.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
//		System.out.println(collect3);
//
//		List<Integer> collect4 = nums.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2"))
//				.map(Integer::valueOf).collect(Collectors.toList());
//		System.out.println(collect4);
//
//		Set<Integer> dup = new HashSet<Integer>();
//		Set<Integer> collect5 = nums.stream().filter(e -> !dup.add(e)).collect(Collectors.toSet());
//		System.out.println(collect5);
//
//		OptionalInt max = nums.stream().mapToInt(e -> e).max();
//		if (max.isPresent()) {
//			Integer i11 = max.getAsInt();
//			System.out.println(i11);
//		}
//		OptionalInt min = nums.stream().mapToInt(e -> e).min();
//		if (min.isPresent()) {
//			Integer i11 = min.getAsInt();
//			System.out.println(i11);
//		}
//		
//		Optional<Integer> max2 = nums.stream().max(Comparator.comparing(e->e));
//		if(max2.isPresent()) {
//			Integer i = max2.get();
//			System.out.println(i);
//		}

//		List<Integer> arr = Arrays.asList(1,11,5,20,55,32,6,98,5,55,88,2,3,4,5,6);
//		
//	
//		Integer integer = arr.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
//		System.out.println(integer);
//		
//		String sent = "I am learning streams API in java java";
//		String string = Arrays.stream(sent.split(" ")).max(Comparator.comparing(e->e.length())).get();
//	System.out.println(string);
//	
//	List<String> collect = Arrays.stream(sent.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(0).limit(3).collect(Collectors.toList());
//	System.out.println(collect);
//	
//	int length = Arrays.stream(sent.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).limit(1).findFirst().get().length();
//	System.out.println(length);
//	
//	Map<String, Long> collect2 = Arrays.stream(sent.split(" ")).collect(Collectors.groupingBy(x->x, Collectors.counting()));
//	System.out.println(collect2);

		String s = "I am learning Stream API in Java Java";

		Map<String, Long> collect = Arrays.stream(s.split(" "))
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(collect);
		Stream<String> stream = Arrays.stream(s.split(" "));
		Stream<String> sorted = stream.sorted(Comparator.comparing(String::length).reversed());
		String string = sorted.skip(1).findFirst().get();
		System.out.println(string);

		Optional<String> max = Arrays.stream(s.split(" ")).max(Comparator.comparing(e -> e.length()));
		if (max.isPresent()) {
			String s1 = max.get();
			System.out.println(s1);
		}

		Integer integer = Arrays.stream(s.split(" ")).map(e -> e.length()).sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();
		System.out.println(integer);

		String s2 = "dadadkdksbxcnmxnbcvhjbcnkm";
		Arrays.stream(s2.split("")).distinct().forEach(System.out::print);
		System.out.println();
		IntStream chars = s2.chars();
		Stream<Object> distinct = chars.distinct().mapToObj(e -> (char) e);
		distinct.forEach(System.out::print);

		System.out.println();
		Arrays.stream(s.split(" ")).filter(e -> e.replaceAll("[^aeiouAEIOU]", "").length() == 2)
				.forEach(System.out::println);

		// int[] arr = {};

		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Map<Boolean, List<Integer>> collect2 = arr.stream().collect(Collectors.partitioningBy(e -> e % 2 == 0));

		Set<Entry<Boolean, List<Integer>>> entrySet = collect2.entrySet();

		for (Map.Entry<Boolean, List<Integer>> mapEntry : entrySet) {
			if (Boolean.TRUE.equals(mapEntry.getKey())) {
				System.out.println("Even numbers are: " + mapEntry.getValue());
			} else {
				System.out.println("Odd numbers are: " + mapEntry.getValue());
			}
		}

		String word = "Mississippi";

		Map<String, Long> collect3 = Arrays.stream(word.split(""))
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(collect3);

		int[] arr1 = { 1, 2, 3, 4, 5, 6 };

		Arrays.stream(arr1).mapToObj(x -> x).sorted(Comparator.reverseOrder()).forEach(System.out::print);

		int[] arr2 = { 1, 22, 2, 22, 2, 22, 3, 5, 5, 5, 4, 6, 8, 88, 88, 88, 8 };

		System.out.println();
		int sum = Arrays.stream(arr2).distinct().sum();
		System.out.println(sum);

		String st = "Hello How are you??";
		String string2 = Arrays.stream(st.split("")).filter(c -> st.indexOf(c) == st.lastIndexOf(c)).skip(1).findFirst()
				.get();
		System.out.println(string2);

		Map<String, Long> collect4 = Arrays.stream(st.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		String character = collect4.entrySet().stream().filter(e -> e.getValue() == 1).map(m -> m.getKey()).findFirst()
				.get();
		System.out.println(character);

		Map<String, Long> collect5 = Arrays.stream(st.split("")).filter(c -> st.indexOf(c) != st.lastIndexOf(c))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		String string3 = collect5.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).findFirst()
				.get();
		System.out.println(string3);

		List<Integer> arrrr = Arrays.asList(1, 2, 3, 10, 11, 12, 21, 22, 23, 31, 32, 33);

		Map<Object, List<Integer>> collect6 = arrrr.stream()
				.collect(Collectors.groupingBy(e -> e / 10 * 10, LinkedHashMap::new, Collectors.toList()));
		System.out.println(collect6);

		String[] a1b2 = { "aaa", "666", "555", "133" };

		List<String> collect7 = Arrays.stream(a1b2).filter(x -> x.matches("[0-9]+")).collect(Collectors.toList());

		System.out.println(collect7);

		int asInt = Arrays.stream(arr2).skip(3).limit(3).reduce((a, b) -> a * b).getAsInt();
		System.out.println(asInt);

		List<String> list = Arrays.asList("Ravi", "ivar", "Mars", "Rams", "Sad", "Ads");
		Collection<List<String>> values = list.stream().collect(Collectors
				.groupingBy(x -> Arrays.stream(x.toLowerCase().split("")).sorted().collect(Collectors.toList())))
				.values();
		System.out.println(values);

		int[] ar = { 4, 5, 1, 9, 2, 2, 2 };
		int reduce = IntStream.range(0, ar.length).filter(x -> x % 2 != 0).map(x -> ar[x]).reduce(1, (a, b) -> a * b);

		System.out.println(reduce);

		IntStream.range(0, ar.length / 2).map(x -> ar[x] * ar[ar.length - 1 - x]).forEach(System.out::println);

		List<Integer> list1 = Arrays.asList(0, 2, 1, 5, 0, 2, 0);
		List<Integer> collect8 = list1.stream().filter(x -> x == 0).collect(Collectors.toList());
		List<Integer> collect9 = list1.stream().filter(x -> x != 0).collect(Collectors.toList());
		List<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(collect8);
		list2.addAll(collect9);
		System.out.println(list2);

		List<Integer> collect10 = list1.stream().collect(Collectors.partitioningBy(x -> x != 0)).values().stream()
				.flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(collect10);

		boolean noneMatch = list1.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())).values()
				.stream().noneMatch(x -> x > 1);
		System.out.println(noneMatch);

		String[] str = { "ewe", "rwe", "twe", "jjj", "iji" };
		List<String> str1 = Arrays.asList(str);
		Map<String, List<String>> collect11 = str1.stream()
				.collect(Collectors.groupingBy(x -> x.substring(1, 2), Collectors.toList()));
		System.out.println(collect11);

		int sum2 = list1.stream().mapToInt(x -> x).sum();
		System.out.println(sum2);

		List<String> places = Arrays.asList("Telangana", "Andhra", "Bangalore", "Jammu", "Chattisgarh", "Kolkata");
		List<String> collect12 = places.stream().sorted().collect(Collectors.toList());
		System.out.println(collect12);

		List<Integer> collect13 = list1.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(collect13);

		List<Integer> lll = Arrays.asList(1, 5, 3, 6, 4, 785, 25, 214, 521, 421, 45, 214, 21, 4521, 452, 14, 21, 42,
				145, 21, 4521, 42, 145, 214, 521, 452, 25, 525, 1, 4);
		List<Integer> collect14 = lll.stream().filter(x -> x % 2 != 0).distinct().sorted().collect(Collectors.toList());
		System.out.println(collect14);

		List<Integer> l1 = Arrays.asList(2, 5, 3, 9, 8, 7, 44, 5, 6, 8, 9, 2);
		Integer integer2 = l1.stream().sorted().distinct().skip(2).findFirst().get();
		System.out.println(integer2);

		List<String> ls = Arrays.asList("a1a1a", "a1d2ds154sd1xz", "d45df54d1x54sx1", "123", "12");
		List<String> collect15 = ls.stream().map(x -> x.replaceAll("[a-z]", "")).collect(Collectors.toList());
		System.out.println(collect15);

		List<String> series = Arrays.asList("Breaking Bad", "Game of thrones", "Prison Break", "Vikings");
		List<String> collect16 = series.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect16);

		List<Integer> avg = Arrays.asList(1, 2, 3, 6, 5, 4, 7, 8, 5);
		double asDouble = avg.stream().mapToInt(x -> x).average().getAsDouble();
		System.out.println(asDouble);

		List<Integer> ll1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> ll2 = Arrays.asList(3, 5);

		List<Integer> collect17 = ll1.stream().filter(x -> ll2.contains(x)).collect(Collectors.toList());
		System.out.println(collect17);

		Employe e1 = new Employe("Ravi", "Ravi@gmail.com");
		Employe e2 = new Employe("Prasad", "Prasad@gmail.com");
		Employe e3 = new Employe("Sahithi", "Sahithi@yahoo.com");
		Employe e4 = new Employe("Karthik", "Karthik@yahoo.com");

		List<Employe> emp = Arrays.asList(e1, e2, e3, e4);
		Map<String, Long> collect18 = emp.stream().map(x -> x.getEmail().substring(x.getEmail().indexOf("@")))
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(collect18);
		
		
		List<String> count = Arrays.asList("Apple", "Banana", "Cherry", "Blueberry", "Avakai", "Chinthakay", "dondakay", "dosakai");
		Map<Character, List<String>> collect19 = count.stream().map(x->x.toUpperCase()).collect(Collectors.groupingBy(x->x.charAt(0), Collectors.toList()));
	System.out.println(collect19);
	
	
	}

}
