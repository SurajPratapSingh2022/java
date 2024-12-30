package com.sps.javaVersionUpdate;
//example of pojo i.e. prequisite of record in java
class Person1{
	int pid, page;
	String pname, paddr;
	public Person1(int pid, String pname, int page, String paddr) {
		this.pid=pid;
		this.pname=pname;
		this.page=page;
		this.paddr=paddr;
	}
	@Override
	public String toString() {
		return "Person1 [pid=" + pid + ", page=" + page + ", pname=" + pname + ", paddr=" + paddr + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddr() {
		return paddr;
	}
	public void setPaddr(String paddr) {
		this.paddr = paddr;
	}
}

public class Java17RecordsExample1 {
	public static void main(String[] args) {
		Person1 p=new Person1(101,"Anuj",21,"Patna");
//		System.out.println(p);
		System.out.println(p.getPaddr());
		System.out.println(p.getPage());
		System.out.println(p.getPid());
		System.out.println(p.getPname());
	}
}
