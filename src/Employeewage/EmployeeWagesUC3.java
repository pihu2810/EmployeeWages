package Employeewage;

public class EmployeeWagesUC3
{
	public static void main(String args[])
	 {
		int IS_FULL_TIME=1;
		int Part_Time=0;
		int Is_Absent=2;
		double empcheck = Math.floor(Math.random() * 10)%3;
		int Per_Hour_Salary=8;
		int Part_Working_Hour=10;
		int Salary;
		if(empcheck==IS_FULL_TIME) {
		 Salary =Per_Hour_Salary*Part_Working_Hour;
		System.out.print("Employee is Full Time=" +Salary);
	 }else if(empcheck==Part_Time) {
		  Part_Working_Hour=5;
		 Salary =Per_Hour_Salary*Part_Working_Hour;
		 System.out.print("Employee is Part Time =" +Salary);
	 }
	 else	if(empcheck==Is_Absent) {
		Part_Working_Hour=0;
		 Salary =Per_Hour_Salary*Part_Working_Hour;
		 System.out.print("Employee is Absent");
	 }
}
	
}
