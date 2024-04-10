package day01;

import java.util.Scanner;

public class S03_Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen iki kelimelik ad soyad giriniz...");
        String adsoyad = scan.nextLine();
        String var10000 = adsoyad.substring(0, 1).toUpperCase();
        String ad = var10000 + adsoyad.substring(1, adsoyad.indexOf(" "));
        String soyad = adsoyad.substring(adsoyad.indexOf(" ") + 1).toUpperCase();
        System.out.println("İsim : " + ad + "\nSoyisim : " + soyad);
    }

}
