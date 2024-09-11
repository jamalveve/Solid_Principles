package dependency.inversion.principle;

public class Main {
    public static void main(String[] args) {
    	
    	
    	//without dependency invesrion rule
    	
    	 SQLUserRepository sqlRepo = new SQLUserRepository();
         NoSQLUserRepository noSQLRepo = new NoSQLUserRepository();

         // Instantiate UserService with concrete repositories
         
//        UserService is tightly coupled to SQLUserRepository and NoSQLUserRepository. It knows about the concrete details of these repositories.
//         The UserService constructor takes both SQLUserRepository and NoSQLUserRepository, making it necessary to update UserService if the repositories' interfaces change.
//        
         
//         UserService userService = new UserService(sqlRepo, noSQLRepo);
//
//         User user1 = new User(1, "Alice");
//         userService.addUserToSQL(user1);
//         userService.getUserFromSQL(1);
//
//         User user2 = new User(2, "Bob");
//         userService.addUserToNoSQL(user2);
//         userService.getUserFromNoSQL(2);
         
         
         
         
//         WITH DIP
//         Use SQLUserRepository
    	 UserService userServiceSQL = new UserService(sqlRepo);
         User user1 = new User(1, "Alice");
         userServiceSQL.addUser(user1);
         userServiceSQL.getUser(1);

        // Use NoSQLUserRepository
        UserService userServiceNoSQL = new UserService(noSQLRepo);
        User user2 = new User(2, "Bob");
        userServiceNoSQL.addUser(user2);
        userServiceNoSQL.getUser(2);
    }
}

