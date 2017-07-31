package guru.restful.provider.restprovider.service;

import java.util.ArrayList;
import java.util.List;
import guru.restful.provider.restprovider.model.UserInfo;

/**
 * 
 * @author Srisarguru
 *
 */
public class UserService {
	
	
	public List<UserInfo> getMessages(){
		UserInfo m1=new UserInfo(1,"Boise","Rodrigo");
		UserInfo m2=new UserInfo(2,"Columbus","Shawn");
		List<UserInfo> messages = new ArrayList<UserInfo>();
		messages.add(m1);
		messages.add(m2);
		return messages;
	}
}
