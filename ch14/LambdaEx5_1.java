package com.green.java.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5_1 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1;
        Consumer<Integer> c = i -> System.out.print(i + ", ");
        Predicate<Integer> p = i -> i % 2 == 0;
        Function<Integer, Integer> f = i -> i / 10 * 10;    //<매개타입,리턴타입>
        System.out.println(f.apply(1));

        List<Integer> list = new ArrayList<>();

        makeRandomList(s, list);
        System.out.println(list);
        printEvenNum(p, c, list);
        System.out.println();

        List<Integer> newList = doSomething(f, list);
        List<Integer> newList1 = doSomething2(f, list);

        System.out.println(newList);
        System.out.println(newList1);
    }

    private static List<Integer> doSomething(Function<Integer, Integer> f, List<Integer> list) {
        List<Integer> list1 = new ArrayList<>();

//        for (int i = 0; i < list.size(); i++) {
//            list1.add(f.apply(list.get(i)));
//        }

        for (Integer val : list) {
            list1.add(f.apply(val));
        }

        return list1;
    }

    private static <T> List<T> doSomething2(Function<T, T> f, List<T> list) {
        return list.stream().map(f).toList();
    }

    private static void printEvenNum(Predicate<Integer> p, Consumer<Integer> c, List<Integer> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (p.test(list.get(i)) == true) {
                c.accept(list.get(i));
            }
        }
        System.out.print("]");
    }

    private static void makeRandomList(Supplier<Integer> s, List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get());
        }
    }
}
