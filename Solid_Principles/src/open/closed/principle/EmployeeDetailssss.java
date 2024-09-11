package open.closed.principle;

//public class EmployeeDetailssss {
//	String name;
//	int employeeId;
//	// new enchnacement fpr differentitae bonus for permanent and contract employee
//	// so adding emokpying type
//	String employeeType;
//
//	public EmployeeDetailssss() {
//
//	}
//
////	public EmployeeDetailssss(String name, int employeeId) {
////		super();
////		this.name = name;
////		this.employeeId = employeeId;
//////		this.employeeType = employeeType;
////	}
//	
////	after enhancment
//	public EmployeeDetailssss(String name, int employeeId,String employeeType) {
//		super();
//		this.name = name;
//		this.employeeId = employeeId;
//		this.employeeType = employeeType;
//	}
//
//	public void display() {
//		System.out.println("employee: " + name + "with id: " + employeeId);
//	}

//	public String toString() {
//		return "employee: " + name + "  with id: " + employeeId;
//	}
//
////	public Long calculateBonus(Long salary) {
////		return salary*500;
////
////	}
////	 after enhancement based on e,plpyee type
//	public Long calculateBonus(Long salary) {
//		if (this.employeeType == "permanent") {
//			return salary * 20000;
//		} else {
//			return salary * 500;
//		}
//	}
//
//}



//new enhancement need to calculate bonus of the employee
//here we are modifying the existug class and methods we shpuld not do this way 

//step1:so make class abstract


public abstract class EmployeeDetailssss{
	String name;
	int employeeId;

//	String employeeType; remove this
	public EmployeeDetailssss() {

	}

//	public EmployeeDetails(String name, int employeeId,String employeeType) {///remove
	public EmployeeDetailssss(String name, int employeeId) {

		super();
		this.name = name;
		this.employeeId = employeeId;
//		this.employeeType=employeeType; remove
	}

	public void display() {
		System.out.println("employee: " + name + "with id: " + employeeId);
	}

	public String toString() {
		return "employee: " + name + "  with id: " + employeeId;
	}

//	making in abrstract methods and leaving the implementation on dervied class 
	public abstract Long calculateBonus(Long salary);

}


//class BonusCalculations extends EmployeeDetails {
//
//	String employeeType;
//
//	BonusCalculations(String employeeType) {
//		super("john", 1334);
//		this.employeeType = employeeType;
//	}
//
//	@Override
//	public Long calculateBonus(Long salary) {
//		if (this.employeeType == "permanent") {
//			return salary * 20000;
//		} else {
//			return salary * 500;
//		}
//	}
//
//}
//


////step 2:leaving the implementation on derived class
//and use dervied class this way we can achived OCP
class PermanenTEmployeee extends EmployeeDetailssss {


	PermanenTEmployeee(String name, int employeeId) {
		super(name,employeeId);

//		this.name = super.name;
//		this.employeeId = super.employeeId;
	}

	@Override
	public Long calculateBonus(Long salary) {
		return salary * 10000;
	}
}

class TemporaryEmployeee extends EmployeeDetailssss {


	TemporaryEmployeee(String name, int employeeId) {
		super(name,employeeId);
//		this.name = super.name;
//		this.employeeId = super.employeeId;
	}

	@Override
	public Long calculateBonus(Long salary) {
		return salary * 500;
	}
}
class ContractEmployeee extends EmployeeDetailssss {


	ContractEmployeee(String name, int employeeId) {
		super(name,employeeId);
//		this.name = super.name;
//		this.employeeId = super.employeeId;
	}

	@Override
	public Long calculateBonus(Long salary) {
		return salary * 50;
	}
}
