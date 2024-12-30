package com.sps.javaVersionUpdate;
//java 12: Switch Update
//multiple label in switch block
public class Java12SwitchExample1 {
	public static void main(String[] args) {
		String day="Sat";
		String r=switch(day) {
		case "Mon","Tue","Wed","Thu","Fri"->"Working Day";
		case "Sat","Sun"->"Non Working Day";
		default->"Invalid Day Name";
		};
		System.out.println(r);
	}
}
