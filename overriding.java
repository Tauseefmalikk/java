
class Super{

    public void display()
    {
        System.out.println("super class display");
    }

}
class Sub extends Super
{
    @Override
    public void display()
    {
        System.out.println("sub class display");
    
    }
}


public class overriding {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();

        Sub sub = new Sub();
        sub.display();
    }
    
}
