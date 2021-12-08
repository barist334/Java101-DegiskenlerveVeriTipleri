package Odevler_Pratikler;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
        double kgArmut,kgElma,kgDomates,kgMuz,kgPatlican;
        double tutar;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut kaç kilo ? : ");
        kgArmut = scanner.nextDouble();
        System.out.print("Elma kaç kilo ? : ");
        kgElma = scanner.nextDouble();
        System.out.print("Domates kaç kilo ? : ");
        kgDomates = scanner.nextDouble();
        System.out.print("Muz kaç kilo ? : ");
        kgMuz = scanner.nextDouble();
        System.out.print("Patlıcan kaç kilo ? : ");
        kgPatlican = scanner.nextDouble();

        tutar = (armut * kgArmut) + (elma * kgElma) + (domates * kgDomates) + (muz * kgMuz) + (patlican * kgPatlican);
        System.out.println("Toplam Tutar: " + tutar + " TL");
    }
}
