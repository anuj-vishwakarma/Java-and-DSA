import javax.swing.*;
import java.awt.*;

public class MyPCApp extends JFrame {

    private JTree fileTree;
    private JTextArea systemInfoArea;

    public MyPCApp() {
        setTitle("My PC Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);

        fileTree = new JTree();
        JScrollPane fileTreeScrollPane = new JScrollPane(fileTree);

        systemInfoArea = new JTextArea();
        JScrollPane systemInfoScrollPane = new JScrollPane(systemInfoArea);

        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.add(fileTreeScrollPane, BorderLayout.WEST);
        contentPane.add(systemInfoScrollPane, BorderLayout.CENTER);

        setContentPane(contentPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyPCApp());
    }
}
