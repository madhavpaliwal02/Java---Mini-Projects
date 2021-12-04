package advance.Projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DC_MyWindow extends JFrame {

    private JLabel heading, clockLabel;
    private Font font = new Font ("", Font.BOLD, 35);

    DC_MyWindow(){
        super.setTitle("Digital Clock");
        super.setSize(400,400);
        super.setLocation(300,50);
        this.createGUI();
        super.setVisible(true);
    }


    public void createGUI(){
        heading = new JLabel("My Clock");
        heading.setFont(font);

        clockLabel = new JLabel("Clock");
        clockLabel.setFont(font);

        this.startClock();

        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);
    }


    public void startClock() {

        // Way - 1 : Through ActionListener
        /*Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String dateTime = new Date().toString();
                String dateTime = new Date().toLocaleString();

                clockLabel.setText(dateTime);
            }
        });
        timer.start();*/

        // Way - 2 : Through Thread
        Thread t = new Thread() {
            public void run() {
                try {
                    while (true) {
                        String dateTime = new Date().toLocaleString();

                        clockLabel.setText(dateTime);

                        Thread.sleep(1000);
                    } // end of while
                } // end of try
                catch (Exception e) { e.printStackTrace(); }
            } // end of run
        }; // end of thread

        t.start();

    } // end of startClock()

} // end of class
