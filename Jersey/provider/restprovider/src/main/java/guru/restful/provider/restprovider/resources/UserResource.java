package guru.restful.provider.restprovider.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import guru.restful.provider.restprovider.model.UserInfo;
import guru.restful.provider.restprovider.service.UserService;



@Path("/users")
public class UserResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<UserInfo> sayHello(){
		UserService ms= new UserService();
		List<UserInfo> listm=ms.getMessages();
		return listm;
	}
}
