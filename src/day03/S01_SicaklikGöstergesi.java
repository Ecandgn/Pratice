package day03;

import java.util.Scanner;

public class S01_SicaklikGöstergesi {
    public static void main(String[] args) {
        // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
        // "e" girildiğinde veri girişi sonlandırılsın.
        // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

        Scanner scan=new Scanner(System.in);

        double maxSicaklik=Double.MIN_VALUE; // max değere min değer atandı
        double minSicaklik=Double.MAX_VALUE;
        System.out.println(minSicaklik+" heyyy"+maxSicaklik);
        System.out.println("Sicaklik degerlerini giriniz. (Veri girisini sonlandirmak icin e'ye basiniz)");

        while (true){
            String input= scan.nextLine();

            if (input.equals("e")){
                break;
            }
            double sicaklik=Double.parseDouble(input);

            if (sicaklik>maxSicaklik){
                maxSicaklik=sicaklik;
            }

            if (sicaklik<minSicaklik){
                minSicaklik=sicaklik;
            }

        }
        System.out.println("Gunun en sicak degeri: " + maxSicaklik);
        System.out.println("Gunun en soguk degeri: "+ minSicaklik);

    }
}
