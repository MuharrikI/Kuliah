package Praktikum;

import java.util.Scanner;

public class ConverterMain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan: ");
        String huruf = in.nextLine();
        in.close();
        String pisah = " ";
        String[] out = huruf.split(pisah);
        for (int i = 0; i < out.length; i++) {
            out[i].toLowerCase();
        }
        ConverterSistem ubah = new ConverterSistem(out);

    }

}
