package org.test.notice;


import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class DBconnectTest {
	private String url = "jdbc:mysql://localhost:3306/newlec?serverTimezone=UTC";
	private String uid = "root";
	private String pwd = "1041";
	private String driver = "com.mysql.cj.jdbc.Driver";
	 
	 @Test
	 public void testConnection() throws Exception{
	  Class.forName(driver);
	  
	  try(Connection con = DriverManager.getConnection(url,uid,pwd)){
	   System.out.println("성공");
	   System.out.println(con);
	  }catch (Exception e) {
	   System.out.println("에러발생");
	   e.printStackTrace();
	  }
	 }

	}
