package Employeewage;

public class EmployeeWagesUC2
{

	public static void main(String args[])
	 {
		 int IS_FULL_TIME=1;
		 double empcheck = Math.floor(Math.random() * 10)%2;
		int perhour=20,FullDayHour=8;
		int Salary;
		if(empcheck==IS_FULL_TIME)
		{
			Salary=perhour*FullDayHour;
		System.out.println("Daily Employee Wage is :" +Salary);
	 }
		else {
			FullDayHour=0;
			Salary=perhour*FullDayHour;
			System.out.println("Employee is absent");
		}
		}

}
