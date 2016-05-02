package rest;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ReviewsByDateService")
public class ReviewsByDateService {
	
   ReviewsByDateData reviewsByDateData = new ReviewsByDateData();
   
   @GET
   @Path("/reviews")
   @Produces(MediaType.APPLICATION_XML)
   public List<ReviewsByDate> getReviewsDate(){
      return reviewsByDateData.getAllReviewsByDate();
   }
   

}

