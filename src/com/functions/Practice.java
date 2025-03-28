package com.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {

		System.out.println("-------------------------Program 1---------------------------");
		String s = "I am learnig Streams API in java java";
		Map<Integer, List<String>> collect = Arrays.stream(s.split(" "))
				.collect(Collectors.groupingBy(x -> x.length(), Collectors.toList()));
		System.out.println(collect);

		System.out.println("-------------------------Program 2---------------------------");

		String string = Arrays.stream(s.split(" ")).max(Comparator.comparing(x -> x.length())).get();
		System.out.println(string);
		System.out.println("-------------------------Program 3---------------------------");

		String s1 = "dagadahnm";
		Arrays.stream(s1.split("")).distinct().forEach(System.out::print);
		System.out.println();

		s1.chars().distinct().mapToObj(x -> (char) x).forEach(System.out::print);
		System.out.println();
		System.out.println("-------------------------Program 4---------------------------");

		String string2 = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1)
				.limit(1).findFirst().get();
		System.out.println(string2);
		System.out.println("-------------------------Program 5---------------------------");

		Integer integer = Arrays.stream(s.split(" ")).map(x -> x.length()).sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();
		System.out.println(integer);
		System.out.println("-------------------------Program 6---------------------------");

		Map<String, Long> collect2 = Arrays.stream(s.split(" "))
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(collect2);

		System.out.println("-------------------------Program 7---------------------------");

		List<String> collect3 = Arrays.stream(s.split(" ")).filter(x -> x.replaceAll("[^aeiouAEIOU]", "").length() == 2)
				.collect(Collectors.toList());
		System.out.println(collect3);
		System.out.println("-------------------------Program 8---------------------------");

		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Map<Boolean, List<Integer>> collect4 = l.stream()
				.collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.toList()));
		Collection<List<Integer>> values = collect4.values();
		System.out.println(values);

		System.out.println("-------------------------Program 9---------------------------");

		String word = "Hey Hi How are you??";
		Map<String, Long> collect5 = Arrays.stream(word.split(""))
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(collect5);
		System.out.println("-------------------------Program 10---------------------------");

		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);
		arr.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
		System.out.println("-------------------------Program 11---------------------------");

		int sum = arr.stream().distinct().mapToInt(x -> x).sum();
		System.out.println(sum);
		System.out.println("-------------------------Program 12---------------------------");

		String str = "hello world";
		String string3 = Arrays.stream(str.split("")).filter(x -> str.indexOf(x) == str.lastIndexOf(x)).findFirst()
				.get();
		System.out.println(string3);

		System.out.println("-------------------------Program 13---------------------------");

		String string4 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(x -> x, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() > 1).map(x -> x.getKey()).findFirst().get();
		System.out.println(string4);

		System.out.println("-------------------------Program 14---------------------------");

		List<Integer> ll = Arrays.asList(1, 2, 3, 10, 11, 12, 20, 21, 22, 23, 30, 31, 32, 40, 41, 42, 43);
		LinkedHashMap<Integer, List<Integer>> collect6 = ll.stream()
				.collect(Collectors.groupingBy(x -> x / 10 * 10, LinkedHashMap::new, Collectors.toList()));
		System.out.println(collect6);
		System.out.println("-------------------------Program 15---------------------------");

		String[] str1 = { "aaa", "bbbb", "123", "456", "789" };
		Arrays.stream(str1).filter(x -> x.matches("[^0-9]+")).forEach(System.out::println);
		System.out.println("-------------------------Program 16---------------------------");

		int[] ar = { 12, 7, 89, 65, 23 };
		Integer integer2 = Arrays.stream(ar).boxed().collect(Collectors.toList()).stream().limit(2)
				.reduce((a, b) -> a * b).get();
		System.out.println(integer2);

		System.out.println("-------------------------Program 17---------------------------");

		List<String> list = Arrays.asList("Ravi", "ivar", "Mars", "Rams", "Sad", "Ads");
		Map<List<String>, List<String>> collect7 = list.stream()
				.collect(Collectors.groupingBy(
						x -> Arrays.stream(x.toUpperCase().split("")).sorted().collect(Collectors.toList()),
						LinkedHashMap::new, Collectors.toList()));
		System.out.println(collect7.values());

		System.out.println("-------------------------Program 18---------------------------");

		int[] ar1 = { 8, 56, 9, 2, 4, 7, 2, 11, 2 };
		int reduce = IntStream.range(0, ar1.length).filter(x -> x % 2 == 0).map(x -> ar1[x]).reduce(1, (a, b) -> a * b);
		System.out.println(reduce);

		System.out.println("-------------------------Program 19---------------------------");
		IntStream.range(0, ar1.length / 2).map(x -> ar1[x] * ar1[ar1.length - 1 - x]).forEach(System.out::println);

		System.out.println("-------------------------Program 19---------------------------");

		List<Integer> arrrr = Arrays.asList(5, 8, 6, 9, 0, 0, 0);
		List<Integer> collect8 = arrrr.stream().filter(x -> x == 0).collect(Collectors.toList());
		List<Integer> collect9 = arrrr.stream().filter(x -> x != 0).collect(Collectors.toList());

		List<Integer> lists = new ArrayList<Integer>();
		lists.addAll(collect8);
		lists.addAll(collect9);

		System.out.println(lists);

		Map<Boolean, List<Integer>> collect10 = arrrr.stream()
				.collect(Collectors.partitioningBy(x -> x != 0, Collectors.toList()));
		collect10.values().stream().flatMap(x -> x.stream()).collect(Collectors.toList()).forEach(System.out::println);

		Map<Integer, Long> collect11 = arrrr.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(collect11);

		boolean noneMatch = collect11.values().stream().anyMatch(x -> x > 1);
		System.out.println(noneMatch);

		String[] str3 = { "ewe", "rwe", "twe", "jjj", "iji" };

		Map<String, List<String>> collect12 = Arrays.stream(str3)
				.collect(Collectors.groupingBy(x -> x.substring(1, 2), Collectors.toList()));
		System.out.println(collect12);

		List<Integer> arrrr1 = Arrays.asList(5, 8, 6, 9, 0, 0, 0);

		int sum2 = arrrr1.stream().mapToInt(x -> x).sum();
		System.out.println(sum2);

		List<String> alpha = Arrays.asList("Apple", "Banana", "Cherry", "Avakai", "Chinthakay", "Beerakay", "Dondakay");

		List<String> collect13 = alpha.stream().sorted().collect(Collectors.toList());
		System.out.println(collect13);

		List<Integer> lint = Arrays.asList(1, 2, 3, 1, 5, 9, 10, 12, 4, 5, 6, 7);
		List<Integer> collect14 = lint.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(collect14);
		List<Integer> collect15 = lint.stream().distinct().filter(x -> x % 2 != 0).collect(Collectors.toList());

		System.out.println(collect15);

		Integer integer3 = lint.stream().sorted().distinct().skip(3).findFirst().get();
		System.out.println(integer3);

		List<String> lst = Arrays.asList("re8w645d1s2", "86wre54ds1", "fe645rd1", "dsf451c6sed45f1", "g5g515f21",
				"8469842", "12365");
		List<String> collect16 = lst.stream().map(x -> x.replaceAll("[a-zA-Z]", "")).collect(Collectors.toList());
		System.out.println(collect16);

		List<String> collect17 = lst.stream().filter(x -> x.matches("[0-9]+")).collect(Collectors.toList());
		System.out.println(collect17);

		List<String> lst1 = Arrays.asList("gvhbjnkm", "vbnmjbhv", "bvnbnmnkbjvh", "vnnkhughvbjh", "jbhvbnmjbhv");
		List<String> collect18 = lst1.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect18);

		List<Integer> lint1 = Arrays.asList(1, 2, 3, 6, 5, 4, 7, 8, 9, 5, 2, 3);
		double asDouble = lint1.stream().mapToInt(x -> x).average().getAsDouble();
		System.out.println(asDouble);

		System.out.println("------------- completed till 31 -----------");

		List<Integer> list1 = Arrays.asList(1, 2, 3, 6, 5, 4);
		List<Integer> list2 = Arrays.asList(11, 22, 3, 6, 55, 44);

		List<Integer> collect19 = list1.stream().filter(x -> list2.contains(x)).collect(Collectors.toList());
		System.out.println(collect19);

		Employe e1 = new Employe("Ravi", "Ravi@gmail.com");
		Employe e2 = new Employe("Prasad", "Prasad@gmail.com");
		Employe e3 = new Employe("Sahithi", "Sahithi@Yahoo.com");
		Employe e4 = new Employe("Karthik", "Karthik@rediff.com");

		List<Employe> lemp = Arrays.asList(e1, e2, e3, e4);
		Map<String, Long> collect20 = lemp.stream().map(x -> x.getEmail().substring(x.getEmail().indexOf("@")))
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(collect20);
		
		List<String> alpha1 = Arrays.asList("Apple", "Banana", "Cherry", "Avakai", "Chinthakay", "Beerakay", "Dondakay");          
		Map<Character, Long> collect21 = alpha1.stream().collect(Collectors.groupingBy(x->x.charAt(0), Collectors.counting()));
		System.out.println(collect21);
		
		List<Integer> inter = Arrays.asList(1,2,3,4,5,6);
		List<Integer> inter1 = Arrays.asList(7,8,9,4,5,6);
		
		List<Integer> collect22 = inter.stream().filter(x->inter1.contains(x)).collect(Collectors.toList());
		System.out.println(collect22);
		
		
		Map<String, Long> collect23 = lemp.stream().map(x->x.getEmail()).collect(Collectors.groupingBy(x->x.substring(x.indexOf("@")), Collectors.counting()));
		System.out.println(collect23);
		
		
		Map<String, List<Employe>> collect24 = lemp.stream().collect(Collectors.groupingBy(x->x.getName(), Collectors.toList()));
		collect24.forEach((k,v)->System.out.println(k + " " + v));
		
		List<Integer> lmul = Arrays.asList(1,2,3,4,5);
		int reduce2 = lmul.stream().mapToInt(x->x).reduce(1,(a,b)->a*b);
		System.out.println(reduce2);
		
//		Stream<String> stream = alpha1.stream();
//		stream.forEach(System.out::println);
//		long count = stream.count();
//		System.out.println(count);
		
		ProductList pl1 = new ProductList("Nike", "Air Jordans", 1890.00);
		ProductList pl2 = new ProductList("Puma", "Foam V3", 1500.00);
		ProductList pl3 = new ProductList("Adidas", "Running Shoes", 2000.00);
		
		List<ProductList> lp= Arrays.asList(pl1, pl2, pl3);
		
		List<ProductList> collect26 = lp.stream().filter(p->p.getProductPrice()<2000).collect(Collectors.toList());
		System.out.println(collect26);
		List<ProductList> collect25 = lp.stream().map(
				product->{
					Double discountedPrice = product.getProductPrice()*0.80;
					product.setProductPrice(discountedPrice);
					return product;
				}
				).collect(Collectors.toList());
		System.out.println(collect25);
		double asDouble2 = lp.stream().mapToDouble(p->p.getProductPrice()).average().getAsDouble();
		System.out.println(asDouble2);
		
		Optional<ProductList> min = lp.stream().min(Comparator.comparing(p->p.getProductPrice()));
		if(min.isPresent()) {
			ProductList pp = min.get();
			System.out.println(pp);
		}
		
		
		
		List<Integer> lwith1 = Arrays.asList(1,2,11,14,2,3,6,5,8,7,1123,152,984,152,15,2);
		
		List<String> collect27 = lwith1.stream().map(x->String.valueOf(x)).filter(x->x.startsWith("1")).distinct().sorted().collect(Collectors.toList());
		System.out.println(collect27);
	}

}
