import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    
}
