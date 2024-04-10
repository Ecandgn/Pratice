package day01;

import java.util.Scanner;

public class S02_cayIfElse {
    public static void main(String[] args) {
         /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)
    */
        Scanner scan = new Scanner(System.in);
        System.out.print("Günde kac bardak çay iciyorsunuz... ");
        double tea = scan.nextDouble();
        System.out.print("Her bardak icin kac kup seker kullanıyorusnuz... ");
        double sugar = scan.nextDouble();
        double yillikSekerTuketimi = (tea * sugar * 2.77 )*365 / 1000;
        double kirkyillıkseker = yillikSekerTuketimi * 40;

        if (yillikSekerTuketimi == 0) {
            System.out.println("Aferin, boyle devam et :)");
        } else {
            System.out.println("Yıllık Seker Tüketimi(kg) : " + yillikSekerTuketimi
                    + "\nKırkYıllık Seker Tüketimi : " + kirkyillıkseker+" kg");
        }

    }

    public static class S03_Substring {
        public static void main(String[] args) {
            // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
            // adinin ilk harfi buyuk digerleri kucuk,
            // soyadinin tamami büyük harfle yazacak sekilde ad ayrı soyad ayrı sekilde alt alta ekrana yazdırınız.

            Scanner scan = new Scanner(System.in);
            System.out.print("Lütfen iki kelimelik ad soyad giriniz...");
            String adsoyad = scan.nextLine();
            String ad=adsoyad.substring(0,1).toUpperCase()+adsoyad.substring(1,adsoyad.indexOf(" "));
            String soyad=adsoyad.substring(adsoyad.indexOf(" ")+1).toUpperCase();
            System.out.println("İsim : "+ad+"\nSoyisim : "+soyad);


        }
    }
}
