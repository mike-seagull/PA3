package rest;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "theatreplay")
public class TheatrePlay implements Serializable {

   private static final long serialVersionUID = 1L;
   private int id;
   private String playname;

   public TheatrePlay(){}

   public TheatrePlay(int id, String playname){
      this.id = id;
      this.playname = playname;
   }

   public int getId() {
      return id;
   }
   @XmlElement
   public void setId(int id) {
      this.id = id;
   }
   
   public String getPlayName() {
      return playname;
   }
   @XmlElement
   public void setPlayName(String playname) {
      this.playname = playname;
   }	

   @Override
   public boolean equals(Object object){
      if(object == null){
         return false;
      }else if(!(object instanceof TheatrePlay)){
         return false;
      }else {
    	  TheatrePlay theatreplay = (TheatrePlay)object;
         if(id == theatreplay.getId()
            && playname.equals(theatreplay.getPlayName()))
         {
            return true;
         }			
      }
      return false;
   }	
}