
import java.util.*;

public class conditionals {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();

        if (age > 18)
        {
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        
        }

    }
    
}
