import java.util.Scanner;

public class APP1 {
    public static int compterOccurrences(String chaine, char caractere) {
        int count = 0;
        for (int i = 0; i < chaine.length(); i++) {
            if (chaine.charAt(i) == caractere) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = scanner.nextLine();
        
        System.out.print("Entrez le caractère à chercher : ");
        String caractereInput = scanner.nextLine();
        
        if (caractereInput.length() != 1) {
            System.out.println("Veuillez entrer un seul caractère.");
        } else {
            char caractere = caractereInput.charAt(0);
            int occurrences = compterOccurrences(chaine, caractere);
            System.out.println("Le caractère '" + caractere + "' apparaît " + occurrences + " fois dans la chaîne '" + chaine + "'.");
        }
        
        scanner.close();
    }
}
