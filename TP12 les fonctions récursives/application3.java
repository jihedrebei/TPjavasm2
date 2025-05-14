public class Application3 {
    static boolean EstPremier_rec(int n, int d) {
        if (d == 1) return true;
        if (n % d == 0) return false;
        return EstPremier_rec(n, d - 1);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Entrez un entier : ");
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (EstPremier_rec(i, i - 1)) {
                System.out.print(i + " ");
            }
        }
    }
}
