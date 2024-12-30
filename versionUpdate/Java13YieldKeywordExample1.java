package com.sps.javaVersionUpdate;
//java 13: yield keyword example
public class Java13YieldKeywordExample1 {
	public static void main(String[] args) {
		int a=10,b=2,c;
		String ch,r;
		ch="add";
//		c=switch(ch) {
//		case "add"->a+b;
//		case "sub"->a-b;
//		case "mul"->a*b;
//		case "div"->a/b;
//		default->-1;
//		};
		r=switch(ch) {
		case "add"->
		{
			c=a+b;
			yield "Sum= "+c;
		}
		case "sub"->{c=a-b; yield "Sub= "+c;}
		case "mul"->{c=a*b; yield "Mul= "+c;}
		case "div"->{c=a/b; yield "Div= "+c;}
		default->{yield "Invalid Choice";}
		};
		System.out.println(r);
	}
}
