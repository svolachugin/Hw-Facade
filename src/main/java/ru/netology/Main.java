package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String arg0 = "101101";
        String arg1 = "110111";

        System.out.println(bins.sum(arg0, arg1));
        System.out.println(bins.mult(arg0, arg1));
    }
}