import java.util.Scanner;
public class App {
public static void main(String[] args) {
    Scanner sr=new Scanner(System.in);
String ch,ch1,ch2 ;
        do{
        System.out.println("donne moi un chaine");
        ch=sr.nextLine();
        }while(ch.length()==0);
        ch=ch+" ";
        do{
        System.out.println("donne moi le mot à remplacer");
         ch1=sr.nextLine();
        }while(ch.length()==0);
        do{
        System.out.println("donne moi de remplissage");
        ch2=sr.nextLine();
        }while(ch.length()==0);
        String ch3="";
        String k="";
        int pos;
        do{
        	pos= ch.indexOf(" ");
        	k=ch.substring(0,pos);
         if (k.equals(ch1)) {
                ch3 += ch2 + " "; 
            } 
            	else{
            	
                ch3 += k + " ";
            	}
        	ch = ch.substring(pos + 1,ch.length());
        }while(ch.length()>0);
        System.out.println("result:"+ch3.trim());
    }
}
