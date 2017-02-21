package com.eva.sparkdemo;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
//import org.apache.hive.jdbc.HiveDriver;
//import org.apache.hadoop.hive.jdbc.HiveDriver;
 
public class PPHiveQuery {
  //private static String driverName = "org.apache.hive.jdbc.HiveDriver";
	private static String driverName = "org.apache.hadoop.hive.jdbc.HiveDriver";
  public static void main(String[] args) throws SQLException {
    try {
    	
      Class.forName(driverName);
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      System.exit(1);
    }
    Connection con = DriverManager.getConnection("jdbc:hive2://localhost:10000/default", "", "");
    Statement stmt = con.createStatement();
    String sql = "select * from cif_dev.PCUSTFM_XCIFBAS";
    System.out.println("Running: " + sql);
    ResultSet res = stmt.executeQuery(sql);
    while (res.next()) {
    	 System.out.println(res.getString(1)+"," + res.getString(2)+"," + res.getString(3)+"," + res.getString(4)+","+ res.getString(5)+",") ;
         
    }
    // describe table
    
   /* while (res.next()) {
    	
        
        System.out.println(res.getString(1)+",");
        System.out.println( res.getString(2)+",") ;
        System.out.println( res.getString(3)+",") ;
        System.out.println( res.getString(4)+",") ;
        System.out.println( res.getString(5)+",") ;
        System.out.println();
      }*/
    
 
    
  }
}