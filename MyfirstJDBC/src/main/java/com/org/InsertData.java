package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/f", "root","root" );
			PreparedStatement pst=con.prepareStatement("insert into user(name,age,mobile) values (?,?,?)");
			pst.setString(1, "Saswat");
			pst.setInt(2, 23);
			pst.setLong(3, 7327858936l);
			pst.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
