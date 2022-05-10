package Method_Array;

import java.util.Arrays;

public class ENG_Method_Array_03 {
    public static void main(String[] args) {
        /*
        Write a method which accepts a String as parameter and
        prints the sum of the digits, present in the given string.
        -->Bir String'i parametre olarak kabul eden ve
         verilen string'de bulunan rakamların toplamını yazdıran bir metot yazın.
         */
    /*Bir String'i parametre olarak kabul eden ve verilen string'de bulunan rakamların toplamını yazdıran bir metot yazın.
    girdi: ade1r4d3
    çıktı: 8*/

            String str="ade1r4d3";
            String arr[]= str.replaceAll("\\D","").split("");
            System.out.println(Arrays.toString(arr));
            int toplam=0;
            for (int i = 0; i <arr.length ; i++) {
                toplam+=Integer.parseInt(arr[i]);
            }
            System.out.println(toplam);
       /* for(int i=0; i<arr.length; i++){
            if (Character.isDigit(arr[i].charAt(0))){
                toplam+=Integer.valueOf(arr[i]);
            }
        }
        System.out.println("string ifadenin sayi degerleri toplami : "+toplam);*/

        }
}
