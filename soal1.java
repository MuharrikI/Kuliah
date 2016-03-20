
import java.util.*;

public class soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String huruf = input.next();
        String[] letak = {"TFAD", "KPE", "NXY", "VZB", "CGU", "HMO", "QRS", "WLJI"};

        for (int i = 0; i < huruf.length(); i++) {
            int hitung = 2;
            for (int j = 0; j < letak.length; j++) {

                for (int k = 0; k < letak[j].length(); k++) {

                    if (huruf.charAt(i) == letak[j].charAt(k)) {

                        for (int l = 0; l <= k; l++) {

                            System.out.print(hitung);
                        }
                        System.out.print(" ");

                    }
                }
                hitung++;
            }
        }

    }

}
