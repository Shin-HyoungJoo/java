package com.green.java.ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int) (Math.random() * 100) + 2;

        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());

        Consumer<Integer> c = i -> System.out.println(i);
        Consumer<Integer> c1 = System.out::println; //위와 같은 동작을 한다

        c.accept(55);

        Integer n1 = 10;
        int n2 = n1;
        n1 = n2;

        int val = 9;
        Predicate<Integer> p1 = i -> i > 10;
        System.out.printf("%d > 10 : %b\n", val, p1.test(val));

        Function<Double, Integer> fn1 = i -> i.intValue();

        System.out.println(fn1.apply((10.5)));
    }
}
