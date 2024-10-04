class shape{
    String color;


}
class triangle extends shape{

    public void print()
    {
    System.out.println(this);
    
    }
    

}







public class inheritance {
    public static void main(String[] args) {
        triangle t1 = new triangle();

        t1.color = "red";

        t1.print();
    }
    
}
