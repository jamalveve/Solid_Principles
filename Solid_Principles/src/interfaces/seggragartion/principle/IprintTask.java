package interfaces.seggragartion.principle;

public interface IprintTask {
boolean printContent(String Content);
//boolean faxContent(String Content);
boolean PhotoCopy(String Content);
boolean scanContent(String Content);
//boolean DuplexContent(String Content);
//now instead of bit fat Interface we ccan create smeting like intreface for what basic  printer can do 
//and  some another interface for advanced tasks.

}
interface FaxTask{
	boolean faxContent(String Content);

}
interface DuplexTask{
	boolean DuplexContent(String Content);

}