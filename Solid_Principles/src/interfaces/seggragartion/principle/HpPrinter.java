package interfaces.seggragartion.principle;

public class HpPrinter implements IprintTask,FaxTask{
	//Hp printer has all facityr so fine to imnplement this all method here but check the maconPrinter classss

	@Override
	public boolean printContent(String Content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean faxContent(String Content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean PhotoCopy(String Content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scanContent(String Content) {
		// TODO Auto-generated method stub 
		return false;
	}

}
