package List;

import java.util.ArrayList;
import java.util.List;

public class ENG_List_05 {
    public static void main(String[] args) {
        /*
        Write a program that accepts an integer as input and prints first 10 prime numbers greater
        than input Check numbers if they are even or not in a return method.
         -->girilen inputtan sonrakı ilk 10 asal sayıyı dönduren methodu create et.
        Input : 5
        Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
         */
        List<Integer> istenen = new ArrayList<>();
        int sayac = 0;

        for (int i = 5; i < 50; i++) {
            boolean asal = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                }
            }
            if (asal == true) {
                if (i == 5) {
                    continue;
                } else {
                    istenen.add(i);
                    sayac++;
                }

            }
            if (sayac == 10) {
                break;
            }
        }
        System.out.println(istenen);

    }
}
