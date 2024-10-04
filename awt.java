import java.awt.*;

public class awt {

    public static void main(String[] args) {
        Frame f = new Frame();
        Label l =  new Label("Lists demo",Label.CENTER);
    
        Choice obj = new Choice();
        obj.setBounds(80,80,100,100);
        obj.add("c/c++");
        obj.add("java");
        obj.add("pyhton");
        f.add(obj);
        f.add(l);
        f.setSize(100,100);
        f.setLayout(null);
        f.setVisible(true);

    


    }
   


}
