package com.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class Details {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));

		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));

		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));

		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));

		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));

		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));

		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandrum", 2015));

		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

//		Optional<Employee> collect = empList.stream()
//				.collect(Collectors.maxBy(Comparator.comparing(emp -> emp.getAge())));
//		if (collect.isPresent()) {
//			Employee e = collect.get();
//			System.out.println(e);
//		}
//
//		System.out.println("------------------------------------------------------------------------");
//
//		Map<String, List<Employee>> collect3 = empList.stream().collect(Collectors.groupingBy(emp -> emp.getCity()));
//		System.out.println(collect3);
//
//		System.out.println("------------------------------------------------------------------------");
//
//		Map<String, Long> collect2 = empList.stream()
//				.collect(Collectors.groupingBy(emp -> emp.getCity(), Collectors.counting()));
//		System.out.println(collect2);
//
//		System.out.println("------------------------------------------------------------------------");
//
//		Map<Integer, List<Employee>> collect4 = empList.stream().collect(Collectors.groupingBy(emp -> emp.getAge()));
//		System.out.println(collect4);
//
//		System.out.println("------------------------------------------------------------------------");
//
//		Map<String, Long> collect5 = empList.stream()
//				.collect(Collectors.groupingBy(emp -> emp.getGender(), Collectors.counting()));
//		System.out.println(collect5);
//
//		System.out.println("------------------------------------------------------------------------");
//
//		empList.stream().map(emp -> emp.getDeptName()).distinct().forEach(System.out::println);
//
//		System.out.println("------------------------------------------------------------------------");
//
//		Map<Integer, List<Employee>> collect6 = empList.stream().filter(emp -> emp.getAge() > 28)
//				.collect(Collectors.groupingBy(emp -> emp.getAge()));
//		System.out.println(collect6);
//
//		System.out.println("------------------------------------------------------------------------");
//
//		Optional<Employee> collect7 = empList.stream()
//				.collect(Collectors.maxBy(Comparator.comparingInt(emp -> emp.getAge())));
//		if (collect7.isPresent()) {
//			Employee e = collect7.get();
//			System.out.println(e);
//		}
//
//		System.out.println("---------------------------mxxxxxx---------------------------------------------");
//
//		OptionalInt max = empList.stream().mapToInt(emp -> emp.getAge()).max();
//		if (max.isPresent()) {
//			Integer i = max.getAsInt();
//			System.out.println(i);
//		}
//
//		System.out.println("------------------------------------------------------------------------");
//
//		Map<String, Double> collect8 = empList.stream().collect(
//				Collectors.groupingBy(emp -> emp.getGender(), Collectors.averagingDouble(emp -> emp.getAge())));
//		System.out.println(collect8);
//
//		System.out.println("------------------------------------------------------------------------");
//
//		Double collect9 = empList.stream().collect(Collectors.averagingDouble(emp -> emp.getSalary()));
//		System.out.println(collect9);
//
//		System.out.println("------------------------------------------------------------------------");
//
//		Map<String, Long> collect10 = empList.stream()
//				.collect(Collectors.groupingBy(emp -> emp.getDeptName(), Collectors.counting()));
//		System.out.println(collect10);
//
//		System.out.println("------------------------------------------------------------------------");
//
//		Optional<Employee> collect11 = empList.stream()
//				.collect(Collectors.maxBy(Comparator.comparingInt(emp -> emp.getAge())));
//		if (collect11.isPresent()) {
//			Employee e = collect11.get();
//			System.out.println(e);
//		}
//
//		System.out.println("------------------------------------------------------------------------");
//
//		Optional<Employee> collect12 = empList.stream().filter(emp -> emp.getGender().equals("F"))
//				.collect(Collectors.minBy(Comparator.comparingInt(emp -> emp.getAge())));
//		if (collect12.isPresent()) {
//			Employee e = collect12.get();
//			System.out.println(e);
//		}
//
//		System.out.println("------------------------------------------------------------------------");
//
//		Optional<Employee> max2 = empList.stream().max(Comparator.comparing(emp -> emp.getAge()));
//		if (max2.isPresent()) {
//			Employee e = max2.get();
//			System.out.println(e);
//		}
//
//		System.out.println("------------------------------------------------------------------------");
//
//		Optional<Employee> min = empList.stream().filter(emp -> emp.getGender().equals("F"))
//				.min(Comparator.comparing(emp -> emp.getAge()));
//		if (min.isPresent()) {
//			Employee e = min.get();
//			System.out.println(e);
//		}
//
//		System.out.println("------------------------------------------------------------------------");
//
//		Map<Boolean, List<Employee>> collect13 = empList.stream()
//				.collect(Collectors.partitioningBy(emp -> emp.getAge() > 30));
//
//		Set<Map.Entry<Boolean, List<Employee>>> entrySet = collect13.entrySet();
//
//		for (Map.Entry<Boolean, List<Employee>> entry : entrySet) {
//			if (Boolean.TRUE.equals(entry.getKey())) {
//				System.out.println("Empployees whose age is greater than 30" + entry.getValue());
//			}
//
//			else {
//				System.out.println("Empployees whose age is less than 30" + entry.getValue());
//			}
//		}
//
//		System.out.println("------------------------------------------------------------------------");
//
//		Map<String, Long> collect14 = empList.stream()
//				.collect(Collectors.groupingBy(emp -> emp.getDeptName(), Collectors.counting()));
//
//		Set<Map.Entry<String, Long>> entrySet2 = collect14.entrySet();
//
//		Map.Entry<String, Long> entry = entrySet2.stream().max(Map.Entry.comparingByValue()).get();
//		System.out.println("Max number of employees in a department is " + entry.getKey());
//
//		System.out.println("------------------------------------------------------------------------");
//
//		Map<String, List<Employee>> collect15 = empList.stream().filter(emp -> emp.getDeptName().equals("HR"))
//				.collect(Collectors.groupingBy(emp -> emp.getDeptName()));
//		System.out.println(collect15);
//
//		List<Employee> collect16 = empList.stream().filter(x -> x.getSalary() > 150)
//				.peek(x -> x.setSalary(x.getSalary() + 100)).collect(Collectors.toList());
//		System.out.println(collect16);
//
//		Map<String, Double> collect17 = empList.stream()
//				.collect(Collectors.groupingBy(x -> x.getDeptName(), Collectors.averagingDouble(x -> x.getSalary())));
//		System.out.println(collect17);
//
//		Map<String, Long> collect18 = empList.stream()
//				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
//		System.out.println(collect18);
//		
//		
//		List<Employee> collect19 = empList.stream().filter(x->x.getSalary()>130).peek(x->x.setSalary(x.getSalary()+100)).collect(Collectors.toList());
//	System.out.println(collect19);
//	
//	List<Integer> lint = Arrays.asList(11,25,85,115,14,87,183,387,15,1,51,55412);
//	List<Integer> collect20 = lint.stream().distinct().filter(x->String.valueOf(x).startsWith("1")).sorted().collect(Collectors.toList());
//	System.out.println(collect20);
//	empList.stream().sorted(Comparator.comparing(Employee::getId).reversed()).collect(Collectors.toList()).forEach(System.out::println);

		Map<String, List<Employee>> collect = empList.stream()
				.collect(Collectors.groupingBy(x -> x.getCity(), Collectors.toList()));
		System.out.println(collect);
		Map<Integer, List<Employee>> collect2 = empList.stream()
				.collect(Collectors.groupingBy(x -> x.getAge(), Collectors.toList()));
		System.out.println(collect2);
		Map<String, Long> collect3 = empList.stream()
				.collect(Collectors.groupingBy(x -> x.getGender(), Collectors.counting()));
		System.out.println(collect3);
		List<String> collect4 = empList.stream().map(x -> x.getDeptName()).distinct().collect(Collectors.toList());
		System.out.println(collect4);
		Map<Integer, List<Employee>> collect5 = empList.stream().filter(x -> x.getAge() > 28)
				.collect(Collectors.groupingBy(x -> x.getAge(), Collectors.toList()));
		System.out.println(collect5);
		int asInt = empList.stream().mapToInt(x -> x.getAge()).max().getAsInt();
		System.out.println(asInt);
		Map<String, Double> collect6 = empList.stream()
				.collect(Collectors.groupingBy(x -> x.getGender(), Collectors.averagingDouble(x -> x.getAge())));
		System.out.println(collect6);
		Map<String, Long> collect7 = empList.stream()
				.collect(Collectors.groupingBy(x -> x.getDeptName(), Collectors.counting()));
		System.out.println(collect7);
		Employee oldestEmployee = empList.stream().max(Comparator.comparing(x -> x.getAge())).get();
		System.out.println("Oldest Employee =" + oldestEmployee);
		Employee youngestFemaleEmployee = empList.stream().filter(x -> x.getGender().equals("F"))
				.min(Comparator.comparing(x -> x.getAge())).get();
		System.out.println("Youngest Employee=" + youngestFemaleEmployee);
		Map<Boolean, List<Employee>> collect8 = empList.stream()
				.collect(Collectors.groupingBy(x -> x.getAge() > 30, Collectors.toList()));
		Set<Entry<Boolean, List<Employee>>> entrySet = collect8.entrySet();
		for (Entry<Boolean, List<Employee>> entry : entrySet) {
			if (entry.getKey().equals(true)) {
				System.out.println("Employee age greather than 30 are :" + entry.getValue());
			} else {
				System.out.println("Employee age less than 30 are :" + entry.getValue());
			}
		}
		List<Employee> list = collect8.get(true);
		System.out.println(list);
		Set<Boolean> keySet = collect8.keySet();
		Collection<List<Employee>> values = collect8.values();
		Set<Entry<Boolean, List<Employee>>> entrySet2 = collect8.entrySet();

		Map<String, Long> collect9 = empList.stream()
				.collect(Collectors.groupingBy(x -> x.getDeptName(), Collectors.counting()));
		Entry<String, Long> entry = collect9.entrySet().stream().max(Comparator.comparing(x -> x.getValue())).get();
		System.out.println(entry);

		Employee employee = empList.stream().filter(x -> x.getDeptName().equalsIgnoreCase("HR")).findAny().get();
		System.out.println(employee);

		Map<String, Long> collect10 = empList.stream()
				.collect(Collectors.groupingBy(x -> x.getDeptName(), Collectors.counting()));
		Set<Entry<String, Long>> entrySet3 = collect10.entrySet();
		for (Entry<String, Long> entry1 : entrySet3) {
			if (entry1.getValue() > 3) {
				System.out.println("department with more than 3 employee is :" + entry1.getKey());
			}
		}

		List<String> collect11 = empList.stream().map(x -> x.getDeptName()).distinct().collect(Collectors.toList());
		System.out.println(collect11);
		
		Long collect12 = empList.stream().collect(Collectors.counting());
		System.out.println("number of employees in the organization is :" + collect12);
		
		Map<String, Long> collect13 = empList.stream().collect(Collectors.groupingBy(x->x.getDeptName(), Collectors.counting()));
		System.out.println(collect13);
		
		Entry<String, Long> entry2 = collect13.entrySet().stream().max(Comparator.comparing(x->x.getValue())).get();
		System.out.println("department with highest number of employee is : " + entry2.getKey());
		
		 empList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge)).collect(Collectors.toList());
	}

}
