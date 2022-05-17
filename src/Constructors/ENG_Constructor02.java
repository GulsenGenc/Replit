package Constructors;

import java.util.Scanner;

public class ENG_Constructor02 {
    public static void main(String[] args) {
        /*
        Create a student's variables in the main method and
        use this assign variables create a method named Changename,
        student as parameter get the information and change all the information in the method and
         add the new information have it print
         The line where we call the Rename method in the Main
          method is immediately then reprint student information Create a method named changesurname,
          this method is "lastname" as parameter get the variable.
        In the method, ask the user to enter a new last name and change the old last name (i.e. can).
         */

        /*
         * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
         * variable’lara atama yapin
         *
         * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
         * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni bilgileri
         * yazdirsin
         *
         * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
         * sonrasinda yeniden ogrenci bilgilerini yazdirin
         *
         * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak "soyisim"
         * variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini istesin ve
         * eski soyismi degistirsin.
         *

         */

        String isim="gülşen";
        String soyisim="genç";
        isimDegistir(isim,soyisim);
        System.out.print(isim+" "+soyisim);
        System.out.println(" ");
        soyisim=soyisimDegıstır(soyisim);
        System.out.print(isim+" "+soyisim);

    }

    private static void isimDegistir(String isim, String soyisim) {
        isim="feyza";
        soyisim="tuncer";
        System.out.print(isim+" "+soyisim);
    }
    private static String soyisimDegıstır(String soyisim) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yenı soyisminizi giriniz : ");
        String yenıSoyIsım=scan.nextLine();

        soyisim=yenıSoyIsım;
        return yenıSoyIsım;
    }
}
