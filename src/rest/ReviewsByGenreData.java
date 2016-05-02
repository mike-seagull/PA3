package rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReviewsByGenreData {

	
	public ReviewsByGenreData() 
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
	
	public List<ReviewsByGenre> getAllReviewsByGenre() {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Connection con = null;
		try {
			List<ReviewsByGenre> reviews = new ArrayList<ReviewsByGenre>();

			con = getConnection();

			stmt = con.prepareStatement("select * from reviewtab");
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				ReviewsByGenre review = new ReviewsByGenre();
				review.setId(rs.getInt(1));
				review.setReviewsByGenre(rs.getString(7));
				
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
	
	public ReviewsByGenre getReviewByGenreVal(String genre) {
		
		PreparedStatement stmt1 = null;
		ResultSet rs1 = null;
		Connection con1 = null;
		
		try {
			List<ReviewsByGenre> reviews = new ArrayList<ReviewsByGenre>();
			con1 = getConnection();
			stmt1 = con1.prepareStatement("select * from reviewtab where genre = '"+genre+"';");
			System.out.print(stmt1);
			rs1 = stmt1.executeQuery();
			ReviewsByGenre review = new ReviewsByGenre();
			while (rs1.next()) {
				review.setId(rs1.getInt(1));
				review.setReviewsByGenre(rs1.getString(6));
				reviews.add(review);
			}
			return review;
		} 
		catch (Exception ex) 
		{
			ex.printStackTrace();
		} 
		finally 
		{
			if (rs1 != null) {
				try 
				{
					rs1.close();
				} 
				catch (Exception ex) 
				{
					ex.printStackTrace();
				} 
				rs1 = null;
			}

			if (stmt1 != null) {
				try 
				{
					stmt1.close();
				} 
				catch (SQLException ex) 
				{
					ex.printStackTrace();
				} 

				stmt1 = null;
			}
			if(con1 != null)
			{
				try 
				{
					con1.close();
				} 
				catch (SQLException ex) 
				{
					ex.printStackTrace();
				} 

				con1 = null;
			}

		}
		return null;
	}

}

