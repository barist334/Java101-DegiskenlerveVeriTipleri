package Odevler_Pratikler;

import java.util.Scanner;

public class Aci_Ile_Daire_Alani {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, a; // Yarıçap ve merkez açı
        double pi = 3.14;
        double alan;
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = scanner.nextInt();
        System.out.print("Dairenin merkez açı ölçüsünü giriniz: ");
        a = scanner.nextInt();

        alan = (pi * r * r) / 360;
        System.out.println("Dairenin alanı: " + alan);

    }
}
