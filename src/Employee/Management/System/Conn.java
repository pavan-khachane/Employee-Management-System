package Employee.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    public static Connection connection;

    Statement statement;

    public Conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //ha driver install ahe ka
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","MYSQL@25");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
