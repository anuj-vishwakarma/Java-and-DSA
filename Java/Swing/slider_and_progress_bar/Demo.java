package slider_and_progress_bar;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// All the animations and the coloring done in this project is done using chatGPT, I still need to learn how the animations works,
// but I've learned how to make the edges smooth, which can be done using Antialiasing, we need to create the object of Graphics2D and then set
// setRenderHint() method, see the code below

class MyFrame extends JFrame implements ChangeListener{
    JPanel p1,p2;
    JSlider slider ;
    JProgressBar progressBar;
    int w = 50;
    Timer animationTimer;
    Timer debounceTimer;
    MyFrame(){
    	

        slider = new JSlider(0,100,50);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        // adding colors to slider
        slider.setForeground(Color.BLUE);
        slider.setBackground(Color.LIGHT_GRAY);


        progressBar = new JProgressBar(0,100);
        progressBar.setString("50%");
        progressBar.setStringPainted(true);
        progressBar.setValue(50); // to make progress bar already filled by 50 %
//        progressBar.setIndeterminate(true);

        //ADDING COLORS TO PROGRESS BAR
        progressBar.setForeground(Color.GREEN);
        progressBar.setBackground(Color.DARK_GRAY);

        p1 = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g); // Clears previous drawing
                Graphics2D g2d = (Graphics2D) g.create();

                // Enable antialiasing for smoother edges
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(Color.RED);
                g2d.drawOval(200,200,w,w);
                g2d.setColor(new Color(255,0,0,128));
                g2d.fillOval(200,200,w,w);

                g2d.dispose(); // Dispose off the Graphics2D object
            }
        };


        p2 = new JPanel();
        p2.add(progressBar);

        add(slider, BorderLayout.NORTH);
        add(p1,BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        slider.addChangeListener(this);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        if (debounceTimer != null && debounceTimer.isRunning()) {
            debounceTimer.restart(); // Restart the debounce timer
        } else {
            debounceTimer = new Timer(100, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    debounceTimer.stop();
                    startAnimation();
                }
            });
            debounceTimer.setRepeats(false); // Only execute once after delay
            debounceTimer.start(); // Start the debounce timer
        }
    }
    private void startAnimation() {
        int targetW = slider.getValue();
        if (animationTimer != null && animationTimer.isRunning()) {
            animationTimer.stop(); // Stop any ongoing animation
        }
        animationTimer = new Timer(10, null); // Create a timer for animation
        animationTimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (w < targetW) {
                    w++;
                } else if (w > targetW) {
                    w--;
                } else {
                    animationTimer.stop(); // Stop the timer when the target size is reached
                }
                p1.repaint();
                progressBar.setString(w + "%");
                progressBar.setValue(w);
            }
        });
        animationTimer.start(); // Start the timer
    }
}
public class Demo {
    public static void main(String [] args){
        MyFrame m = new MyFrame();
        m.setSize(800,800);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
