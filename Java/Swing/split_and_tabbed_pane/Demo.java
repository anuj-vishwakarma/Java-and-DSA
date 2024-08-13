package split_and_tabbed_pane;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Color;
class MyFrame extends JFrame implements ListSelectionListener {
    JSplitPane sp;
    JList list;
    JLabel lbl;
    MyFrame(){
        String [] colors = {"RED", "GREEN", "BLUE", "YELLOW", "MAGENTA", "ORANGE","BLACK"};
        // data is called Model,
        list = new JList(colors); // creating the list, it is called as View, it is using data
        // the component which uses model is called view
        list.setSelectedIndex(0);
        JScrollPane p1 = new JScrollPane(list);

        lbl = new JLabel(" ");
        lbl.setOpaque(true);
        lbl.setBackground(Color.RED);
        JScrollPane p2 = new JScrollPane(lbl);


//        sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p1, p2);
//        sp.setDividerLocation(200);
//        add(sp); // or setContentPane(sp);

        JTabbedPane tp = new JTabbedPane();
        tp.addTab("Colors", p1);
        tp.addTab("Labels", p2);
        add(tp);

        list.addListSelectionListener(this);
    }
    @Override
    public void valueChanged(ListSelectionEvent e){
        String str = (String)list.getSelectedValue();
        switch(str){
            case "RED" ->lbl.setBackground(Color.RED);
            case "GREEN" ->lbl.setBackground(Color.GREEN);
            case "BLUE" ->lbl.setBackground(Color.BLUE);
            case "YELLOW" ->lbl.setBackground(Color.YELLOW);
            case "MAGENTA" ->lbl.setBackground(Color.MAGENTA);
            case "ORANGE" ->lbl.setBackground(Color.ORANGE);
            case "BLACK" ->lbl.setBackground(Color.BLACK);
        }
    }
}
public class Demo {
    public static void main(String [] args){
        MyFrame m = new MyFrame();
        m.setSize(500,500);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
