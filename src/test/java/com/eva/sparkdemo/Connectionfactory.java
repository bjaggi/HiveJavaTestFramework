package com.eva.sparkdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connectionfactory {

	private static String driverName = "org.apache.hive.jdbc.HiveDriver";
	private static Statement stmt = null;

	public static Statement getStamentInstance() {
		if (stmt == null) {
			setup();
		}
		return stmt;
	}

	private static void setup() {
		try {
			Class.forName(driverName);
			Connection con;
			//con = DriverManager.getConnection("jdbc:hive2://localhost:10000/default", "", "");
			con = DriverManager.getConnection("jdbc:hive2://49.19.64.161:10000/", "", "");
			 stmt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
