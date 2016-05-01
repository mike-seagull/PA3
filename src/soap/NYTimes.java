package soap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

public class NYTimes {
	
	static LinkedList<Review> reviews = new LinkedList<Review>();
	
	public NYTimes() throws IOException, ParseException {
        URL src_url = new URL("http://localhost:8080/PA3/serve?file=NYTimes.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(src_url.openStream()));
        String line;
        while ((line = in.readLine()) != null) {
        	if(line != null && !line.isEmpty()) {
	        	String[] line_split = line.split("\\|");
	        	Date date = (Date) new SimpleDateFormat("MM/dd/yy").parse(line_split[2].trim()); //parse the date string into a Date object
	        	if (line_split.length == 4) {
	        		Review review = new Review("NYTimes", line_split[0].trim(), line_split[1].trim(), date, line_split[3].trim());
	        		reviews.add(review);
	        	}else if (line_split.length == 5) {
	        		Review review = new Review("NYTimes", line_split[0].trim(), line_split[1].trim(), date, line_split[3].trim(), line_split[4].trim());
	        		reviews.add(review);
	        	}
        	}
        }
        in.close();
	}
	public LinkedList<Review> getReviewsByDate(Date date) {
		LinkedList<Review> reviewsByDate = new LinkedList<Review>();
		for (Review r : reviews) {
			if (r.date.equals(date)) {
				reviewsByDate.add(r);
			}
		}
		return reviewsByDate;
	}
	public LinkedList<Review> getReviewsByGenre(String genre) {
		LinkedList<Review> reviewsByGenre = new LinkedList<Review>();
		for (Review r : reviews) {
			if (r.genre.equals(genre)) {
				reviewsByGenre.add(r);
			}
		}
		return reviewsByGenre;
	}
	public LinkedList<Review> getReviewsByName(String name) {
		LinkedList<Review> reviewsByName = new LinkedList<Review>();
		for (Review r : reviews) {
			if (r.playName.equals(name)) {
				reviewsByName.add(r);
			}
		}
		return reviewsByName;
	}
	public LinkedList<Review> getReviews() {
		return reviews;
	}
}
