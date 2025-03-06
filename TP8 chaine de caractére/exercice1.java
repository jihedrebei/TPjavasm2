import java.util.Scanner;
public class exercice1 {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("entrez une chaine");
        String chaine =Scanner.nextLine();
        if (chaine.length()>0){
            char premierCaractere = chaine.charAt(0);
            char dernierCaractere = chaine.charAt(chaine.length()-1);
            System.out.println("premiercaractere:" + premierCaractere);
            System.out.println("derniercaractere:" + dernierCaractere);}
        else{
            System.out.println("la chaine est vide");
        }
        System.out.println(chaine.toUpperCase());
Scanner.close();
    }
}

