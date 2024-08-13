package first.application;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class MyFrame extends JFrame implements ActionListener {
    JLabel l ;
    JButton b;
    int count = 0;
    MyFrame(){
        super("First APP");
        l = new JLabel("Clicked "+count+" times.");
        b = new JButton("Click");

        setLayout(new FlowLayout());
        add(l);
        add(b);
        b.addActionListener(this);
//        b.setToolTipText("HI how're you");
        add(new Button("Cancel"));
        getRootPane().setDefaultButton(b);
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\anuja\\OneDrive\\Documents\\Pictures\\Desktop\\Files\\Images\\Purple Minimalist Brush Personal LinkedIn Banner.png"));
            Image resized = image.getScaledInstance(100,50,Image.SCALE_SMOOTH);
        b.setIcon(new ImageIcon(resized));
//        b.setIcon(new ImageIcon(path to image, but the button will occupy the size of the image, so better use the above one));

        } catch (IOException e) {

        }
    }
    @Override
    public void actionPerformed(ActionEvent e){
        count++;
        l.setText("Clicked " + count + " times.");
    }
}
public class First {
    public static void main(String[] args) {
        MyFrame m = new MyFrame();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        m.setSize(400,400);
        m.setVisible(true);
    }
}
