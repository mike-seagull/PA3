package rest;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ReviewsByNameService")
public class ReviewsByNameService {
	
   ReviewsByNameData reviewByNameData = new ReviewsByNameData();
   
   @GET
   @Path("/reviews/{name}")
   @Produces(MediaType.APPLICATION_XML)
   public ReviewsByName getReviewByGenreVal(@PathParam("name") String name){
	   	return reviewByNameData.getReviewByName(name);
   }
   

}

