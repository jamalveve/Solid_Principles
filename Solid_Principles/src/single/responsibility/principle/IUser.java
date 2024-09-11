package single.responsibility.principle;

public interface IUser {
  boolean Login(String username,String password);
  boolean register(String username, String password, String email);
//  void Logerror(String emailContent);
//  void sendEmail(String emailContent);
//  Instead of giving all these things in different interface bcz it is notabout user 
//  now we are maintaing SRP rules making the m=intreface doing single task
  
  
  
}
interface ILogger{
	  void Logerror(String emailContent);

}
interface IEmail{
	  void sendEmail(String emailContent);

}
