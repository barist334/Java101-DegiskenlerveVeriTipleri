package Odevler_Pratikler;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy, kilo;
        double vki; // Vücut Kitle İndeksi
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = scanner.nextDouble();

        vki = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + vki);
    }
}
