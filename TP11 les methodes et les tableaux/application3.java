import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez la taille du tableau (n > 0): ");
        int n = lecturex(scanner);
        int[] T = new int[n];
        RemplirTAb(T, scanner);
        int[] T_pair = CreerTpair(T);
        int[] T_impair = CreerTimpair(T);
        System.out.println("Tableau des éléments pairs:");
        AfficheTAb(T_pair);
        
        System.out.println("Tableau des éléments impairs:");
        AfficheTAb(T_impair);
    }
    
    public static int lecturex(Scanner scanner) {
        int n;
        do {
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.print("Veuillez entrer un entier strictement positif: ");
            }
        } while (n <= 0);
        return n;
    }
    
    public static void RemplirTAb(int[] T, Scanner scanner) {
        System.out.println("Remplissage du tableau avec des entiers positifs:");
        for (int i = 0; i < T.length; i++) {
            do {
                System.out.print("Element " + (i+1) + ": ");
                T[i] = scanner.nextInt();
                if (T[i] < 0) {
                    System.out.println("L'entier doit être positif");
                }
            } while (T[i] < 0);
        }
    }
    
    public static int[] CreerTpair(int[] T) {

        int count = 0;
        for (int value : T) {
            if (value % 2 == 0) {
                count++;
            }
        }

        int[] T_pair = new int[count];
        int index = 0;
        for (int value : T) {
            if (value % 2 == 0) {
                T_pair[index++] = value;
            }
        }
        return T_pair;
    }
    
    public static int[] CreerTimpair(int[] T) {
      
        int count = 0;
        for (int value : T) {
            if (value % 2 != 0) {
                count++;
            }
        }
        
        int[] T_impair = new int[count];
        int index = 0;
        for (int value : T) {
            if (value % 2 != 0) {
                T_impair[index++] = value;
            }
        }
        return T_impair;
    }
    
    public static void AfficheTAb(int[] T) {
        for (int value : T) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}