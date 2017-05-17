package database;

import net.sourceforge.htmlunit.corejs.javascript.ast.WhileLoop;
import org.junit.Test;

import java.sql.*;

/**
 * Created by breddy on 12-05-2017.
 */
public class ConnectMySql {

    @Test
    public void testDB() throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.jdbc.Driver");  // Class is a feature in java and forName is a method contains database name which we need to connect
        //above we passed mysql database

        System.out.println("driver loaded");

        // below we are connecting to database
        //jdbc:mysql://hostname:port/dbname","username","password"
      Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","chintu");
        System.out.println("connected to mysql db");

       Statement smt= con.createStatement(); //createStatement is  an interface in java helps to execute any database query
        ResultSet rs= smt.executeQuery("select * from employee");

        while(rs.next())
        {
       String employeename= rs.getString("empname");
            System.out.println("Database name   "+employeename);

        }
    }
}
