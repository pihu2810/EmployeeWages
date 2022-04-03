package Day9;

public class EmployeeWageMain 
{
	public static void main(String[] args) {
		System.out.println("Welcome To Employee wage Computation Program");
		 IComputeEmpWage empWageBuilder=new EmpWageBuilder();
		
		empWageBuilder .addCompanyEmpWage("Dmart",20,2,10);
		empWageBuilder .addCompanyEmpWage("Tata",20,4,20);
		empWageBuilder .addCompanyEmpWage("Apple",20,6,20);
		empWageBuilder .addCompanyEmpWage("Amazon",20,8,20);
		empWageBuilder.computeEmpWage();
	}

}
