interface drawable{
    void draw(); //default abstract method

}
class rectangle implements drawable{
    @Override
    public void draw()
    {
        System.out.println("Drawing a rectangle");
    }

}
class circle implements drawable{
    @Override
    public void draw()
    {
        System.out.println("Drawing a circle");
    
    }

}



public class main2 {
    public static void main(String[] args) {
        drawable d1 = new rectangle();
        drawable d2 = new circle();

        d1.draw();
        d2.draw();
    }
    
}
