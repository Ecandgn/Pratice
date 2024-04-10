package day01;

public class S01_SayıAltAlta {
    public static void main(String[] args) {
        /*12345 sayısını konsolda altalta yazdırın
        inpur: 12345
        output:1
        2
        3
        4
        5
         */
        int sayi = 12345;
        System.out.println("Sayi: "+sayi);
        int birlerbasamgi = (sayi % 10);
        int onlarbasamagi = (sayi / 10) % 10;
        int yuzlerbasamagi = (sayi / 100) % 10;
        int binlerbasamagi = (sayi / 1000) % 10;
        int onbinlerbasamagi = (sayi / 10000) % 10;

        System.out.println(onbinlerbasamagi + "\n" + binlerbasamagi + "\n" + yuzlerbasamagi
                + "\n" + onlarbasamagi + "\n" + birlerbasamgi);
    }
}
