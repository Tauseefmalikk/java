
import java.util.*;

public class swt {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new  Scanner(System.in);
        System.out.println("Enter the button");
        int button = sc.nextInt();

        switch(button){
            case 1 -> System.out.println("Hello");

            case 2 -> System.out.println("Namaste");

            case 3 -> System.out.println("Bonjour");

            default -> System.out.println("invalid Button");
        
        
        
        }


    }
    
}
