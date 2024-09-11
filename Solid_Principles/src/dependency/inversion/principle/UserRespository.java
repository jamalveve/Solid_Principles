package dependency.inversion.principle;

public interface UserRespository {

	void addUser(User username);
	User getUser(int id);
	
}
