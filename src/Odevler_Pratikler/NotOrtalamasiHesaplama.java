package Odevler_Pratikler;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int matematik, fizik, kimya, turkce, tarih, muzik;
        //Scanner sınıfını tanımladık
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz: ");
        matematik = scanner.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = scanner.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = scanner.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = scanner.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = scanner.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = scanner.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;

        System.out.println("Ortalama: " + ortalama);
        String s = ortalama > 60 ? "Geçti" : "Kaldı";
        System.out.println(s);



    }
}
