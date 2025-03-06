import java.util.Scanner ;
public class chaine {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        String ch1="coucou";
        String ch2=new String(",c'est moi !\n");
        String ch3= ch1+ch2;
        System.out.println(ch3);
        System.out.println("caractere en position 2 : " +ch1.charAt(2));
        System.out.println(ch1.equals("coucou"));
        System.out.println(ch1.equals(ch2));
        System.out.println("postion de o dans ch1 ?" +ch1.indexOf('o'));
        System.out.println("postion de \"cou\" dans ch1 ?" +ch1.indexOf("cou"));
        System.out.println("postion de \"moi\" dans ch1 ?" +ch1.indexOf("moi"));
        System.out.println("ch1 en majuscules : "+ch1.toUpperCase());
         System.out.println("ch1 en miniscules : "+ch1.toLowerCase());
        sr.close();
   
    }
}