import java.util.Scanner;

public class Ex_3 {

    public static boolean estInf(String verbe) {
        return verbe.endsWith("er") || verbe.endsWith("ir") || verbe.endsWith("re") || verbe.endsWith("oir");
    }

    public static int Groupe(String verbe) {
        if (verbe.equals("aller")) return 3;
        if (verbe.endsWith("er")) return 1;
        if (verbe.endsWith("ir")) return 2;
        return 3;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String verbe;

        do {
            System.out.print("Entrez un verbe à l'infinitif : ");
            verbe = sr.nextLine();
        } while (!estInf(verbe));

        int groupe = Groupe(verbe);
        System.out.println("Le verbe appartient au " + groupe + "ᵉ groupe.");
    }
}