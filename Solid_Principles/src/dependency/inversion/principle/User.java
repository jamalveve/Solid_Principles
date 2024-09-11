package dependency.inversion.principle;

//User model class
public class User {
 private final int id;
 private final String name;

 public User(int id, String name) {
     this.id = id;
     this.name = name;
 }

 @Override
 public String toString() {
     return "User{id=" + id + ", name='" + name + "'}";
 }
}
