import java.util.Scanner;

public class ISBN10CheckDigit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String z = reader.next();
        int summe = 0;
        for (int i = 1; i <= 9; i = i + 1) {
            int produkt = Integer.parseInt(Character.toString(z.charAt(i - 1))) * i;
            summe = summe + produkt;
        }
        int p = summe % 11;
        if (p == 10) {
            System.out.println("X");
        } else {
            System.out.println(p);
        }
    }

}
