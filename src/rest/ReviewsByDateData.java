package rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReviewsByDateData {

	
	public ReviewsByDateData() 
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
	
	public List<ReviewsByDate> getAllReviewsByDate() {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Connection con = null;
		try {
			List<ReviewsByDate> reviews = new ArrayList<ReviewsByDate>();

			con = getConnection();

			stmt = con.prepareStatement("select * from reviewtab");
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				ReviewsByDate review = new ReviewsByDate();
				review.setId(rs.getInt(1));
				review.setReviewsByDate(rs.getString(7));
				
				reviews.add(review);
			}
			return reviews;
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


