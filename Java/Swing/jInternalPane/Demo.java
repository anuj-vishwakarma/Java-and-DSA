package jInternalPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyInternalFrame extends JInternalFrame {
    static int counter = 0;
    TextArea ta;
    JScrollPane sp;
    MyInternalFrame(){
        super("Document " + (++counter), true, true,true,true);
        ta = new TextArea();
        sp = new JScrollPane(ta);
        add(sp);

        JMenuBar mb = new JMenuBar();
        JMenu file  = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");
        JMenuItem m2 = new JMenuItem("Close");
        file.add(m1);
        file.add(m2);
        mb.add(file);
        setJMenuBar(mb);

        setSize(300,300);
        setLocation(50,50);
        setVisible(true);
    }

}
class MyFrame extends JFrame implements ActionListener{
    JDesktopPane dp;
    MyFrame(){
        super("Internal Frame Demo");
        dp = new JDesktopPane();
        setContentPane(dp);

        JMenuBar mb = new JMenuBar();
        JMenu d = new JMenu("Document");
        JMenuItem m1 = new JMenuItem("New");
        d.add(m1);
        mb.add(d);
        setJMenuBar(mb);

        m1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        MyInternalFrame m1 = new MyInternalFrame();
        dp.add(m1);
    }
}
public class Demo
{
    public static void main(String [] args){
        MyFrame m = new MyFrame();
        m.setSize(500,500);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
