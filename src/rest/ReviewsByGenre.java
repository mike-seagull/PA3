package rest;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "playbygenre")
public class ReviewsByGenre implements Serializable {

   private static final long serialVersionUID = 1L;
   private int id;
   private String genre;

   public ReviewsByGenre(){}

   public ReviewsByGenre(int id, String genre){
      this.id = id;
      this.genre = genre;
   }

   public int getId() {
      return id;
   }
   @XmlElement
   public void setId(int id) {
      this.id = id;
   }
   
   public String getReviewsByGenre() {
      return genre;
   }
   @XmlElement
   public void setReviewsByGenre(String genre) {
      this.genre = genre;
   }	

   @Override
   public boolean equals(Object object){
      if(object == null){
         return false;
      }else if(!(object instanceof ReviewsByGenre)){
         return false;
      }else {
    	  ReviewsByGenre genre = (ReviewsByGenre)object;
         if(id == genre.getId()
            && genre.equals(genre.getReviewsByGenre()))
         {
            return true;
         }			
      }
      return false;
   }	
}