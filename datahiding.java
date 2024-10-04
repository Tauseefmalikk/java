class cylinder{
    private double radius;
    private double height;


    public double getRadius()
    {
        return radius;
    }
    public double getHeight()
    {
        return height;
    }

    public void setRadius(double r)

    {
        radius=r;
    }
    public void setHeight(double h)
    {
        height=h;
    }

    public void setDimensions(double r,double h){
        radius=r;
        height=h;
    }

    cylinder()
    {
        radius=0;
        height=0;
    }
    cylinder(double r,double h)
    {
        radius=r;
        height=h;
    }






}






public class datahiding {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.setDimensions(12, 12);
    }
    
}
