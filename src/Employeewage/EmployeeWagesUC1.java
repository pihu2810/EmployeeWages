package Employeewage;

public class EmployeeWagesUC1
{


	public static void main(String args[])
	 {
		int Isfulltime = 1;
		double empcheck = Math.floor(Math.random() * 10)%2;
		if(empcheck==Isfulltime) 
			System.out.println("Employee is present");
			else
			System.out.println("Employee is Absent");
				
		}

}
