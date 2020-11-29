package gestion.factory;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	private static Connection con;
 static  {

		 /*	String  url = "jdbc:mysql://localhost:3306/namdb";*/
			/*Class.forName(classNa);*/ 
			String username = "root";
			String password = "password";	
			
			try {	
				
		
		 
		 Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/namdb","root","password");

	        
		}
		catch(Exception e) {
			System.out.println("oops error");
			e.printStackTrace();
			
		}
	}
	
	public static Connection getConnection() {
		return con;
	}
}
