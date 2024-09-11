package liskovs.substitution.principle;

public abstract class EmployeeDetails {
	String name;
	int employeeId;

//	String employeeType; remove this
	public EmployeeDetails() {

	}

//	public EmployeeDetails(String name, int employeeId,String employeeType) {///remove
	public EmployeeDetails(String name, int employeeId) {

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

	public abstract Long calculateBonus(Long salary);

}
//

//or
class PermanenTEmployeees extends EmployeeDetails {

	PermanenTEmployeees(String name, int employeeId) {
		super(name, employeeId);

//		this.name = super.name;
//		this.employeeId = super.employeeId;
	}

	@Override
	public Long calculateBonus(Long salary) {
		return salary * 10000;
	}
}

class TemporaryEmployeees extends EmployeeDetails {

	TemporaryEmployeees(String name, int employeeId) {
		super(name, employeeId);
//		this.name = super.name;
//		this.employeeId = super.employeeId;
	}

	@Override
	public Long calculateBonus(Long salary) {
		return salary * 500;
	}
}

//liskovs

class ContractEmployeee extends EmployeeDetails {

	ContractEmployeee(String name, int employeeId) {
		super(name, employeeId);
//		this.name = super.name;
//		this.employeeId = super.employeeId;
	}

	@Override
	public Long calculateBonus(Long salary) {
		// // what if contract employee dont have bonus so lets make an interface
		return 400L;
//		throw nexw ArithmeticException(); // child classit s hould n ot throw any exceptiob ncz parent isnot throwing
//	/voilating rules of liskovs here
	}
}

//new way more strcutured for liskovs 
///below

abstract class EmployeeDetailss implements Employee, Bonus {
	String name;
	int employeeId;

//	String employeeType; remove this

	public EmployeeDetailss(String name, int employeeId) {

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

	@Override
	public abstract long getMinimumsalry();

	@Override
	public abstract Long calculateBonus(Long salary);

}
//

//or
class PermanenTEmployeeess extends EmployeeDetails {

	PermanenTEmployeeess(String name, int employeeId) {
		super(name, employeeId);

//		this.name = super.name;
//		this.employeeId = super.employeeId;
	}

	@Override
	public Long calculateBonus(Long salary) {
		return salary * 10000;
	}

}

class TemporaryEmployeeess extends EmployeeDetails {

	TemporaryEmployeeess(String name, int employeeId) {
		super(name, employeeId);
//		this.name = super.name;
//		this.employeeId = super.employeeId;
	}

	@Override
	public Long calculateBonus(Long salary) {
		return salary * 500;
	}

	public long getMinimumsalry() {
		return 150000;

	}
}

//liskovs
//here we are implementing only Emplpyee Interface not bonus 
class ContractEmployeees implements Employee {
	String name;
	int employeeId;

	ContractEmployeees(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	public void display() {
		System.out.println("employee: " + name + "with id: " + employeeId);
	}
	@Override
	public long getMinimumsalry() {
		// TODO Auto-generated method stub
		return 16660000;
	}
}
//

//and use dervied class this way we can achived OCP

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
