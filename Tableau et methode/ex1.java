public class ex1 {

    
    public static double somme(double[] tab) {
        double s = 0;
        for (int i = 0; i < tab.length; i++) {
            s = s + tab[i];
        }
        return s;
    }

    
    public static void incre(double[] tab, double val) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = tab[i] + val;
        }
    }

    
    public static void afficher(double[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        double[] t = {1.0, 2.0, 3.0, 4.0};

        System.out.print("Tableau initial : ");
        afficher(t);

        System.out.println("Somme = " + somme(t));

        incre(t, 2.0);

        System.out.print("Après incrémentation de 2.0 : ");
        afficher(t);
    }
}