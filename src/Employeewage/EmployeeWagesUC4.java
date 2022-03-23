package Employeewage;

public class EmployeeWagesUC4
{

	public static void main(String args[])
	 {
		
		int empcheck = (int) (Math.floor(Math.random() * 10)%3);
		int Per_Hour_Salary=20;
		int Part_Working_Hour=8;
		int Salary;
		switch(empcheck)
		{
		case 0:
			 Salary =Per_Hour_Salary*Part_Working_Hour;
			 System.out.print("Employee is Full Time=" +Salary);
		     break; 
		case 1:
			Part_Working_Hour=5;
			 Salary =Per_Hour_Salary*Part_Working_Hour;
			 System.out.print("Employee is Part Time =" +Salary);
			  break;
	    case 2:
	    	 System.out.print("Employee is Absent");
	    	
		}
		
		}
}
	

