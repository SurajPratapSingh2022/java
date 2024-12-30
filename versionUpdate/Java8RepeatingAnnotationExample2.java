package com.sps.javaVersionUpdate;
//Repeatable annotation example for multi valued
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Employees.class)
@interface Employee2 {
    String name();
    int salary();
}
@Retention(RetentionPolicy.RUNTIME)
@interface Employees {
    Employee2[] value();
}
@Employee2(name = "Anuj", salary = 50000)
@Employee2(name = "Kamal", salary = 80000)
@Employee2(name = "Anshu", salary = 40000)
@Employee2(name = "Komal", salary = 90000)
public class Java8RepeatingAnnotationExample2 {   // Corrected class name
    public static void main(String[] args) {
        Employee2[] obj = Java8RepeatingAnnotationExample2.class.getAnnotationsByType(Employee2.class);  // Corrected class name
        for (Employee2 e : obj) {
            System.out.println(e.name() + "\t" + e.salary());
        }
    }
}
