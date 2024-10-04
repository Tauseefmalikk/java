
class cylinder{
    double height;
    double radius;



    public double lidarea()
    {
        return 3.14*radius*radius;
    }
    public double totalsurfacearea()
    {
        return (2*lidarea())+(2*3.14*radius)*height;
    
    }
    public double volume()
    {
        return lidarea()*height;
    }
    
    public void print()
    {
        System.out.println(lidarea());
        System.out.println(totalsurfacearea());
        System.out.println(volume());
    }


}

public class oops2 {

    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.height=10;
        c.radius=7;
        c.print();
      

    }
    
  
}
