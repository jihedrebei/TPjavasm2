public class Application2 {
    static int Factoriel_rec(int n) {
        if (n <= 1) return 1;
        return n * Factoriel_rec(n - 1);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Entrez un entier positif : ");
        int n = sc.nextInt();
        System.out.println("Factoriel = " + Factoriel_rec(n));
    }
}
