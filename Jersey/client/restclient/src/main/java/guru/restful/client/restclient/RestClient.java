package guru.restful.client.restclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import guru.restful.client.restclient.model.UserInfo;

/**
 * 
 * @author Srisarguru
 *
 */
public class RestClient {

	public static void main(String[] args) {
		//get a client object //initialize once per application // can make multiple api calls
		Client client = ClientBuilder.newClient();
		
		//multiple web targets for each url
		WebTarget target = client.target("http://localhost:8080/restprovider/webapi/users/1");
		
		//building the request //configure how the request can be //what media type response you want
		Builder builder = target.request(MediaType.APPLICATION_XML);
		
		//http get method can use post,put.. //get(UserInfo.class) what type of class to convert to. we can have get(String.class) will convert to string since http has string
		Response response=builder.get();
		
		//or	
		//Response response = client.target("http://localhost:8080/restprovider/webapi/users/1").request().get();
		System.out.println(response.readEntity(UserInfo.class).getName());
		//System.out.println(response.readEntity(String.class));
		
		//to the post method in my rest api
		Response response1 = client.target("http://localhost:8080/restprovider/webapi/users").request().post(null);
		System.out.println(response1.readEntity(String.class));
	}

}
