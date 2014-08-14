import java.util.List;
import java.util.LinkedList;

public class Facebook {
	
	private List<User> users;
	
	public Facebook(){
		users = new LinkedList<User>();
	}
	
	public void addUser(User u){
		users.add(u);
	}
	
	public boolean login(DadosLogin user){
		for(Object i:users){
			User userCadastrado = (User)i;
			if(userCadastrado.getDadosLogin().matches(user)) return true;
		}
		return false;
	}
	

}
