package com.sps.javaVersionUpdate;

//print message from general method
//interface task{
//	public void msg();
//}
//class dhananjay implements task{
//	public void msg() {
//		System.out.println("this method is defined by dhananjay");
//	}
//}
//public class LambdaExpressionExample2 {
//	public static void main(String[] args) {
//		dhananjay obj=new dhananjay();
//		obj.msg();
//	}
//}


//print message from lambda expression
interface task1{
	public void msg();
}
public class Java8LambdaExpressionExample3 {
	public static void main(String[] args) {
		task1 obj=()->System.out.println("Developed by Dhananjay");
		obj.msg();
	}
}
