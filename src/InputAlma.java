import java.util.Scanner;

public class InputAlma {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Değeri giriniz: ");
        a = scanner.nextInt();
        System.out.println(a);

        double b = scanner.nextDouble();
        // Double sayıyı girerken noktalı yerine virgüllü kullanım yapıyoruz.
        System.out.println(b);
    }
}
