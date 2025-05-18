import java.util.Scanner;

public class exercice2 {
    public static String reconvert() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre réel : ");
        double reel = scanner.nextDouble();

        String chaine = Double.toString(reel);

        System.out.println("Le nombre réel converti en chaîne est : " + chaine);
        
        scanner.close();
        return chaine;
    }

    public static void main(String[] args) {
        reconvert();
}
}