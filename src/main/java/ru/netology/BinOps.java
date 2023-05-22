package ru.netology;

public class BinOps {

    public String sum(String arg0, String arg1) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int argInt0 = Integer.parseInt(arg0, 2);
        int argInt1 = Integer.parseInt(arg1, 2);
        int argIntSum = argInt0 + argInt1;
        return Integer.toBinaryString(argIntSum);
    }

    public String mult(String arg0, String arg1) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int argInt0 = Integer.parseInt(arg0, 2);
        int argInt1 = Integer.parseInt(arg1, 2);
        int argIntMult = argInt0 * argInt1;
        return Integer.toBinaryString(argIntMult);
    }
}