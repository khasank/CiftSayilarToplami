import java.util.Scanner;

public class CiftSayilarToplami {
    public static void main(String[] args) {
        int n;
        int total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir sayi giriniz : ");
            n = input.nextInt();
            if (n % 4 == 0) {
                System.out.println(n + " Sayısı çift ve 4'ün katı bir sayıdır.");
                total = total + n;
            }

        } while (n % 2 == 0);
        System.out.println("Girilen çift ve 4'ün katı sayıların toplamı : " + total);

    }
}
