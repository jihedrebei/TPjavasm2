import java.util.Scanner;

public class Ex_1 {
    public static int Lecture() {
        Scanner sr = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            n = sr.nextInt();
        } while (n <= 0);
        return n;
    }

    public static int Compter(int n) {
        return String.valueOf(n).length();
    }
    public static void main(String[] args) {
        int n = Lecture();
        System.out.println("Nombre de chiffres : " + Compter(n));
    
    }
}
