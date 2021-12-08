public class CharBoolean {
    public static void main(String[] args) {
        char letter = 'u';
        // Char diğer dillere göre Java da 16 bittir. Unicode karakter setini kullanır ve tüm dilleri içerir.
        boolean logic1 = true;
        boolean logic2 = false;
        // Boolean genellikle koşul ve döngü işlemlerinde kontrol amaçlı olarak kullanılır.
        System.out.println(letter);
        System.out.println(logic1);
        System.out.println(logic2);

        // String sınıfı metinlerle ilgili her türlü işlemin yapıldığı sınıftır.
        //Javada genellikle kelime tutmak için char yerine String sınıfı kullanır.

        String vStr = "Hello world";
        System.out.println(vStr);
    }
}
