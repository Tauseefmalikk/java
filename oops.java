class Pen{

    String color;
    String type;

    public void write()
    {
        System.out.println("Write Something");    
    
    }
    public void color()
    {
        System.out.println(this.color);
    
    }


}


public class oops {
    public static void main(String[] args) {

        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type="Ball";
        
        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "gel";

        pen1.color();
        pen2.color();

    }
    
}
