package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] scr = left.split("\\.");
        String[] dstn = right.split("\\.");
        int scrFir = Integer.parseInt(scr[0]);
        int dstnFir = Integer.parseInt(dstn[0]);
        return Integer.compare(scrFir, dstnFir);
    }
}