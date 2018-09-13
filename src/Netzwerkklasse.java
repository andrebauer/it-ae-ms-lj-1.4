import java.util.Scanner;

public class Netzwerkklasse {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstByte = reader.nextInt();
        if (firstByte < 0 || firstByte > 255)
            throw new Error("Ungültige Eingabe");
        if (firstByte <= 127) {
            System.out.println("Klasse A");
        } else if (firstByte <= 191) {
            System.out.println("Klasse B");
        } else if (firstByte <= 223) {
            System.out.println("Klasse C");
        } else if (firstByte <= 239) {
            System.out.println("Klasse D");
        } else {
            System.out.println("Klasse E");
        }
    }
}
