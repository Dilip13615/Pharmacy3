package com.crud.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.crud.model.Pharmacy;
public class PharmacyService implements PharmacyCrud{

	@Override
	public int insertRecord(Pharmacy pharmacy) {
		int result=0;
		try {
			Connection con=PharmacyConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into pharmacy(trans_id, username,mode,amount) values(?,?,?,?)");
			ps.setInt(1,pharmacy.getTrans_id());
			ps.setString(2,pharmacy.getUsername());
			ps.setString(3,pharmacy.getMode());
			ps.setInt(4,pharmacy.getAmount());
			result=ps.executeUpdate();
			con.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	return result;
	}

	@Override
	public int updateRecord(Pharmacy pharmacy) {
		int result=0;
		try {
			Connection con=PharmacyConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("update pharmacy set username=?,mode=?,amount=? where tran_id=?");
			ps.setInt(1,pharmacy.getTrans_id());
			ps.setString(2,pharmacy.getUsername());
			ps.setString(3,pharmacy.getMode());
			ps.setInt(4,pharmacy.getAmount());
			result=ps.executeUpdate();
			con.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		 
		return result;
	}

	@Override
	public int deleteRecord(int trans_id) {
		 
		int result=0;
		try {
			Connection con=PharmacyConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from pharmacy where trans_id=?");
			ps.setInt(1,trans_id);
			 
			 
			result=ps.executeUpdate();
			con.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return result; 
	}

	@Override
	public List<Pharmacy> getAllRecords() {
		 ArrayList<Pharmacy> list=new ArrayList<>();
		 try {
			 Connection con=PharmacyConnection.getConnection();
			 Statement stmt=con.createStatement();
			 ResultSet rs=stmt.executeQuery("select* from pharmacy");
			 while(rs.next()) {
				 list.add(new Pharmacy(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
			 }
			 stmt.close();
			 con.close();
		 }
		 catch(Exception e){
				e.printStackTrace();
			}
		 
		return list;
	}

	@Override
	public Pharmacy getPharmacyByTrans_id(int trans_id) {
		Pharmacy pharmacy=null;
		try{
			Connection con=PharmacyConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("Select * from studentdetails where trans_id=?");
			ps.setInt(1, trans_id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
				pharmacy=new Pharmacy(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			
			con.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return pharmacy;
		
		 
	}

}
