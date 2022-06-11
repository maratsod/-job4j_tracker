package oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl = sum(5);
        int rsl2 = minus(10);
        int rsl3 = calculator.multiply(5);
        int rsl4 = calculator.divide(5);
        int rsl5 = calculator.sumAllOperation(5);

        System.out.println(rsl);
        System.out.println(rsl2);
        System.out.println(rsl3);
        System.out.println(rsl4);
        System.out.println(rsl5);
    }
}
