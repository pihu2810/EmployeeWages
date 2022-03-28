package Employeewage;



public class EmployeeWageBilder
{

	int Per_Hour_Salary = 20;
	int Total_Working_Hour = 0;
	int Total_Working_Days = 0;
	int Per_Day_Hours = 8;
	int Total_Salary;
	int count = 0;
	int Part_TIme_Working_Hours=4;

void CalculateTOtalWage()
{
	while (Total_Working_Days < 20 && Total_Working_Hour < 100) {
		int empAttendance = (int) (Math.floor(Math.random() * 10) % 3);
		switch (empAttendance) {
		case 0: //Absent
			System.out.println("Employee is Absent");	
			break;
		case 1://Present
			System.out.println("Employee is Present");
			Total_Working_Hour = Total_Working_Days * Per_Day_Hours;
	        Total_Salary = Per_Hour_Salary * Total_Working_Hour;
			System.out.println("Employee salary for " + Total_Working_Days + "days and " + Total_Working_Hour
					+ " hours is : " + Total_Salary);
			Total_Working_Days++;
			break;
		case 2:
			System.out.println("Employ is Part-Time");
			Total_Working_Hour = Total_Working_Days * Part_TIme_Working_Hours;
			Total_Salary = Per_Hour_Salary * Total_Working_Hour;
			Total_Working_Days++;
			break;
		}
		count++;
	}
	System.out.println(count);
}
public static void main(String args[])
{
	   System.out.println("Welcome to Employee wage ");
	   EmployeeWageBilder employee=new  EmployeeWageBilder();
	   employee.CalculateTOtalWage();
}
}
