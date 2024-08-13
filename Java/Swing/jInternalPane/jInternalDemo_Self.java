package jInternalPane;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MyInternalFrame1 extends JInternalFrame{
    JTextArea ta;
    JScrollPane sp;
    static int counter = 0;

    MyInternalFrame1(){
        super("Document " + (++counter), true, true, true, true);
        ta = new JTextArea(" ");
        sp = new JScrollPane(ta);
        add(sp);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem item1 = new JMenuItem("Save");
        file.add(item1);
        menuBar.add(file);
        setJMenuBar(menuBar);

        setSize(500,500);
        setLocation(50,50);
        setVisible(true);
    }

}
class MyFrame1 extends JFrame implements ActionListener {
    JDesktopPane jp;
    MyFrame1(){
        super("Internal Pane Demo");
        jp = new JDesktopPane();
        setContentPane(jp);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Document");
        JMenuItem item = new JMenuItem("New");

        menu.add(item);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        item.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        MyInternalFrame1 m  = new MyInternalFrame1();
        jp.add(m);
    }
}
public class jInternalDemo_Self {
    public static void main(String [] args){
        MyFrame1 m = new MyFrame1();
        m.setSize(800,800);
        m.setVisible(true);
    }
}
