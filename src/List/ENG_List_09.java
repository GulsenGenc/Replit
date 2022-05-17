package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ENG_List_09 {
    public static void main(String[] args) {
        /*
        Write a Java program to get a String from user as input and
        find the maximum occurring character in that string.(Ignore case sensitivity).

        Input : Learning java is easy

        Output: maximum occurring character is : a
          -->Kullanıcıdan girdi olarak bir String almak için bir Java programı yazın ve
         bu string ifadedeki maksimum karakteri(en cok kullanılan) bulun. (Büyük/küçük harf duyarlılığını yoksay)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir string ifade gırınız");
        String str = scan.nextLine();

        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));

        int sayac = 1;
        int maxElemanınSayacı = 0;
        String enCokTekrarEdenKrakter = "";


        System.out.println("metinde en çok tekrar eden karakter:"+enCokTekrarEdenKrakter);
    }
}
