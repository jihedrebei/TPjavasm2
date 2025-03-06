import java.util.Scanner;


public class APP2 {
    public static String premierMot(String chaine) {
        String[] mots = chaine.split(" ");
        return mots.length > 0 ? mots[0] : "";
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        
        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = sr.nextLine();
        
        String premierMot = premierMot(chaine);
        System.out.println("Le premier mot est : " + premierMot);
        
        sr.close();
    }
}
