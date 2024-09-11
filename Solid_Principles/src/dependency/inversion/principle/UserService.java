package dependency.inversion.principle;

//WITHOUT DIP

////High-level module directly depends on concrete implementations
//public class UserService {
//	private final SQLUserRepository sqlUserRepository; // Direct dependency
//	private final NoSQLUserRepository noSQLUserRepository; // Direct dependency
//
//	// Constructor takes both concrete implementations
//	UserService is tightly coupled to SQLUserRepository and NoSQLUserRepository. It knows about the concrete details of these repositories.
//    The UserService constructor takes both SQLUserRepository and NoSQLUserRepository, making it necessary to update UserService if the repositories' interfaces change.

//	public UserService(SQLUserRepository sqlUserRepository, NoSQLUserRepository noSQLUserRepository) {
//		this.sqlUserRepository = sqlUserRepository;
//		this.noSQLUserRepository = noSQLUserRepository;
//	}
//
//	public void addUserToSQL(User user) {
//		sqlUserRepository.addUser(user);
//	}
//
//	public User getUserFromSQL(int id) {
//		return sqlUserRepository.getUser(id);
//	}
//
//	public void addUserToNoSQL(User user) {
//		noSQLUserRepository.addUser(user);
//	}
//
//	public User getUserFromNoSQL(int id) {
//		return noSQLUserRepository.getUser(id);
//	}
//}

//WITH DIP
////High-level module depends on abstraction

public class UserService {

	private final UserRespository userRepository;

	// Dependency Injection via constructor
	// UserService now depends on the UserRepository interface rather than specific implementations.
    // This allows UserService to work with any implementation of UserRepository without knowing the details.
	public UserService(UserRespository userRepository) {
		this.userRepository = userRepository;
	}

	public void addUser(User user) {
		userRepository.addUser(user);
	}

	public void getUser(int id) {
		User user= userRepository.getUser(id);
        System.out.println("User fetched: " + user);

	}
}
