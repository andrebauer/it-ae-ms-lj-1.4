import java.util.Scanner;

public class Primfaktorzerlegung {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int t = 2;
        while (n > 1) {
            if (n % t == 0) {
                n = n / t;
                System.out.print(t + " ");
            } else {
                t = t + 1;
            }
        }
    }
}

