package com.functions;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class User {
	
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	};
	
//	public static void main(String[] args) {
//		
//		Date date = new Date();
//		System.out.println(date);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
//		String format = sdf.format(date);
//		System.out.println(format);
//		
//		LocalDate l = LocalDate.now();
//		System.out.println(l);
//		l = l.plusDays(10);
//		System.out.println(l);
//		LocalDate l1 = l.plusWeeks(1);
//        System.out.println(l);
//		LocalTime t = LocalTime.now();
//		System.out.println(t);
//		t= t.plusHours(10);
//		System.out.println(t);
//		LocalTime t1= t.plusMinutes(50);
//		System.out.println(t);
//		LocalDateTime ldt= LocalDateTime.now();
//		System.out.println(ldt);
//		
//		Period period = Period.between(l, l1);
//		System.out.println(period);
//		
//		boolean leapYear = LocalDate.parse("2022-01-02").isLeapYear();
//		if(leapYear) {
//			System.out.println("2022 is a leap year");
//		} else {
//			System.out.println("2022 is not a leap year");
//		}
//		
//		Duration dur = Duration.between(t,t1);
//		System.out.println(dur);
//		
//		
//		LocalTime lT= LocalTime.now();
//		System.out.println(lT);
//	}

}
