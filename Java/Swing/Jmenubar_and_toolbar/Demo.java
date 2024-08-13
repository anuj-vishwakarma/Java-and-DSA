package Jmenubar_and_toolbar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class MyFrame extends JFrame implements ActionListener {
    JToolBar tb;
    JButton b1, b2, b3, b4, b5, b6, b7;
    JTextArea ta;

    MyFrame (){
        super("Demo");
        tb = new JToolBar();
        b1 = new JButton(createScaledIcon("resources\\images\\save.png", 32,32));
        b2 = new JButton(createScaledIcon("resources\\images\\open-folder.png", 32, 32));
        b3 = new JButton(createScaledIcon("resources\\images\\plus.png", 32, 32));
        b4 = new JButton(createScaledIcon("resources\\images\\scissors.png", 32, 32));
        b5 = new JButton(createScaledIcon("resources\\images\\paste.png", 32, 32));
        b6 = new JButton(createScaledIcon("resources\\images\\split.png", 32, 32));
        b7 = new JButton(createScaledIcon("resources\\images\\cross.png", 32, 32));

// this will just add the image to button and if you change the size of the button, then the image will take images as cropped if the size is greater than button size, so to remove this problem we've created a method createScaledIcon(); below.
//        b1 = new JButton(new ImageIcon("resources\\images\\save.png"));
//        b2 = new JButton(new ImageIcon("resources\\images\\open-folder.png"));
//        b3 = new JButton(new ImageIcon("resources\\images\\plus.png"));
//        b4 = new JButton(new ImageIcon("resources\\images\\scissors.png"));
//        b5 = new JButton(new ImageIcon("resources\\images\\paste.png"));
//        b6 = new JButton(new ImageIcon("resources\\images\\split.png"));
//        b7 = new JButton(new ImageIcon("resources\\images\\cross.png"));
//        Dimension buttonSize = new Dimension(32, 32);
//        b1.setPreferredSize(buttonSize);
//        b2.setPreferredSize(buttonSize);
//        b3.setPreferredSize(buttonSize);
//        b4.setPreferredSize(buttonSize);
//        b5.setPreferredSize(buttonSize);
//        b6.setPreferredSize(buttonSize);
//        b7.setPreferredSize(buttonSize);

        tb.setSize(40,120);
        tb.add(b1);tb.add(b2);tb.add(b3);
        tb.add(new JToolBar.Separator());
        tb.add(b4);tb.add(b5);tb.add(b6);tb.add(b7);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");
        JMenuItem m2 = new JMenuItem("Open");
        m1.setMnemonic(KeyEvent.VK_O);

        file.add(m1);
        file.addSeparator();
        file.add(m2);
        mb.add(file);
        setJMenuBar(mb);

        ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);

        add(tb, BorderLayout.NORTH);
        add(sp, BorderLayout.CENTER);

        b2.setActionCommand("Open");
        b2.addActionListener(this);
        m2.addActionListener(this);

        b1.addActionListener(this);
        m1.addActionListener(this);
    }
    private ImageIcon createScaledIcon(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);
        Image image = icon.getImage(); // Transform it
        Image newimg = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH); // Scale it the smooth way
        return new ImageIcon(newimg); // Transform it back
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Open")) {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(this);
            File f = fc.getSelectedFile();

            try {
                FileInputStream fi = new FileInputStream(f);
                byte[] b = new byte[fi.available()];
                fi.read(b);

                String str = new String(b);
                ta.setText(str);
                fi.close();
            } catch (Exception fe) {
            }
        }
        else {
            Color col = JColorChooser.showDialog(this, "Font Color", Color.red);
            ta.setForeground(col);
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
