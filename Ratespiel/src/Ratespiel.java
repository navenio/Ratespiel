import java.util.Scanner;

public class Ratespiel {

    public Ratespiel () {
        System.out.println("Willkommen");

        String t = input ("Erraten Sie die Zahl");

        int tipp = Integer.parseInt(t);
        if (tipp==5)
            System.out.println("Gewonnen");
        else
            System.out.println("Verloren");

        System.out.println("Game Over");


    }

    private String input(String ausgabe) {
        System.out.println(ausgabe);

        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void main(String[] args) {
        //Main Methode
        Ratespiel meinRatespiel = new Ratespiel();
    }
}