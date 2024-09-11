package liskovs.substitution.principle;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//before enhancement
//			EmployeeDetailss empdetails1=new EmployeeDetailss("john",1233);
//			EmployeeDetails empdetails2=new EmployeeDetails("amir",4567);

		System.out.println("===============way 2=================");
//			way1
		EmployeeDetails empdetails12 = new PermanenTEmployeees("john", 550);//child class substituiatble
		empdetails12.display();
		System.out.println(empdetails12.calculateBonus(200000L));

		EmployeeDetails empdetails13 = new TemporaryEmployeees("james", 600);//child class substituatble
		empdetails13.display();
		System.out.println(empdetails13.calculateBonus(200000L));

		EmployeeDetails empdetails14 = new ContractEmployeee("james", 600);
		empdetails14.display();
		System.out.println(empdetails14.calculateBonus(200000L));

//		// after liskovs
		System.out.println("after structured liskovs");
		
		EmployeeDetails empdetails123 = new PermanenTEmployeeess("john", 550);//child class substituiatble
		empdetails12.display();
		System.out.println(empdetails12.calculateBonus(200000L));

		EmployeeDetails empdetails132 = new TemporaryEmployeeess("james", 600);//child class substituatble
		empdetails132.display();
		System.out.println(empdetails132.calculateBonus(200000L));

		ContractEmployeees empdetails142 = new ContractEmployeees("david", 600);
		empdetails142.getMinimumsalry()	;	
		empdetails142.display();	;	
		
		
		
//		BonusCalculations empdetails1 = new BonusCalculations("permanent");
//		BonusCalculations empdetails2 = new BonusCalculations("notpermanent");
//		// CLASSES are substitiable here for their baseclass
//
//		empdetails1.display();
//		System.out.println(empdetails1.calculateBonus(200000L));
//
//		empdetails2.display();
//		System.out.println(empdetails2.calculateBonus(200000L));

	}

}
