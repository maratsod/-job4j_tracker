package ru.job4j.oop;

public class Error {
    private int er;
    private int r;
    private String or;

    public Error() {

    }

    public Error(int er, int r, String or) {
        this.er = er;
        this.r = r;
        this.or = or;
    }

    public void printError() {
        System.out.println("Много мониторов: " + er);
        System.out.println("SSD: " + r + " GB");
        System.out.println("Модель CPU: " + or);
    }

    public static void main(String[] args) {
        Error err = new Error();
        Error orr = new Error(1, 2, "no");
        err.printError();
        orr.printError();
    }
}


