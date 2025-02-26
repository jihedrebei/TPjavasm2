import java.util.Scanner;
public class app2 {
public static void main(String[] args) {
    Scanner sr=new Scanner(System.in);
int nl,nc;
do {
    System.out.println("entre le nombre de ligne(1-29)"); 
    nl=sr.nextInt();
} while (nl<=0 || nl>=30);
do { 
    System.out.println("entre le nombre de colonne (1-29)");
    nc=sr.nextInt();

} while (nc<=0 || nc>=30);

int[][] M=new int[nl][nc];

System.out.println("entez les elements de la matrice:");
for (int i=0;i<nl; i++) {
    for(int j=0;j<nc;j++) {
        System.out.println("M["+i+"]["+j+"]=");
        M[i][j] = sr.nextInt();
}
}
int somme =0;
long produit =1;
//int nombreElements =nl*nc;

for(int i=0; i<nl; i++){
    for(int j=0; j<nc; j++){

    somme=somme + M[i][j];
    if (M[i][j] !=0){
    produit=produit*M[i][j];
    }}
}
sr.close();
}

}
