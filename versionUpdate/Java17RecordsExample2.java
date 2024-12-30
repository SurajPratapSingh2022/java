package com.sps.javaVersionUpdate;
//java 17: example of record
public record Person2(int pid, String pname, int page, String paddr) {
	//when compiling then it auto create Person2.class file in which we have all the needed property
}
public class Java17RecordsExample2 {
	public static void main(String[] args) {
		Person1 p=new Person1(101,"Anuj",21,"Patna");
//		System.out.println(p);
		System.out.println(p.getPaddr());
		System.out.println(p.getPage());
		System.out.println(p.getPid());
		System.out.println(p.getPname());
	}
}
