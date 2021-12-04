package advance.Projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Simple_Calculator extends JFrame {



    Simple_Calculator(){
        setLayout(new GridLayout(2,1));


        GridLayout gridLayout = new GridLayout(2,4,20,100);
        BorderLayout borderLayout = new BorderLayout(50,50);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
//        panel2.setLayout(gridLayout);
       ;


        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");
        JButton mod = new JButton("%");
        JButton cal = new JButton("=");
        JButton clr = new JButton("C");


        textField1.setBounds(50,30,70,50);
        textField1.setBounds(150,30,70,50);
        add.setBounds(50,100,80,30);
        sub.setBounds(50,100,80,30);
        mul.setBounds(50,100,80,30);
        div.setBounds(50,100,80,30);
        mod.setBounds(50,100,80,30);
        cal.setBounds(50,100,80,30);
        clr.setBounds(50,100,80,30);

//        add.addActionListener(this);

        panel1.add(textField1);   panel1.add(textField2);
        panel2.add(add);      panel2.add(sub);      panel2.add(mul);
        panel2.add(div);      panel2.add(mod);      //panel2.add(cal);
        panel2.add(clr);
        this.add(panel1);
//        this.add(panel2);

        this.setSize(800,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
    }

    public void actionPerformed(ActionEvent e){


    }


    public static void main(String[] args) {
        new Simple_Calculator();
    }


}
