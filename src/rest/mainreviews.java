package rest;

import java.util.List;
import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

public class mainreviews  {

   private Client client;
   private String REST_SERVICE_URL = "http://localhost:8080/pa3/Theatre/plays";

   private static final String PASS = "pass";
   private static final String FAIL = "fail";

   private void init(){
      this.client = ClientBuilder.newClient();
   }

   public static void main(String[] args){
	   mainreviews val = new mainreviews();
	   val.init();
	   Scanner scn = new Scanner(System.in);
	   System.out.println("Enter option :");
	   System.out.println("1. List all theatre plays.");
	   System.out.println("2. List play Reviews by Genre.");
	   System.out.println("3. List play reviews by date.");
	   System.out.println("4. List play reviews by source.");
	   System.out.println("5. Search reviews by name.");
	   
	   int option = scn.nextInt();
	   
	   if(option == 1)
	   {
		   System.out.println("1");
		   val.testGetAllPlays();
	   }
	   else if(option == 2)
	   {
		   System.out.println("2");
		   val.testGetAllReviewsByGenre();
	   }
	   else if(option == 3)
	   {
		   System.out.println("3");
		   val.testGetAllReviewsByDate();
	   }
	   else if(option == 4)
	   {
		   System.out.println("4");
		   val.testGetAllReviewsBySource();
	   }
	   else if(option == 5)
	   {
		   System.out.println("5");
	   }
	   else
	   {
		   System.out.println("wrong option");
		   val.testSearchReviewsByName();
	   }

   }
  
   private void testGetAllPlays(){
      GenericType<List<TheatrePlay>> list = new GenericType<List<TheatrePlay>>() {};
      List<TheatrePlay> plays = client
         .target(REST_SERVICE_URL)
         .request(MediaType.APPLICATION_XML)
         .get(list);
      String result = PASS;
      if(plays.isEmpty()){
         result = FAIL;
      }
      System.out.println("testGetAllPlays, Result: " + result );
   }
   
   private void testGetAllReviewsByGenre(){
	      GenericType<List<ReviewsByGenre>> list = new GenericType<List<ReviewsByGenre>>() {};
	      List<ReviewsByGenre> reviewsByGenre = client
	         .target(REST_SERVICE_URL)
	         .request(MediaType.APPLICATION_XML)
	         .get(list);
	      String result = PASS;
	      if(reviewsByGenre.isEmpty()){
	         result = FAIL;
	      }
	      System.out.println("testGetAllReviewsByGenre, Result: " + result );
	   }

   private void testGetAllReviewsByDate(){
	      GenericType<List<ReviewsByDate>> list = new GenericType<List<ReviewsByDate>>() {};
	      List<ReviewsByDate> reviewsByDate = client
	         .target(REST_SERVICE_URL)
	         .request(MediaType.APPLICATION_XML)
	         .get(list);
	      String result = PASS;
	      if(reviewsByDate.isEmpty()){
	         result = FAIL;
	      }
	      System.out.println("testGetAllReviewsByDate, Result: " + result );
	   }
   
   private void testGetAllReviewsBySource(){
	      GenericType<List<ReviewsBySource>> list = new GenericType<List<ReviewsBySource>>() {};
	      List<ReviewsBySource> reviewsBySource = client
	         .target(REST_SERVICE_URL)
	         .request(MediaType.APPLICATION_XML)
	         .get(list);
	      String result = PASS;
	      if(reviewsBySource.isEmpty()){
	         result = FAIL;
	      }
	      System.out.println("testGetAllReviewsBySource, Result: " + result );
	   }
   
   private void testSearchReviewsByName(){
	      GenericType<List<ReviewsByName>> list = new GenericType<List<ReviewsByName>>() {};
	      List<ReviewsByName> reviewsByName = client
	         .target(REST_SERVICE_URL)
	         .request(MediaType.APPLICATION_XML)
	         .get(list);
	      String result = PASS;
	      if(reviewsByName.isEmpty()){
	         result = FAIL;
	      }
	      System.out.println("testSearchReviewsByName, Result: " + result );
	   }
}
