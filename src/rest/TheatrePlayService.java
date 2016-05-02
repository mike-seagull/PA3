package rest;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/theatre")
public class TheatrePlayService {
	
   TheatrePlayData theatrePlayData = new TheatrePlayData();

   @GET
   @Path("/plays")
   @Produces(MediaType.APPLICATION_XML)
   public List<TheatrePlay> getTheatrePlays(){
      return theatrePlayData.getAllPlays();
   }
   
   @GET
   @Path("/plays/{review_id}")
   @Produces(MediaType.APPLICATION_XML)
   public TheatrePlay getTheatrePlayReview(@PathParam("review_id") int review_id){
	   	return theatrePlayData.getReviewPlay(review_id);
   }

}
