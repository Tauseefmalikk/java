class circle{

    public double radius;

    public double area()
    {
        return 3.14*radius*radius;
    }
    public double perimeter()
    {
        return 2*3.14*radius;
    }
    public double circumference()
    {
        return perimeter();
    }

}

class cylinder extends circle{
    public double height;

    public double volume()
    {
      return area()*height;  
    }


}



public class inherit {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.radius=2;
        c.height=3;

        System.out.println(c.volume());
        System.out.println(c.area());
    }
}
