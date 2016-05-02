package rest;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ReviewsBySourceService")
public class ReviewsBySourceService {
	
	ReviewsBySourceData reviewsBySourceData = new ReviewsBySourceData();

   @GET
   @Path("/reviews")
   @Produces(MediaType.APPLICATION_XML)
   public List<ReviewsBySource> getReviewsSource(){
      return reviewsBySourceData.getAllReviewsBySource();
   }
   
   @GET
   @Path("/reviews/{source}")
   @Produces(MediaType.APPLICATION_XML)
   public ReviewsBySource getReviewByGenreVal(@PathParam("source") String source){
	   	return reviewsBySourceData.getReviewsBySpecificSource(source);
   }
   

}


