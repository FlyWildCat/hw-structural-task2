package ru.pda;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int arg1 = Integer.parseInt(a);
        int arg2 = Integer.parseInt(b);

        return Integer.toBinaryString(arg1 + arg2);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int arg1 = Integer.parseInt(a);
        int arg2 = Integer.parseInt(b);

        return Integer.toBinaryString(arg1 * arg2);
    }
}
