import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Ilk sayiyi girin: ");
        int a = inp.nextInt();
        System.out.print("Ikinci sayiyi girin: ");
        int b = inp.nextInt();
        System.out.print("Ucuncu sayiyi girin: ");
        int c = inp.nextInt();

        int d = 10, e = 2, f = 3;

        System.out.println("Sonuc: " + (a+b*c-b));
        System.out.println("Sonuc: " + (d+e*f-e));
    }
}