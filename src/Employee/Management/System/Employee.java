package Employee.Management.System;

import javax.swing.*;
import java.awt.*;

public class Employee extends JFrame {
    Employee() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/front.png"));
        Image i2 = i1.getImage().getScaledInstance(1000,550,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1000,550);
        add(image);

        setSize(1000,550);
        setLocation(260,100);
        setLayout(null);
        setVisible(true);

        try {
            Thread.sleep(4000);
            setVisible(false);
            new Login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        new Employee();
    }
}
