package Odevler_Pratikler;

import java.util.Scanner;

public class DaireAlanveCevre {
    public static void main(String[] args) {
        int r; // Yarıçap
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = scanner.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

    }
}
