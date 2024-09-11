package open.closed.principle;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		EmployeeDetailssss empdetails1=new EmployeeDetailssss("john",1233);
//		EmployeeDetailssss empdetails2=new EmployeeDetailssss("amir",4567);
//		empdetails1.display();
//		System.out.println(empdetails1.calculateBonus(200000L));
		
		//after new enchancement======================================
		
		
		
//		EmployeeDetailssss empdetailsenhanced1=new EmployeeDetailssss("john",1233,"permanent");
//		EmployeeDetailssss empdetailsenhanced2=new EmployeeDetailssss("amir",4567,"temporary");
//		empdetailsenhanced1.display();
//		System.out.println(empdetailsenhanced1.calculateBonus(200000L));
//		
//		
//		empdetailsenhanced2.display();
//		System.out.println(empdetailsenhanced2.calculateBonus(200000L));
		
		
		//here fine everything is working fine but we are changing /modifiyung the existing methods 
		
		//afteer making it abstract================================
		//way 1
		EmployeeDetailssss empdetails12=new PermanenTEmployeee("john",550);
		empdetails12.display();
		System.out.println(empdetails12.calculateBonus(200000L));
//		
//		
		EmployeeDetailssss empdetails13=new TemporaryEmployeee("james",600);
		empdetails13.display();
		System.out.println(empdetails13.calculateBonus(200000L));
		
		
		EmployeeDetailssss empdetails14=new ContractEmployeee("james",600);
		empdetails14.display();
		System.out.println(empdetails14.calculateBonus(200000L));
		
		
		//way 2
		
//		BonusCalculations empdetails1=new BonusCalculations("permanent");
//		BonusCalculations empdetails2=new BonusCalculations("notpermanent");
//
//		
//		empdetails1.display();
//		System.out.println(empdetails1.calculateBonus(200000L));
//		
//		empdetails2.display();
//		System.out.println(empdetails2.calculateBonus(200000L));
//
//		System.out.println("===============way 2=================");
////		way2
		
//		


	}

}
