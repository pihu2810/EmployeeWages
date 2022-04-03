package Day9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class EmpWageBuilder implements IComputeEmpWage
{
	
	static final int fullTime = 1;
	static final int partTime = 2;
	private static final Integer CompanyEmpWage = null;
	private int numofCompany=0;
     ArrayList<CompanyEmpWage> CompanyEmpWageList;
     HashMap<String, Integer>companyToEmpWagesMap;
	public EmpWageBuilder()
	{
		CompanyEmpWageList=new ArrayList<>();
		companyToEmpWagesMap=new HashMap<>();
	}
	
	public void addCompanyEmpWage(String CompanyName, int Per_Hour_Salary, int Total_Working_Days,int Total_Working_hours) {
		CompanyEmpWage  companyEmpWage=new CompanyEmpWage(CompanyName,Per_Hour_Salary, Total_Working_Days,Total_Working_hours);
		CompanyEmpWageList.add(companyEmpWage);
		companyToEmpWagesMap.put(CompanyName,CompanyEmpWage);
		numofCompany++;
	}
	public void computeEmpWage() {
		for(int i=0;i<CompanyEmpWageList.size();i++) {
			CompanyEmpWage companyEmpWage= CompanyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		  
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

