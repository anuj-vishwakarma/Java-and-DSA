package Jspinner_list_and_combo_box;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener, ListSelectionListener, ChangeListener {
    JComboBox cb ;
    JList  list;
    JSpinner sp1, sp2;
    JTextField tf ;

    MyFrame(){
        super("Spinner Demo");
        String [] countries = {"India", "US", "UK", "Canada", "Australia"}; // Data / Model
        String [] months = {"January", "February","March", "April", "May", "June"};
        String [] days = {"Monday", "Tuesday", "Thursday", "Friday", "Saturday", "Sunday"};

        cb = new JComboBox(countries); // Visual representation of data, View, now action performed are done using listeners which we can call it as CONTROLLER,

        // altogether we call it as MVC, Model View Controller,
        // Swing supports MVC Architecture (in-built)

        list = new JList(months);
        tf = new JTextField(15);
        list.setVisibleRowCount(3);
        sp1 = new JSpinner(new SpinnerNumberModel(1, 1,31,1));
        sp2 = new JSpinner(new SpinnerListModel(days));
        setLayout(new FlowLayout());
        add(cb);
        add(sp1);add(sp2);
        add(tf);
        add(new JScrollPane(list));

        cb.addActionListener(this);
        list.addListSelectionListener(this);
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        tf.setText((String)cb.getSelectedItem());
    }
    public void valueChanged(ListSelectionEvent e){
        tf.setText((String)list.getSelectedValue());
    }
    @Override
    public void stateChanged(ChangeEvent e){
        if(e.getSource() == sp1)
            tf.setText(sp1.getValue()+"");
        else
            tf.setText(sp2.getValue()+"");
    }
}
public class Demo {
    public static void main(String [] args){
        MyFrame m = new MyFrame();
        m.setSize(300,300);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
