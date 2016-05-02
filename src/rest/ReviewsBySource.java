package rest;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "reviewsbysource")
public class ReviewsBySource implements Serializable {

   private static final long serialVersionUID = 1L;
   private int id;
   private String reviewsBySource;

   public ReviewsBySource(){}

   public ReviewsBySource(int id, String reviewsBySource){
      this.id = id;
      this.reviewsBySource = reviewsBySource;
   }

   public int getId() {
      return id;
   }
   @XmlElement
   public void setId(int id) {
      this.id = id;
   }
   
   public String getReviewsBySource() {
      return reviewsBySource;
   }
   @XmlElement
   public void setReviewsBySource(String reviewsBySource) {
      this.reviewsBySource = reviewsBySource;
   }	

   @Override
   public boolean equals(Object object){
      if(object == null){
         return false;
      }else if(!(object instanceof ReviewsBySource)){
         return false;
      }else {
    	  ReviewsBySource reviewsBySource = (ReviewsBySource)object;
         if(id == reviewsBySource.getId()
            && reviewsBySource.equals(reviewsBySource.getReviewsBySource()))
         {
            return true;
         }			
      }
      return false;
   }	
}
