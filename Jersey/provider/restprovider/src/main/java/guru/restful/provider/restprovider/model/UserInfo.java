package guru.restful.provider.restprovider.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserInfo {

	
      private long id;
      private String city;
      private String name;
      
      public UserInfo(){
    	  
      }
      
      public UserInfo(long id,String city,String name){
    	  this.id=id;
    	  this.city=city;
    	  this.name=name;
      }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return city;
	}

	public void setMessage(String message) {
		this.city = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
      
}
