package Odevler_Pratikler;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km;
        double perKm = 2.20;
        double total;
        double startPrice = 10;
        System.out.print("Mesafeyi Kilometre Olarak giriniz: ");
        km = scanner.nextInt();

        total = km * perKm;
        total += startPrice;

        total = (total < 20) ? 20 : total; // Total 20 den küçükse 20 TL taksi ücreti alınır.
        System.out.println("Toptal Tutar: " + total);
    }
}
