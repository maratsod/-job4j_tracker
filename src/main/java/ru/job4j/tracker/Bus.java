package ru.job4j.tracker;

public class Bus implements Transport {
    @Override
    public String drive() {
        return "I'm driving";
    }

    @Override
    public int passengers(int passengers) {
        return 10;
    }

    @Override
    public int fillUp(int litres) {
        return litres * 10;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        String res = bus.drive();
        int pass = bus.passengers(10);
        int price = bus.fillUp(10);
        System.out.println(res + " " + pass + " " + price);
    }
}
