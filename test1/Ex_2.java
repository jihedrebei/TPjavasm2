import java.util.Scanner;

public class Ex_2 {
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int soustraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("Division par zéro !");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("Choisir une opération (+, -, *, /) : ");
        char op = sr.next().charAt(0);
        System.out.print("Entrez le premier nombre : ");
        int a = sr.nextInt();
        System.out.print("Entrez le second nombre : ");
        int b = sr.nextInt();

        switch (op) {
            case '+': System.out.println("Résultat : " + addition(a, b)); break;
            case '-': System.out.println("Résultat : " + soustraction(a, b)); break;
            case '*': System.out.println("Résultat : " + multiplication(a, b)); break;
            case '/': System.out.println("Résultat : " + division(a, b)); break;
            default: System.out.println("Opération non valide");
        }
    }
}
