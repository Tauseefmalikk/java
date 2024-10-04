

class rectangle{
    double length;
    double breadth;


    public double area(){
        
        return length*breadth;
    
    }
    public double perimeter()
    {
    
        return 2*(length+breadth);
    
    }

    public boolean isSquare()
    {
        if(length==breadth)
        {
        return true;
        }
        else
        {
        return false;
        }
        
    
    }

    public void print()
    {
        System.out.println("preimeter = " + this.perimeter());
        System.out.println("area = " + this.area());
        System.out.println(this.isSquare());
    }


}


public class oopsarea {

    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.breadth=2;
        r1.length=2;
        r1.print();

    }
    
}
