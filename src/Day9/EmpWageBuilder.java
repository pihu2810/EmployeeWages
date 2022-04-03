package Day9;

public class EmpWageBuilder implements IComputeEmpWage
{
	
	static final int fullTime = 1;
	static final int partTime = 2;
	int Per_Day_Working_Hours = 0;
	private int numofCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;
	public EmpWageBuilder()
	{
		companyEmpWageArray=new CompanyEmpWage[5];
	}
	
	public void addCompanyEmpWage(String CompanyName, int Per_Hour_Salary, int Total_Working_Days,int Total_Working_hours) {
		companyEmpWageArray[numofCompany]=new CompanyEmpWage(CompanyName,Per_Hour_Salary, Total_Working_Days,Total_Working_hours);
	 numofCompany++;
	}
	public void computeEmpWage() {
		for(int i=0;i<numofCompany;i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
		   System.out.println(companyEmpWageArray[i]);
		}
	}
	
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int TotalWorkingDays=0;
		int Number_of_hours=0;
		int Total_EmpHours=0;
		
		while( Total_EmpHours<=companyEmpWage.Total_Working_hours && TotalWorkingDays<= companyEmpWage.Total_Working_Days) {
			TotalWorkingDays++;
			int empCheck = (int) (Math.floor(Math.random()*10)%3);
			switch(empCheck) {
			case fullTime:
				Number_of_hours=8;
			    break;
			case partTime:
				Number_of_hours=4;
			    break;
			default:
				Number_of_hours=0;
					}
			Total_EmpHours+=Number_of_hours;
			System.out.println("Day :" +TotalWorkingDays+ " Emp Hr:" +Number_of_hours);
		}
		return  Total_EmpHours*companyEmpWage.Per_Hour_Salary;
	}
}

