class student{
    String name;
    int age;

    public student(String name, int age) {  //parameterised constructor
        this.name = name;
        this.age = age;

    }

    public void print(int age)
    {
        System.out.println(age);
    }

    public void print(String name)
    {
        System.out.println(name);
    }

    public void print(String name, int age)
    {
        System.out.println(name+" "+age);
       
    }

}


public class overloading {

    public static void main(String[] args) {
        
        student s1 = new student();
        s1.name = "tee";
        s1.age =  21;
        s1.print(s1.age);

    }

    

    

    
}
