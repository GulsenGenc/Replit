package For_while;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

char ch1= 'a' ;

	String name =“John came late"

	Expected Output:


Number of a = 2
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir kelıme gırınız");
        String kelime=scan.next();
        System.out.println("bir harf giriniz");
        char harf=scan.next().charAt(0);
        int sayac=0;

        for (int i = 0; i <kelime.length() ; i++) {
            if (kelime.charAt(i)==harf){
                sayac++;
            }
        }
        System.out.println("kelime içerisinde harf "+sayac+" adet vardır.");



    }
}
