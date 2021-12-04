package advance.Projects;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM_Machine extends JFrame {

    private int currcard = 1;
    private CardLayout card;

    JPanel pan, pan1, pan2, pan3, pan4;
    JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12, lbl13;
    JPasswordField tf1, tf2, tf3, tf4;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7;

    ATM_Machine(){
        setTitle("ATM MACHINE");
        setBounds(350,120,600,600);

        pan = new JPanel();
        card = new CardLayout();
        pan.setLayout(card);


        //  Panel-1     VERIFICATION
        pan1 = new JPanel();
        pan1.setBorder(new EmptyBorder(5,5,5,5));
        pan1.setLayout(null);

        lbl1 = new JLabel("Verification");
        lbl1.setBounds(200,10,350,90);
        lbl1.setFont(new Font("Times New Roman", Font.BOLD,40));

        lbl2 = new JLabel("Insert your ATM Card: ");
        lbl2.setBounds(80,180,250,25);
        lbl2.setFont(new Font("Tahoma", Font.PLAIN,20));

        lbl3 = new JLabel("Enter Pin: ");
        lbl3.setBounds(190,300,250,25);
        lbl3.setFont(new Font("Tahoma", Font.PLAIN,20));

        tf1 = new JPasswordField();
        tf1.setBounds(300,300,100,25);

        btn1 = new JButton("Verify");
        btn1.setBounds(250,420,100,40);

        pan1.add(lbl1);     pan1.add(lbl2);     pan1.add(lbl3);
        pan1.add(tf1);      pan1.add(btn1);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.next(pan);
                currcard=1;
            }
        });


        //  Panel-2     HOME PAGE
        pan2 = new JPanel();
        pan2.setBorder(new EmptyBorder(5,5,5,5));
        pan2.setLayout(null);
        lbl4 = new JLabel("HOME PAGE");
        lbl4.setBounds(175,0,280,60);
        lbl4.setFont(new Font("Times New Roman", Font.BOLD,40));

        btn2 = new JButton("New Pin");
        btn2.setBounds(50,220,180,70);

        btn3 = new JButton("Check Balance");
        btn3.setBounds(50,350,180,70);

        btn4 = new JButton("Cash Withdrawl");
        btn4.setBounds(370,220,180,70);

        btn5 = new JButton("Transfer Money");
        btn5.setBounds(370,350,180,70);

        pan2.add(lbl4);     pan2.add(btn2);     pan2.add(btn3);
        pan2.add(btn4);     pan2.add(btn5);

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currcard=3;
                card.next(pan);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currcard=4;
                card.next(pan);
            }
        });


        // Panel-3      NEW PIN
        pan3 = new JPanel();
        pan3.setBorder(new EmptyBorder(5,5,5,5));
        pan3.setLayout(null);

        lbl5 = new JLabel("NEW PIN");
        lbl5.setBounds(175,30,280,60);
        lbl5.setFont(new Font("Times New Roman", Font.BOLD,40));

        lbl6 = new JLabel("Old Password:");
        lbl6.setBounds(80,200,250,35);
        lbl6.setFont(new Font("Tahoma", Font.PLAIN,20));

        tf2 = new JPasswordField();
        tf2.setBounds(300,200,170,35);

        lbl7 = new JLabel("New Password:");
        lbl7.setBounds(80,250,250,35);
        lbl7.setFont(new Font("Tahoma", Font.PLAIN,20));

        tf3 = new JPasswordField();
        tf3.setBounds(300,250,170,35);

        lbl8 = new JLabel("Confirm Password:");
        lbl8.setBounds(80,300,250,35);
        lbl8.setFont(new Font("Tahoma", Font.PLAIN,20));

        tf4 = new JPasswordField();
        tf4.setBounds(300,300,170,35);

        btn6 = new JButton("Update");
        btn6.setBounds(250,480,100,40);

        lbl9 = new JLabel("Successfully Updated!!!");

        pan3.add(lbl5);     pan3.add(lbl6);     pan3.add(lbl7);
        pan3.add(lbl8);     pan3.add(lbl9);     pan3.add(btn6);
        pan3.add(tf2);      pan3.add(tf3);      pan3.add(tf4);

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Successfully Changed !!!");
                card.first(pan);
                currcard = 1;
            }
        });


        // Panel-4      CHECK BALANCE
        pan4 = new JPanel();
        pan4.setBorder(new EmptyBorder(5,5,5,5));
        pan4.setLayout(null);

        lbl10 = new JLabel("ACCOUNT DETAILS");
        lbl10.setBounds(100,20,480,50);
        lbl10.setFont(new Font("Times New Roman", Font.BOLD,40));

        lbl11 = new JLabel("Account NO: ");
        lbl11.setBounds(80,200,250,35);
        lbl11.setFont(new Font("Tahoma", Font.PLAIN,20));

        lbl12 = new JLabel("New Password:");
        lbl12.setBounds(80,250,250,35);
        lbl12.setFont(new Font("Tahoma", Font.PLAIN,20));

        lbl13 = new JLabel("Confirm Password:");
        lbl13.setBounds(80,300,250,35);
        lbl13.setFont(new Font("Tahoma", Font.PLAIN,20));

        btn7 = new JButton("Exit");
        btn7.setBounds(250,480,100,40);

        pan4.add(lbl10);        pan4.add(lbl11);        pan4.add(lbl12);
        pan4.add(lbl13);        pan4.add(btn7);

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.first(pan);
                currcard = 1;
            }
        });




        pan.add(pan1,"1");
        pan.add(pan2,"2");
        switch(currcard){
            case 3:
                pan.add(pan3,"3");
            case 4:
                pan.add(pan4, "3");
        }


        getContentPane().add(pan, BorderLayout.CENTER);
    }








    public static void main(String[] args) {
        ATM_Machine obj = new ATM_Machine();
        obj.setDefaultCloseOperation(3);
        obj.setVisible(true);
    }
}
