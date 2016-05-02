package rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReviewsByNameData {

	
	public ReviewsByNameData() 
	{
		try 
		{	
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} 
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	}	
	
	private Connection getConnection() 
	{
		try 
		{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/world?useSSL=false", "root","ruchinarayan");
			return conn;
		} 
		
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	
	public ReviewsByName getReviewByName(String name) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Connection con = null;
		try {
			//List<ReviewsByName> reviews = new ArrayList<ReviewsByName>();
			ReviewsByName review = new ReviewsByName();
			con = getConnection();
			stmt = con.prepareStatement("select * from reviewtab where playName = '"+name+"';");
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				review.setId(rs.getInt(1));
				review.setReviewsByName(rs.getString(7));
				
				//reviews.add(review);
			}
			return review;
		} 
		catch (Exception ex) 
		{
			ex.printStackTrace();
		} 
		finally 
		{
			if (rs != null) {
				try 
				{
					rs.close();
				} 
				catch (Exception ex) 
				{
					ex.printStackTrace();
				} 
				rs = null;
			}

			if (stmt != null) {
				try 
				{
					stmt.close();
				} 
				catch (SQLException ex) 
				{
					ex.printStackTrace();
				} 

				stmt = null;
			}
			if(con != null)
			{
				try 
				{
					con.close();
				} 
				catch (SQLException ex) 
				{
					ex.printStackTrace();
				} 

				con = null;
			}

		}
		return null;
	}

}


