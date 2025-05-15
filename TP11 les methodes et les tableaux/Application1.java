
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez la taille du tableau (n > 0): ");
        int n = lecturexN(scanner);

        int[] T = new int[n];
        RemplirTab(T, scanner);
 
        System.out.print("Entrez l'entier X1 à remplacer: ");
        int X1 = scanner.nextInt();
        System.out.print("Entrez l'entier X2 de remplacement: ");
        int X2 = scanner.nextInt();
  
        Remplacer(T, X1, X2);

        System.out.println("Tableau après remplacement:");
        AfficherTab(T);
        
        scanner.close();
    }
    
  
    public static int lecturexN(Scanner scanner) {
        int n;
        do {
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.print("Veuillez entrer un entier > 0: ");
            }
        } while (n <= 0);
        return n;
    }
    

    public static void RemplirTab(int[] T, Scanner scanner) {
        System.out.println("Remplissage du tableau:");
        for (int i = 0; i < T.length; i++) {
            System.out.print("Entrez l'élément " + (i+1) + ": ");
            T[i] = scanner.nextInt();
        }
    }
    

    public static void Remplacer(int[] T, int X1, int X2) {
        for (int i = 0; i < T.length; i++) {
            if (T[i] == X1) {
                T[i] = X2;
            }
        }
    }
    
  
    public static void AfficherTab(int[] T) {
        for (int i = 0; i < T.length; i++) {
            System.out.print(T[i] + " ");
        }
        System.out.println();
    }
}


