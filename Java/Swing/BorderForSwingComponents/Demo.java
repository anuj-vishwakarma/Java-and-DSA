package BorderForSwingComponents;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

class MyFrame extends JFrame{
    JLabel l; JButton b; JTextField tf;
    JPanel p;
    MyFrame(){
        l = new JLabel("Name");
        tf = new JTextField(20);
        b = new JButton("Ok");
        p = new JPanel();

//        Border  br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder((Color.red),2), "Login", TitledBorder.ABOVE_BOTTOM,TitledBorder.CENTER);
        Border br = BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED), BorderFactory.createTitledBorder(BorderFactory.createLineBorder((Color.red),2), "Login", TitledBorder.ABOVE_BOTTOM,TitledBorder.CENTER)) ;
        p.setBorder(br);

        p.add(l);p.add(tf);p.add(b);
        setLayout(new FlowLayout());
        add(p);
    }
}
public class Demo {
    public static void main(String[] args) {
       MyFrame m = new MyFrame();
       m.setSize(420,420);
       m.setVisible(true);
       m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


