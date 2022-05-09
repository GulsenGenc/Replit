package Method_Array;

public class ENG_Method_Array_03 {
    public static void main(String[] args) {
        /*
        Write a method which accepts a String as parameter and
        prints the sum of the digits, present in the given string.
        -->Bir String'i parametre olarak kabul eden ve
         verilen string'de bulunan rakamların toplamını yazdıran bir metot yazın.
         */
        String str="Java güzeldir ve ";
        strHarfToplamı(str);
    }

    private static void strHarfToplamı(String str) {
        int sayac=0;
        for (int i = 0; i <str.length() ; i++) {
            sayac++;
        }
        System.out.println("str da bulunan harf sayısı-->"+sayac);
        int toplam=0;
        for (int i = 0; i < str.length() ; i++) {
            toplam+=str.charAt(i);
        }
        System.out.println("strda bulunan harflerin ascii değer toplamı-->"+toplam);
    }
}
