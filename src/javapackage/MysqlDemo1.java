package javapackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlDemo1 {

	public static void main(String[] args) throws Exception {
		
		//creating connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/guvi", "root" , "Viji@9843116611");
		
		//creating statement
		
		Statement s = con.createStatement();
		
		String ins = "insert into student_info values (8,'Mathi',100,'Salem')";
		
		//executing statement
		
		s.execute(ins);
		
		//closing connection
		
		con.close();
		
		System.out.println("Query executed succesfully");

	}

}
