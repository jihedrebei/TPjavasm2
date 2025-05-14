import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre d'élèves (n >= 10): ");
        int n;
        do {
            n = lecturex(scanner);
            if (n < 10) {
                System.out.print("Veuillez entrer un nombre >= 10: ");
            }
        } while (n < 10);
        int[] T = new int[n];
        RemplirTAb(T, scanner);
        double moyenne = Calcul_Moy(T);
        int nbSupMoy = NombreNote(T, moyenne);
        
        System.out.println("Moyenne de la classe: " + moyenne);
        System.out.println("Nombre de notes supérieures à la moyenne: " + nbSupMoy);
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
        System.out.println("Saisie des notes (0 <= note <= 20):");
        for (int i = 0; i < T.length; i++) {
            do {
                System.out.print("Note " + (i+1) + ": ");
                T[i] = scanner.nextInt();
                if (T[i] < 0 || T[i] > 20) {
                    System.out.println("La note doit être entre 0 et 20");
                }
            } while (T[i] < 0 || T[i] > 20);
        }
    }
    
    public static double Calcul_Moy(int[] T) {
        double somme = 0;
        for (int note : T) {
            somme += note;
        }
        return somme / T.length;
    }
    
    public static int NombreNote(int[] T, double moyenne) {
        int count = 0;
        for (int note : T) {
            if (note > moyenne) {
                count++;
            }
        }
        return count;
    }
}