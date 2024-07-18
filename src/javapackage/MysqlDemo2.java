package javapackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlDemo2 {

	public static void main(String[] args) throws Exception {
		
		//creating connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/guvi", "root" , "Viji@9843116611");
		
		//creating statement
		
		Statement smt = con.createStatement();
		
		String s = "select id,name,marks from student_info";
		
		//executing statement
		
		ResultSet rs= smt.executeQuery(s);
		
		while(rs.next())
		{
			int sid = rs.getInt("id");
			String sname = rs.getString("name");
			int smarks = rs.getInt("marks");
			
			System.out.println(sid + " " + sname + " "+ smarks);
		}
		
		//closing connection
		
		con.close();
		
		System.out.println("Query executed succesfully");

	}

}

