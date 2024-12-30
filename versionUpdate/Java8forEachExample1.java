package com.sps.javaVersionUpdate;
//example of forEach loop
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Java8forEachExample1 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(10, 20, 30, 40, 50);
//        Consumer<Integer> obj = new Consumer<Integer>() {
//            public void accept(Integer n) {
//                System.out.print(n+" ");
//            }
//        };
        //using lambda function
//        Consumer<Integer> obj=(Integer n)->{
//        	System.out.print(n+" ");
//        };
        
//        Consumer<Integer> obj=(Integer n)->System.out.print(n+" ");
//        lst.forEach(obj);
        
        lst.forEach((Integer n)->System.out.print(n+" "));
    }
}
