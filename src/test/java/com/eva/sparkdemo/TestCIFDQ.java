package com.eva.sparkdemo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class TestCIFDQ extends TestCase {

	 
	
	@Test
	public void testConnectionToHiveSandbox(){
		Assert.assertNotNull(Connectionfactory.getStamentInstance());
	}
	@Test
	public void testDataPresentInTable_XCIFBAS() {
		// fail("Not yet implemented");
		Statement stmt = Connectionfactory.getStamentInstance();
		String sql = "select * from cif_dev.PCUSTFM_XCIFBAS";
		System.out.println("Running: " + sql);
		ResultSet res;
		try {
			res = stmt.executeQuery(sql);
			Assert.assertTrue(res.next());
			
			//assertEquals(sql.isEmpty());
			
			if (res.next() == false) {
				System.out.println(" No data Found ");
			} else {
				System.out.println(" Data fetched");
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	@Test
	public void testCustomer_10102131_Present() {
		// fail("Not yet implemented");
		Statement stmt = Connectionfactory.getStamentInstance();
		String sql = "select * from cif_dev.PCUSTFM_XCIFBAS";
		System.out.println("Running: " + sql);
		ResultSet res;
		try {
			res = stmt.executeQuery(sql);
			
			Assert.assertNotNull(res);
			//assertEquals(sql.isEmpty());
			
			if (res.next() == false) {
				System.out.println(" No data Found ");
			} else {
				System.out.println(" Data fetched");
	
				String c0 = res.getString("pcustfm_xcifbas.custm_cust_key_bank");
				String c1 = res.getString("pcustfm_xcifbas.custm_cust_key_type");
				String c2 = res.getString("pcustfm_xcifbas.custm_cust_key_num");
				

				
				System.out.println(c0 + " , " + c1 + " , " + c2 );
				Assert.assertEquals(c2, "10102131");
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}
	
	
}
