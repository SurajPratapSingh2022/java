package com.sps.javaVersionUpdate;
//Comparable interface example
import java.util.ArrayList;
import java.util.Collections;
class Emp1 implements Comparable<Emp1> {
    int empid, salary;
    String ename;

    public Emp1(int empid, String ename, int salary) {
        this.empid = empid;
        this.ename = ename;
        this.salary = salary;
    }

    @Override
    //sort by salary increasing order
//    public int compareTo(Emp1 e) {
//        if (salary == e.salary)
//            return 0;
//        else if (salary > e.salary)
//            return 1;
//        else
//            return -1;
//    }
    //sort by alphabetical order
    public int compareTo(Emp1 e) {
    	return ename.compareTo(e.ename);
    }
}
    
public class JavaComparableInterfaceExample1 {
    public static void main(String[] args) {
        ArrayList<Emp1> elst = new ArrayList<>();
        elst.add(new Emp1(101, "Pankaj", 80000));
        elst.add(new Emp1(102, "Alok", 70000));
        elst.add(new Emp1(103, "Binu", 90000));
        elst.add(new Emp1(104, "Anshu", 85000));
        elst.add(new Emp1(105, "Joya", 75000));
        Collections.sort(elst);
        for (Emp1 e : elst) {
            System.out.println(e.empid + "\t" + e.ename + "\t" + e.salary);
        }
    }
}
