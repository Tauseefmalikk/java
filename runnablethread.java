class mythread implements Runnable{
    public void run()
    {
        int i=1;
        while(true)
        {
         System.out.println("hello");
         i++;
        }
    
    }


}



public class runnablethread {
public static void main(String[] args) {
    
    mythread m = new mythread();
    Thread th =  new Thread(m);
    th.start();

    int i =1;
    while(true)
    {
    System.out.println(i+"world");
    i++;
    
    }
}
 
    
}
