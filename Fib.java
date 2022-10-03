import java.util.Scanner;

public class Fib{

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = reader.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<n;i++)
        {
            int c =a+b;
            System.out.println("numbres"+a);
            a=b;
            b=c;
            
        }

        



    }
}