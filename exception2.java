public class exception2 {
    public static void main(String[] args) {
        int A[]= {1,2,0,4,5};

    try {

        int c = A[0]/A[1];
        System.out.println("Division is " + c);

        System.out.println(A[5]);
    
    }
    catch(ArithmeticException e){

        System.out.println("Denominator is zero");
    
    }
    catch(ArrayIndexOutOfBoundsException e){
    
        System.out.println("index out of bound");
    }
       

        System.out.println("Bye");
    }
    
}
