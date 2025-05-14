public class Application1 {
    static int Somme_rec(int n) {
        if (n == 1) return 1;
        return n + Somme_rec(n - 1);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Entrez un entier > 0 : ");
        int n = sc.nextInt();
        System.out.println("Somme = " + Somme_rec(n));
    }
}
