class mythread extends  Thread{

    public void run()
    {
        int i=1;
        while(true)
        {
        System.out.println(i+"Hello");
        i++;
        }
    
    }

}


class multithreading{
    public static void main(String[] args) {
        mythread t = new mythread();
        t.start();

        int i=1;
        while (true) {
            System.out.println(i+"world");
            i++;            
        }
    }



}