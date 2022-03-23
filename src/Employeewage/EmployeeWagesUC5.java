package Employeewage;

public class EmployeeWagesUC5
{

	public static void main(String args[])
	 {
		int empcheck = (int) (Math.floor(Math.random() * 10)%3);
		int Per_Hour_Salary=20;
		int Working_Hour=8;
		int Per_Month_Working=20;
		int Salary=20;
		switch(empcheck)
		{
		case 0:
			 Salary =Per_Hour_Salary*Working_Hour*Per_Month_Working;
			 System.out.print("Employee is Full Time=" +Salary);
		     break; 
		case 1:
			Working_Hour=5;
			 Salary =Per_Hour_Salary*Working_Hour*Per_Month_Working;
			 System.out.print("Employee is Part Time =" +Salary);
			  break;
	    case 2:
	    	Working_Hour=0;
			 Salary =Per_Hour_Salary*Working_Hour*Per_Month_Working;
	    	 System.out.print("Employee is Absent");
	    	
		}
		
		
	 }
}
	

