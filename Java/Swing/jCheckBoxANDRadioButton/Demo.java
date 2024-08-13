package jCheckBoxANDRadioButton;


import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class MyFrame extends JFrame implements ActionListener {
        JTextField tf; JCheckBox c1, c2; JRadioButton r1, r2;
    MyFrame(){
        super("Demo");

        tf = new JTextField("Demo Text", 20);
        tf.setBounds(10,20,100,80);

        c1 = new JCheckBox("Bold");
        c1.setMnemonic(KeyEvent.VK_B);

        c2 = new JCheckBox("Italic");
        c2.setMnemonic(KeyEvent.VK_I);

        r1 = new JRadioButton("lower");
        r2 = new JRadioButton("UPPER");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        c1.addActionListener(this);
        c2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);

//        r1.setActionCommand("lower");
//        r2.setActionCommand("UPPER");

        setLayout(new FlowLayout());

        add(tf);add(c1);add(c2);add(r1);add(r2);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        switch (e.getActionCommand()){
            case "lower" -> tf.setText(tf.getText().toLowerCase());
            case "UPPER" -> tf.setText(tf.getText().toUpperCase());
        }
        int b=0, i=0;
        if(c1.isSelected())
            b = Font.BOLD;
        if(c2.isSelected())
            i = Font.ITALIC;

        Font f = new Font("Times New Roman", Font.BOLD|Font.ITALIC,15);
//        Font f = new Font("Lucida Console", b | i,15);
        tf.setFont(f);
    }
}
public class Demo
{
    public static void main(String[] args) {
        MyFrame m = new MyFrame();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
        m.setSize(420,420);
    }
}





