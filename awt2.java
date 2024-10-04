import java.awt.*;
import javax.swing.border.BorderLayout;
public class awt2 {
    public static void main(String[] args) {
        setLayout(new BorderLayout());
        Frame f = new Frame("button");
        f.setSize(400,400);
        f.setVisible(true);

        Button b = new Button();
        b.setBounds(30,100,80,30);
        f.add(b);
        
    }
   
}
