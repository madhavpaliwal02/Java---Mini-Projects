package Projects;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class RegistrationForm extends JFrame {

    RegistrationForm(){
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Nayan\\IdeaProjects\\Applet\\src\\pic.jpg"));
        setDefaultCloseOperation(3);
        setBounds(150, 50, 1014, 597);
        setResizable(false);


        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(panel);
        panel.setLayout(null);

        JLabel header = new JLabel("New User Resgister");
        header.setBounds(362, 52, 380, 50);
        header.setFont(new Font("Times New Roman", Font.BOLD,40));
        panel.add(header);


        JLabel fname = new JLabel("First Name");
        fname.setBounds( 58, 152, 99, 43);
        fname.setFont(new Font("Tahoma", Font.PLAIN,20));
        panel.add(fname);

        JLabel lname = new JLabel("Last Name");
        lname.setBounds( 542, 159, 99, 29);
        lname.setFont(new Font("Tahoma", Font.PLAIN,20));
        panel.add(lname);

        JLabel uname = new JLabel("User Name");
        uname.setBounds( 58, 243, 110, 29);
        uname.setFont(new Font("Tahoma", Font.PLAIN,20));
        panel.add(uname);

        JLabel pass = new JLabel("Password");
        pass.setBounds( 542, 245, 99, 24);
        pass.setFont(new Font("Tahoma", Font.PLAIN,20));
        panel.add(pass);

        JLabel email = new JLabel("E-mail");
        email.setBounds( 58, 324, 124, 36);
        email.setFont(new Font("Tahoma", Font.PLAIN,20));
        panel.add(email);

        JLabel mobno = new JLabel("Mobile Number");
        mobno.setBounds( 542, 329, 139, 26);
        mobno.setFont(new Font("Tahoma", Font.PLAIN,20));
        panel.add(mobno);


        // Text fields
        JTextField fntf = new JTextField();
        fntf.setBounds(214, 151, 228, 50);
        fntf.setFont(new Font("Tahoma", Font.PLAIN,32));
        fntf.setColumns(10);
        panel.add(fntf);

        JTextField lntf = new JTextField();
        lntf.setBounds(707, 151, 228, 50);
        lntf.setFont(new Font("Tahoma", Font.PLAIN,32));
        lntf.setColumns(10);
        panel.add(lntf);

        JTextField untf = new JTextField();
        untf.setBounds(214, 235, 228, 50);
        untf.setFont(new Font("Tahoma", Font.PLAIN,32));
        untf.setColumns(10);
        panel.add(untf);

        JPasswordField ptf = new JPasswordField();
        ptf.setBounds(707, 235, 228, 50);
        ptf.setFont(new Font("Tahoma", Font.PLAIN,32));
        ptf.setColumns(10);
        panel.add(ptf);

        JTextField emtf = new JTextField();
        emtf.setBounds(214, 320, 228, 50);
        emtf.setFont(new Font("Tahoma", Font.PLAIN,32));
        emtf.setColumns(10);
        panel.add(emtf);

        JTextField mntf = new JTextField();
        mntf.setBounds(707, 320, 228, 50);
        mntf.setFont(new Font("Tahoma", Font.PLAIN,32));
        mntf.setColumns(10);
        panel.add(mntf);

        // Button
        JButton btn = new JButton("Register");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fname = fntf.getText();
                String lname = lntf.getText();
                String uname = untf.getText();
                String pass = ptf.getText();
                String email = emtf.getText();
                String mobno = mntf.getText();
                int len = mobno.length();

                String msg = "" + fname;
                if (len != 10) {
                    JOptionPane.showMessageDialog(btn, "\nEnter a valid mobile number");
                }

                try{
                    String url = "jdbc:mysql://localhost:3306/swing";
                    Connection con = DriverManager.getConnection(url,"root","123456");

                    String q = "insert into account values ('" + fname + "','" + lname + "','" + uname + "','"  + pass + "','" + email + "','" + mobno + "')";
                    Statement stmt = con.createStatement();

                    int x = stmt.executeUpdate(q);
                    if (x==0)
                        JOptionPane.showMessageDialog(btn, "This is already exist");
                    else
                        JOptionPane.showMessageDialog(btn, "Welcome, " +msg+ "Your account is succesfully created");

                    con.close();
                }catch (Exception ex){
                    ex.printStackTrace();
                }

            }   // end of actionPerformed
        }); // end of addActionListener

        btn.setBounds( 399, 447, 259, 74);
        btn.setFont(new Font("Tahoma", Font.PLAIN,25));
        panel.add(btn);

    }

    // Driver Function
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    RegistrationForm frame = new RegistrationForm();
                    frame.setVisible(true);
                } catch (Exception e) { e.printStackTrace(); }
            } // end of run
        }); // end of event queue

    } // end of main (Driver func)
} // end of class
