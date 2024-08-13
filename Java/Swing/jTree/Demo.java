package jTree;


import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;
import java.io.File;

class MyFrame extends JFrame implements TreeSelectionListener {
    JLabel label;
    JTree tree;
    MyFrame (){
        super("J Tree Demo");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("D:");
        File f = new File("D:");

        if(f!= null) {
            for (File x : f.listFiles()) {
                if (x.isDirectory()) {
                    File[] subFiles = x.listFiles();
                    DefaultMutableTreeNode subRoot = new DefaultMutableTreeNode(x.getName());
                    if(subFiles!=null) {
                        for (File y : subFiles) {
                            subRoot.add(new DefaultMutableTreeNode(y.getName()));
                        }
                    }
                    root.add(subRoot);
                }
                root.add(new DefaultMutableTreeNode(x.getName()));
            }
        }
        tree = new JTree(root);
        label = new JLabel("No file is selected");

        tree.addTreeSelectionListener(this);
        JScrollPane sp = new JScrollPane(tree);
        add(sp, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);
    }

    @Override
    public void valueChanged(TreeSelectionEvent e){
        label.setText(e.getPath().toString());
    }
}

public class Demo {
    public static void main(String[] args) {
        MyFrame m = new MyFrame();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setSize(420, 420);
        m.setVisible(true);
    }
}