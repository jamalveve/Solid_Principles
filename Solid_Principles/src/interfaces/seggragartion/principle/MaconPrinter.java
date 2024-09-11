package interfaces.seggragartion.principle;

//public class MaconPrinter implements IprintTask{
//instead of this 
	public class MaconPrinter implements FaxTask,DuplexTask{

//now this printer dobt have the option of fac and scan so here it  is forced to implement the other methods
	
//	@Override
//	public boolean printContent(String Content) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public boolean faxContent(String Content) {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public boolean PhotoCopy(String Content) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean scanContent(String Content) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	
	
	//we can avoid above code

	@Override
	public boolean DuplexContent(String Content) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
