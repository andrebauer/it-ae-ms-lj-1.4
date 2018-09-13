import java.util.Scanner;

public class LeistungVonPSinKW {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int ps = reader.nextInt();
        double w = ps * 735.498;
        double kw = w / 1000;
        System.out.println(kw);
    }
}
