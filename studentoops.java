class student{
    String name;
    int age;

    public student(String name, int age) {  //parameterised constructor
        this.name = name;
        this.age = age;

    }

    public void print()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

}


public class studentoops {

    public static void main(String[] args) {
        
        student s1 = new student("Tee", 22);
        s1.print();

    }

    

    

    
}
