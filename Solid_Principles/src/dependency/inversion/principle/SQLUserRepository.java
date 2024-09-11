package dependency.inversion.principle;

//direct dependency
///NO DIP

//public class SQLUserRepository {
// public void addUser(User user) {
//     // SQL-specific code to add user
//     System.out.println("Adding user to SQL database: " + user);
// }
//
// public User getUser(int id) {
//     // SQL-specific code to get user
//     System.out.println("Fetching user from SQL database with ID: " + id);
//     return new User(id, "SQL User"); // Dummy user
// }
//}
//
////Concrete implementation using NoSQL
// class NoSQLUserRepository {
// public void addUser(User user) {
//     // NoSQL-specific code to add user
//     System.out.println("Adding user to NoSQL database: " + user);
// }
//
// public User getUser(int id) {
//     // NoSQL-specific code to get user
//     System.out.println("Fetching user from NoSQL database with ID: " + id);
//     return new User(id, "NoSQL User"); // Dummy user
// }
//}

////Concrete implementation using SQL
// /DIP
///MAINITAING AN INTERFACE COMMONLY

public class SQLUserRepository implements UserRespository {
	@Override
	public void addUser(User user) {
		// SQL-specific code to add user
		System.out.println("Adding user to SQL database: " + user);
	}

	@Override
	public User getUser(int id) {
		// SQL-specific code to get user
		System.out.println("Fetching user from SQL database with ID: " + id);
		return new User(id, "SQL User"); // Dummy user
	}
}

//Concrete implementation using NoSQL
class NoSQLUserRepository implements UserRespository {
	@Override
	public void addUser(User user) {
		// NoSQL-specific code to add user
		System.out.println("Adding user to NoSQL database: " + user);
	}

	@Override
	public User getUser(int id) {
		// NoSQL-specific code to get user
		System.out.println("Fetching user from NoSQL database with ID: " + id);
		return new User(id, "NoSQL User"); // Dummy user
	}
}

//Now, let's add a new repository called RedisUserRepository. Follow these steps:

//1. Implement the New Repository->It is easy for new repository to add further

//Create a new class RedisUserRepository that implements the UserRepository interface:
//This approach adheres to the Dependency Inversion Principle because UserService depends
//on an abstraction (UserRepository) rather than specific implementations. 
//This design allows for easy swapping of different repository implementations 
//and enhances the modularity and flexibility of your code.

class RedisUserRepository implements UserRespository {
	@Override
	public void addUser(User user) {
		System.out.println("Adding user to Redis database: " + user);
	}

	@Override
	public User getUser(int id) {
		return new User(id, "Redis User");
	}
}
