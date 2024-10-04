
import java.util.Scanner;

public class exception {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        
try{
        c=a/b;
        System.out.println(c);
}
catch(ArithmeticException e)
{
        System.out.println("error..Denominator is zero");
    }
    System.out.println("Bye");
    
}
}