class rectangle{
    int length;
    int breadth;
    int x = 10;

rectangle(int length,int breadth){
    this.length=length;
    this.breadth=breadth;

    }

}
class cuboid extends rectangle{
    int height;
    int x = 20;


    cuboid(int l,int b, int h)
    {
        super(l,b);
        height= h;
    }

    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }


}


public class inheri {
    
}
