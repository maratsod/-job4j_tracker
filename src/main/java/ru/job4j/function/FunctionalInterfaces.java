package ru.job4j.function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        List<String> list = List.of("one", "two", "three", "four", "five", "six", "seven");
        BiConsumer<Integer, String> biCon = map::put;
        int count = 1;
        for (String s : list) {
            biCon.accept(count++, s);
        }
        for (int i : map.keySet()) {
            System.out.println(i + " - " + map.get(i));
        }

        BiPredicate<Integer, String> biPred = (index, s)
                -> index % 2 == 0 || map.get(index).length() == 4;
        for (Integer i : map.keySet()) {
            if (biPred.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }

        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        List<String> strings = sup.get();
        for (String s : strings) {
            System.out.println(s);
        }

        Consumer<String> con = System.out::println;
        Function<String, String> func = String::toUpperCase;
        for (String s : strings) {
            con.accept(func.apply(s));
        }
    }
}
