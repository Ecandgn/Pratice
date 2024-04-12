package day03;

import java.util.Scanner;

public class S03_SicaklikDoubleDeğer {
    // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
    // "e" girildiğinde veri girişi sonlandırılsın.
    // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double maxSicaklik = Double.MIN_VALUE;
        double minSicaklik = Double.MAX_VALUE;
        System.out.println("Sicaklik degerlerini giriniz. (Veri girisini sonlandirmak icin e'ye basiniz)");
        while (true) {
            String input = scan.nextLine();
            if (input.equals("e")) {
                break;
            } else if (!input.matches("-?\\d+\\.\\d+")) {
                System.out.println("Gecersiz giris! Lütfen bitirmek icin sadece e giriniz");
                continue;
                /*
                -?    negatif degerdeki sayilar icin
                \\d   0-9 arasi rakamlar icin
                +    basamak kazandirmak icin
                \\.\\d+  ondalikli kisim icin
                 */
            }
            double sicaklik = Double.parseDouble(input);
            if (sicaklik > maxSicaklik) {
                maxSicaklik = sicaklik;
            }
            if (sicaklik < minSicaklik) {
                minSicaklik = sicaklik;
            }
        }
        System.out.println("Gunun en sicak degeri: " + maxSicaklik);
        System.out.println("Gunun en soguk degeri: " + minSicaklik);
    }
}

