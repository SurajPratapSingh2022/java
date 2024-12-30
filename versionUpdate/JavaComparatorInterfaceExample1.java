package com.sps.javaVersionUpdate;
//comparator interface example
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student1{
	int rn, age;
	String name;
	public Student1(int rn, String name, int age) {
		this.rn=rn;
		this.name=name;
		this.age=age;
	}
}
/*
class SortByAge implements Comparator<Student1>{
	@Override
	public int compare(Student1 a,Student1 b) {
//		return a.age-b.age;
		return Integer.compare(a.age, b.age);
	}
}*/
class SortByName implements Comparator<Student1>{
	@Override
	public int compare(Student1 a, Student1 b) {
		return a.name.compareTo(b.name);
	}
}
public class JavaComparatorInterfaceExample1 {
	public static void main(String[] args) {
		ArrayList<Student1> stu=new ArrayList<>();
		stu.add(new Student1(101,"Manoj",22));
		stu.add(new Student1(102,"Anshu",12));
		stu.add(new Student1(103,"Chandu",10));
		stu.add(new Student1(104,"Beenu",35));
		stu.add(new Student1(105,"Saroj",20));
//		Collections.sort(stu,new SortByAge());
		Collections.sort(stu,new SortByName());
		for(Student1 s:stu) {
			System.out.println(s.rn+"\t"+s.name+"\t"+s.age);
		}
	}
}
