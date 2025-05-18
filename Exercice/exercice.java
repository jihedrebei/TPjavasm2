import java.util.Scanner;
public class ex {
    public static double convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaine : ");
        String ch = scanner.nextLine();
        double reel = Double.parseDouble(ch);
        System.out.println("La chaine convertie en réel est : " + reel);
        scanner.close();
        return reel; 
    }
    public static void main(String[] args) {
        convert();
}

}