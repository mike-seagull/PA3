package soap;

import java.util.Date;

public class Review {
	String source;
	String playName;
	String reviewName;
	Date date;
	String genre = "";
	String review;
	
	public Review(	String source, String playName, String reviewName, Date date, String review) {
		this.source = source;
		this.playName = playName;
		this.reviewName = reviewName;
		this.date = date;
		this.review = review;
	}
	public Review(	String source, String playName, String reviewName, Date date, String genre, String review) {
		this.source = source;
		this.playName = playName;
		this.reviewName = reviewName;
		this.date = date;
		this.genre = genre;
		this.review = review;
	}
}
