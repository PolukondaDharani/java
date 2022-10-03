import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        //Scanner reader = new Scanner(System.in);

        //System.out.print("Enter a number: ");
        //String n = reader.next();
        String n ="mom";
        char[] ch = new char[n.length()];
        char[] ch1 = new char[n.length()];
        for (int i = 0; i < n.length(); i++) {
            ch[i] = n.charAt(i);
        }
        for(int i=0;i<ch.length;i++)
        {
            for(int j=ch.length;j<0;j--){
                ch1[i]= n.charAt(j); 
                }
            }


        if(ch==ch1){
            System.out.println("panlindrome");
        }
        }
    }