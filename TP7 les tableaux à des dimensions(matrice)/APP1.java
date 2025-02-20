import java.util.Scanner;
public class APP1{
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
int nl,nc;
do { 
    System.out.println("entre le nombre de lignes (1-49):");
 nl=Scanner.nextInt();
} while (nl<=0|| nl>=50);
do { 
   System.out.println("ecrirez le nombre de colonnes(1-49):");
   nc=Scanner.nextInt();
} while (nc<=0 || nc>=50);
int[][] m=new int[nl][nc];

System.out.println("emplissez la matrice avec des nombres pairs:");

for (int i=0;i<nl; i++) {
for(int j=0;j<nc;j++) {
    int valeur;
 do{   
System.out.println ("entrez un nombre pair la case ["+i+"]["+j+"]:");
valeur = Scanner.nextInt();
 }while (valeur % 2 !=0);
m[i][j]=valeur;
 }
}
int x;
do { 
    System.out.println("entrez un nombre pair à rechercher:");
    x= Scanner.nextInt();
} while (x % 2 !=0);
boolean trouve = false;
for(int i=0;i<nl;i++){
for(int j=0;j<nl; j++){
    if(m[i][j] ==x){
        System.out.println("le nombre"+x+"se trouve à la position["+i+"]["+j+"].");
        trouve = true;
    }
    }
}
    if(!trouve){
    System.err.println("le nombre"+x+"n'existe pas dans la matrice.");
}
Scanner.close();
}
    }

