public class Application4 {
    static boolean Palindrome_rec(String ch, int start, int end) {
        if (start >= end) return true;
        if (ch.charAt(start) != ch.charAt(end)) return false;
        return Palindrome_rec(ch, start + 1, end - 1);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Entrez une chaîne (max 30 caractères) : ");
        String ch = sc
