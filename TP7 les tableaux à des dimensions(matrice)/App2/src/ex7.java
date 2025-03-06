import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Entrez un verbe du premier groupe (terminé par 'er') : ");
        String verbe = sr.nextLine().trim();

        if (!verbe.endsWith("er") || verbe.equals("aller")) {
            System.out.println("Ce n'est pas un verbe régulier du premier groupe.");
        } else {
            conjuguerVerbe(verbe);
        }

        sr.close();
    }

    public static void conjuguerVerbe(String verbe) {
        String radical = verbe.substring(0, verbe.length() - 2);

        System.out.println("Conjugaison de " + verbe + " au présent de l'indicatif :");
        System.out.println("je " + radical + "e");
        System.out.println("tu " + radical + "es");
        System.out.println("il/elle " + radical + "e");

      
        if (verbe.endsWith("ger")) {
            System.out.println("nous " + radical + "eons"); 
        } else if (verbe.endsWith("cer")) {
            System.out.println("nous " + radical.substring(0, radical.length() - 1) + "çons"); 
        } else {
            System.out.println("nous " + radical + "ons");
        }

        System.out.println("vous " + radical + "ez");
        System.out.println("ils/elles " + radical + "ent");
    }
}