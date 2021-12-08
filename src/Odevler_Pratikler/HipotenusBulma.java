package Odevler_Pratikler;

import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
        //Degiskenler
        int a, b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Kenarı Giriniz: ");
        a = scanner.nextInt();
        System.out.print("İkinci Kenarı Giriniz: ");
        b = scanner.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs: " + c);

    }
}
