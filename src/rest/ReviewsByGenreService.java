package rest;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ReviewsByGenreService")
public class ReviewsByGenreService {
	
   ReviewsByGenreData reviewsByGenreData = new ReviewsByGenreData();
  
   @GET
   @Path("/reviews")
   @Produces(MediaType.APPLICATION_XML)
   public List<ReviewsByGenre> getReviewsGenre(){
      return reviewsByGenreData.getAllReviewsByGenre();
   }
   
   @GET
   @Path("/reviews/{genre}")
   @Produces(MediaType.APPLICATION_XML)
   public ReviewsByGenre getReviewByGenreVal(@PathParam("genre") String genre){
	   	return reviewsByGenreData.getReviewByGenreVal(genre);
   }

}

