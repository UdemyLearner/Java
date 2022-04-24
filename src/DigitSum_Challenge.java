import java.util.Scanner;

public class DigitSum_Challenge {
    public static void main(String[] args) {
        sumDigits(125);
        sumDigits(-22);
        sumDigits(33);
    }

    public static int sumDigits(int no) {
        if (no >= 10) {
            int sum = 0;
            while (no > 0) {
                int d = no % 10;
                sum += d;
                no /= 10;
            }
            System.out.println("sum of digits " + sum);

        } else if (no < 0) {
            System.out.println("nope");
        } else {
            System.out.println(no);
        }
        return -1;
    }
}
