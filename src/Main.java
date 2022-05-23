import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int value, total = 0;
        boolean isEvenValue = true;

        Scanner input = new Scanner(System.in);

        while (isEvenValue) {
            System.out.print("Bir değer giriniz: ");
            value = input.nextInt();
            if (value % 2 == 1) {
                isEvenValue = false;
            } else if (value > 0 && value % 4 == 0) {
                total += value;
            }
        }
        System.out.print("Sayıların toplamı: " + total);

    }
}
