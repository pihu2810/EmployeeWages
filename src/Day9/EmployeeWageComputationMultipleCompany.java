package Day9;

public class EmployeeWageComputationMultipleCompany 
{
	
	static final int fullTime = 1;
	static final int partTime = 2;
	String CompanyName;
	int Per_Day_Working_Hours = 0;
	int Total_Working_Days;
	int Total_Working_hours;
	int Per_Hour_Salary;
	int Total_salary;
	
	public EmployeeWageComputationMultipleCompany (String CompanyName, int Total_Working_Days, int Per_Hour_Salary,int Total_Working_hours) {
		this.CompanyName = CompanyName;
		this.Total_Working_Days = Total_Working_Days;
		this.Per_Hour_Salary = Per_Hour_Salary;
		this.Total_Working_hours=Total_Working_hours;
	}
	
	public void empChecking() {
		int TotalSalary=0;
		int Number_of_Days=0;
		int Number_of_hours=0;
		
		while(Number_of_Days<Total_Working_Days && Number_of_hours<Total_Working_hours) {
			int empCheck = (int) (Math.floor(Math.random()*10)%3);
			switch(empCheck) {
			case fullTime:
				Per_Day_Working_Hours=8;
			Total_salary=Per_Day_Working_Hours*Per_Hour_Salary;
				break;
				
			case partTime:
				Per_Day_Working_Hours=4;
			Total_salary=Per_Day_Working_Hours*Per_Hour_Salary;
				break;
				
				default:
					Per_Day_Working_Hours=0;
					
			}
			TotalSalary=TotalSalary+Total_salary;
			Number_of_hours=Number_of_hours+Per_Day_Working_Hours;
			Number_of_Days++;
		}
		System.out.println("Total No Of Hrs: "+Number_of_hours);
		System.out.println(" Total Salary of " +CompanyName+ " Employee is " +TotalSalary);
	}
	 public  String toString() {
		 
		 return "Total employee Salary for Company: " + CompanyName+ "is :" +Total_salary;
	 }
	
	public static void main(String[] args) {
		System.out.println("Welcome To Employee wage Computation Program");
		
		EmployeeWageComputationMultipleCompany  Dmart = new EmployeeWageComputationMultipleCompany ("D-Mart", 30 ,20,100);
		Dmart.empChecking();
		String printStr = Dmart.toString();
		System.out.println(printStr);
		
		
		System.out.println("**************************************");
		
		EmployeeWageComputationMultipleCompany  Tata = new EmployeeWageComputationMultipleCompany ("TATA", 25, 30,108);
		Tata.empChecking();
		String printlnStr = Tata.toString();
		System.out.println(printlnStr);
		
	}

}

