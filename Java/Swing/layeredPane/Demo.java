package layeredPane;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

class MyFrame extends JFrame implements ActionListener {
     JLayeredPane jp;
     JRadioButton red, blue, green;
     JLabel redLabel, blueLabel, greenLabel, block;

    MyFrame(){
        red = new JRadioButton("Red");
        blue = new JRadioButton("Blue");
        green = new JRadioButton("Green",true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(red);
        bg.add(blue);
        bg.add(green);

        red.addActionListener(this);
        blue.addActionListener(this);
        green.addActionListener(this);

        JPanel p1 = new JPanel();
        p1.add(red);
        p1.add(blue);
        p1.add(green);

        redLabel = new JLabel("Red");
        redLabel.setBounds(30,30,200,200);
        redLabel.setBackground(Color.red);
        redLabel.setOpaque(true);

        blueLabel = new JLabel("Blue");
        blueLabel.setBounds(70,70,300,300);
        blueLabel.setBackground(Color.blue);
        blueLabel.setOpaque(true);

        greenLabel = new JLabel("Green");
        greenLabel.setBounds(110,110,400,400);
        greenLabel.setBackground(Color.green);
        greenLabel.setOpaque(true);

        block = new JLabel("Black");
        block.setBounds(120,120,100,100);
        block.setBackground(Color.black);
        block.setOpaque(true);

        jp = new JLayeredPane();
        jp.setPreferredSize(new Dimension(500,500));
        jp.add(redLabel,Integer.valueOf(0));
        jp.add(blueLabel,Integer.valueOf(1));
        jp.add(greenLabel,Integer.valueOf(2));
        jp.add(block,Integer.valueOf(3));

        add(p1, BorderLayout.NORTH);
        add(jp, BorderLayout.CENTER);

        addMouseMotionListener(new MouseAdapter(){
            @Override
            public void mouseMoved(MouseEvent e){
                block.setLocation(e.getX(),e.getY()-50);
            }
        });


    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(red.isSelected())
                jp.setLayer(block,Integer.valueOf(0));
        if(blue.isSelected())
                jp.setLayer(block,Integer.valueOf(1));
        if(green.isSelected())
                jp.setLayer(block,Integer.valueOf(2));
    }

}
public class Demo {
    public static void main(String[] args) {
        MyFrame2 m = new MyFrame2();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setSize(800,800);
        m.setVisible(true);
    }
}
