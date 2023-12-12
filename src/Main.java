import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //New scanner created.
        Scanner inp = new Scanner(System.in);

        //Data retrieved from user.
        System.out.print("Ilk sayiyi girin: ");
        int firstNum = inp.nextInt();
        System.out.print("Ikinci sayiyi girin: ");
        int secondNum = inp.nextInt();
        System.out.print("Ucuncu sayiyi girin: ");
        int thirdNum = inp.nextInt();

        int d = 10, e = 2, f = 3;

        //Results printed.
        System.out.println("Sonuc: " + (firstNum+secondNum*thirdNum-secondNum));
        System.out.println("Sonuc: " + (d+e*f-e));
    }
}