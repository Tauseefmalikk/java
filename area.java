
import java.util.*;
public class area {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            while(true){
            System.out.println("Press 's' to calculate area of triangle using sides of triangle or press 'b' to calculate area of triangle using base and height");

      char choice=sc.next().charAt(0);  //string input for taking only one word or we can use nextline() for full sentence

      switch(choice){
   
            case 'b', 'B' -> {
                System.out.println("Enter the breadth of triangle");
                double breadth=sc.nextDouble();
                
                System.out.println("Enter the height of triangle");
                double height=sc.nextDouble();
                
                double area=(breadth*height)/2;
                
                System.out.println("The area of triangle =" + area);
                    }
            case 's', 'S' -> {
                System.out.println("Enter sides a,b,c");
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                
                float S=(float)a+b+c/2;
                
                float Area=(float)Math.sqrt(S*(S-a)*(S-b)*(S-c));
                System.out.println("The area of triangle="+ Area);
                    }


            default -> System.out.println("Invalid input");

      
   
   
             }

            


   }
        }
}
    
}
