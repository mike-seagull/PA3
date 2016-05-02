package rest;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "reviewsbydate")
public class ReviewsByDate implements Serializable {

   private static final long serialVersionUID = 1L;
   private int id;
   private String reviewsByDate;

   public ReviewsByDate(){}

   public ReviewsByDate(int id, String reviewsByDate){
      this.id = id;
      this.reviewsByDate = reviewsByDate;
   }

   public int getId() {
      return id;
   }
   @XmlElement
   public void setId(int id) {
      this.id = id;
   }
   
   public String getReviewsByDate() {
      return reviewsByDate;
   }
   @XmlElement
   public void setReviewsByDate(String reviewsByDate) {
      this.reviewsByDate = reviewsByDate;
   }	

   @Override
   public boolean equals(Object object){
      if(object == null){
         return false;
      }else if(!(object instanceof ReviewsByDate)){
         return false;
      }else {
    	  ReviewsByDate reviewsByDate = (ReviewsByDate)object;
         if(id == reviewsByDate.getId()
            && reviewsByDate.equals(reviewsByDate.getReviewsByDate()))
         {
            return true;
         }			
      }
      return false;
   }	
}
