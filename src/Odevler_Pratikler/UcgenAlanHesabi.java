<<<<<<< HEAD
package Odevler_Pratikler;

import java.util.Scanner;

public class UcgenAlanHesabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double u, alan;
        int a,b,c;
        System.out.print("Birinci Kenarı Giriniz: ");
        a = scanner.nextInt();
        System.out.print("İkinci Kenarı Giriniz: ");
        b = scanner.nextInt();
        System.out.print("Üçüncü Kenarı Giriniz: ");
        c = scanner.nextInt();

        u = (a + b + c) / 2.0;
        // Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        alan = Math.sqrt((u * (u-a) * (u-b) * (u-c)));
        System.out.println("Üçgenin Alanı: " + alan);

    }
}
=======
package Odevler_Pratikler;

import java.util.Scanner;

public class UcgenAlanHesabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double u, alan;
        int a,b,c;
        System.out.print("Birinci Kenarı Giriniz: ");
        a = scanner.nextInt();
        System.out.print("İkinci Kenarı Giriniz: ");
        b = scanner.nextInt();
        System.out.print("Üçüncü Kenarı Giriniz: ");
        c = scanner.nextInt();

        u = (a + b + c) / 2.0;
        // Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        alan = Math.sqrt((u * (u-a) * (u-b) * (u-c)));
        System.out.println("Üçgenin Alanı: " + alan);

    }
}
>>>>>>> origin/master
