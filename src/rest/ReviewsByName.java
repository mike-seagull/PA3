package rest;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "playbygenre")
public class ReviewsByName implements Serializable {

   private static final long serialVersionUID = 1L;
   private int id;
   private String reviewsByName;

   public ReviewsByName(){}

   public ReviewsByName(int id, String reviewsByName){
      this.id = id;
      this.reviewsByName = reviewsByName;
   }

   public int getId() {
      return id;
   }
   @XmlElement
   public void setId(int id) {
      this.id = id;
   }
   
   public String getReviewsByName() {
      return reviewsByName;
   }
   @XmlElement
   public void setReviewsByName(String reviewsByName) {
      this.reviewsByName = reviewsByName;
   }	

   @Override
   public boolean equals(Object object){
      if(object == null){
         return false;
      }else if(!(object instanceof ReviewsByName)){
         return false;
      }else {
    	  ReviewsByName reviewsByName = (ReviewsByName)object;
         if(id == reviewsByName.getId()
            && reviewsByName.equals(reviewsByName.getReviewsByName()))
         {
            return true;
         }			
      }
      return false;
   }	
}
