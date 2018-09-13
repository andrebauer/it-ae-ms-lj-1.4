public class RoemischeZahl {

    public static void main(String[] args) {
        String mille = roemischesZahlzeichen(1000);
        System.out.println("1000 hat das Zahlzeichen " + mille);
    }

    static String roemischesZahlzeichen(int wert) {
        switch (wert) {
            case 1:
                return "I";
            case 5:
                return "V";
            case 10:
                return "X";
            case 50:
                return "L";
            case 100:
                return "C";
            case 500:
                return "D";
            case 1000:
                return "M";
            default:
                throw new RuntimeException("Für den Wert " + wert + " gibt es kein römisches Zahlzeichen." );
        }
    }
}
