package serverjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class H2Server {
	 public static void main(String[] args) throws SQLException {
	        String jdbcURL = "jdbc:h2:tcp://localhost/~/test";
	        String username = "usergio";
	        String password = "1234";
	        
	        Connection connection = DriverManager.getConnection(jdbcURL, username, password);
	        System.out.println("Connected to H2 in server mode.");
	        
	        
	        //String sql = "INSERT INTO students (id, name) values (3, 'Po')";
	        String sql = "INSERT INTO students (name) values ('Lisa')";
	        
	        //String sql = "SELECT * FROM students";
	 
	        Statement statement = connection.createStatement();
	        int resultINSERT = statement.executeUpdate(sql);
	 
	        if(resultINSERT>0) {
	        	System.out.println("Se inserto un registro");
	        }
	        
	 
	        sql = "SELECT * FROM students";
	 
	        statement = connection.createStatement();
	 
	        ResultSet resultSet = statement.executeQuery(sql);
	 
	        int count = 0;
	 
	        while (resultSet.next()) {
	            count++;
	 
	            int ID = resultSet.getInt("ID");
	            String name = resultSet.getString("name");
	            System.out.println("Student #" + count + ": " + ID + ", " + name);
	        }
	        
	        
	 
	        connection.close();
	    }
}
