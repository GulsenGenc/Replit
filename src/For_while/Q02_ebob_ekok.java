package For_while;

import java.util.Scanner;

public class Q02_ebob_ekok {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 tamsayı girmesini ve
        ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
Input :
30
40
Beklenen Cikti:
30 ve 40 icin GCD = 10
30 ve 40 icin LCM = 120
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("iki tam sayı giriniz");
        int sayı1=scan.nextInt();
        int sayı2=scan.nextInt();

        int ebob=0;
        int ekok=0;
        for (int i = 1; i <=sayı1 ; i++) {
            if (sayı1%i==0 && sayı2%i==0){
                ebob=i;
            }
        }




        System.out.println("iki sayının ebobu-->"+ebob);

       ekok=(sayı1*sayı2)/ebob;
        System.out.println("iki sayının ekoku-->"+ekok);





    }
}
