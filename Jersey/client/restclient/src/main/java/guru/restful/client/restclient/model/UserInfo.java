package guru.restful.client.restclient.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement //JAX-B to convert to xml by JAX-B
public class UserInfo {

	
      private int id;
      private String city;
      private String name;
      
      //essential for JSON or XML conversion. Always make sure
      public UserInfo(){
    	  
      }
      
      public UserInfo(int id,String city,String name){
    	  this.id=id;
    	  this.city=city;
    	  this.name=name;
      }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
      
}
