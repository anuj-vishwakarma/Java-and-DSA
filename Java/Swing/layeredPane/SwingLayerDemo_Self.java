package layeredPane;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
class MyFrame1 extends JFrame{
    JRadioButton redButton, blueButton, greenButton;
    JLabel redLabel, blueLabel, greenLabel, block;
    JLayeredPane jp;

    MyFrame1(){
        redButton = new JRadioButton("Red");
        blueButton = new JRadioButton("Blue");
        greenButton = new JRadioButton("Green", true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(redButton);
        bg.add(blueButton);
        bg.add(greenButton);

        Listener listener = new Listener();

        redButton.addActionListener(listener);
        blueButton.addActionListener(listener);
        greenButton.addActionListener(listener);

        JPanel panel = new JPanel();
        panel.add(redButton);
        panel.add(blueButton);
        panel.add(greenButton);

        redLabel = new JLabel("Red");
        redLabel.setBounds(20,20,100,100);
        redLabel.setBackground(Color.RED);
        redLabel.setOpaque(true);

        blueLabel = new JLabel("Blue");
        blueLabel.setBounds(40,60,150,150);
        blueLabel.setBackground(Color.BLUE);
        blueLabel.setOpaque(true);

        greenLabel = new JLabel("Green");
        greenLabel.setBounds(60,100,200,200);
        greenLabel.setBackground(Color.GREEN);
        greenLabel.setOpaque(true);

        block = new JLabel("b");
        block.setBounds(100,100,50,50);
        block.setBackground(Color.BLACK);
        block.setOpaque(true);

        jp = new JLayeredPane();
//        jp.setPreferredSize(new Dimension(500,500));
        jp.add(redLabel, Integer.valueOf(0));
        jp.add(blueLabel, Integer.valueOf(1));
        jp.add(greenLabel, Integer.valueOf(2));
        jp.add(block, Integer.valueOf(3));

        add(panel,BorderLayout.NORTH);
        add(jp,BorderLayout.CENTER);

        addMouseMotionListener(new MouseAdapter(){
            @Override
            public void mouseMoved(MouseEvent e){
                block.setLocation(e.getX(), e.getY());
            }
        });
    }
    class Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(redButton.isSelected())
                jp.setLayer(block,Integer.valueOf(1)); // unnecessary boxing done, integral values can be used too
            if(blueButton.isSelected())
                jp.setLayer(block,Integer.valueOf(2));
            if(greenButton.isSelected())
                jp.setLayer(block,Integer.valueOf(3));
        }
    }
}
public class SwingLayerDemo_Self {
    public static void main(String [] args){
        MyFrame1 m = new MyFrame1();
        m.setSize(500,500);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
