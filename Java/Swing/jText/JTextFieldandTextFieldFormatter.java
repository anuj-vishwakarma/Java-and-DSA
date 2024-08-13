package jText;


import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.text.*;
import java.awt.*;
import java.util.Locale;

class MyFrame extends JFrame{
    MyFrame(){

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        DateFormat d;
        d = new SimpleDateFormat("MMMM/dd/yyyy");
        JTextField tf1 = new JTextField(15);
        JFormattedTextField tf2 = new JFormattedTextField(nft);
        tf2.setColumns(15);
        tf2.setValue(2);
//        tf1.addActionListener(); /* when you write inside the text field and hit enter then an action event is created also */
        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);

    }
}
public class JTextFieldandTextFieldFormatter {
    public static void main(String[] args) {
        MyFrame m = new MyFrame();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setSize(500,500);
        m.setVisible(true);
    }
}
