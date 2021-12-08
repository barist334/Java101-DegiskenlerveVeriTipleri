package Odevler_Pratikler;

import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tutar;
        double kdvOran;
        System.out.print("Tutarı giriniz: ");
        tutar = scanner.nextDouble();
        // Tutar 1000 den fazla ise 0.08, 1000 den az ise 0.18 oranı uygulanır.
        boolean kdv = tutar > 1000;
        kdvOran = kdv ? 0.08 : 0.18 ;
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV li Tutar: " + kdvliTutar);
    }
}
