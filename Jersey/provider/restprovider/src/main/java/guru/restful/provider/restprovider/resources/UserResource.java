package guru.restful.provider.restprovider.resources;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import guru.restful.provider.restprovider.model.UserInfo;
import guru.restful.provider.restprovider.service.UserService;



@Path("/users")
public class UserResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<UserInfo> getAllUsers(){
		UserService ms= new UserService();
		List<UserInfo> listm=ms.getMessages();
		return listm;
	}
	
	@Path("/{userid}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public UserInfo getSpecificUser(@PathParam("userid") int id){
		UserService ms= new UserService();
		List<UserInfo> listm=ms.getMessages();
		Optional<UserInfo> useroption = listm.stream().filter(x -> x.getId()==id).findFirst();
		UserInfo user = useroption.get();
		return user;
	}
	
}
