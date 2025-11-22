package Employee.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {

    Main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/home.jpeg"));
        Image i2 =i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1120,630);
        add(img);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(400,165,400,40);
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        heading.setForeground(Color.white);
        img.add(heading);

        JButton add = new JButton("Add Employee");
        add.setBounds(400,270,150,40);
        add.setForeground(Color.black);
        add.setBackground(Color.orange);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();
                setVisible(false);
            }
        });
        img.add(add);

        JButton view = new JButton("View Employee");
        view.setBounds(620,270,150,40);
        view.setForeground(Color.black);
        view.setBackground(Color.orange);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View_Employee();
                setVisible(false);
            }
        });
        img.add(view);

        JButton rem = new JButton("Remove Employee");
        rem.setBounds(510,350,150,40);
        rem.setForeground(Color.black);
        rem.setBackground(Color.orange);
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();
            }
        });
        img.add(rem);

        setSize(1120,630);
        setLocation(250,100);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {

        new Main_class();
    }
}
