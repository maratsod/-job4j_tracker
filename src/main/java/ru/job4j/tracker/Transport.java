package ru.job4j.tracker;

public interface Transport {
    String drive();

    int passengers(int passengers);

    int fillUp(int litres);
}
