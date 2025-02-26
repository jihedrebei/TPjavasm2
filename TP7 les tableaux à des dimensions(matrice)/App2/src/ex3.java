import java.util.Scanner;
public class ex3 {
public static void main(String[] args) {
    Scanner sr=new Scanner (System.in);
    int nl , nc;
do { 
    System.out.print("entrez le nombre de lignes (1<=nl<=20):");
    nl=sr.nextInt();

} while (nl<1 || nl>20);
do { 
    System.out.println("entrez le nombre de colonnes (1<=nl<=30):");
    nc=sr.nextInt();

} while (nc<1 || nc>30);

int[][] M= new int[nl][nc];
int[] T= new int [nl];

System.out.println("entrez les elements de la matrice");
for (int i=0; i<nl; i++){
    for (int j=0; j<nc; j++){
        System.out.print("M["+i+"]["+j+"]=");
        M[i][j]= sr.nextInt();

    }
}
for (int i=0;i<nl; i++){
    int somme=0;
    for (int j =0; j<nc;j++){
        somme +=M[i][j];
    }
    T[i] = somme;
}
int min = T[0], max = T[0];
for (int i= 1; i<nl;i++){
    if (T[i]<min) {min=T[i];}
    if (T[j]>max) {max= T[j];}
}

System.out.println("\nSommes des lignes :");
for (int i= 0; i <nl; i++){
    System.out.println("ligne"+(i+1)+":"+T[i]);

}
System.out.println("somme minimale :"+min);
System.out.println("somme maximale :"+max);
sr.close();

}
}
