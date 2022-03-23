package Employeewage;

public class EmployeeWagesUC6
{

	public class CalculateWage {
		public static void main(String args[]) {
			int empAttendance = 0; // Absent

			int Per_Hour_Salary = 20;
			int Total_Working_Hour = 0;
			int Total_Working_Days = 0;
			int Per_Day_Hours = 8;
			int Total_Salary;
			int count = 0;
			while (Total_Working_Days <= 20 || Total_Working_Hour <= 100) {
				empAttendance = (int) (Math.floor(Math.random() * 10) % 2);
				switch (empAttendance) {
				case 0: //Absent
					//System.out.println("Employee is Absent");	
					break;
				case 1://Present
					//System.out.println("Employee is Present");
					Total_Working_Days++;
					break;
				}
				
				Total_Working_Hour = Total_Working_Days * Per_Day_Hours;
				if (Total_Working_Days == 20 || Total_Working_Hour >= 100) {
					Total_Salary = Per_Hour_Salary * Total_Working_Hour;
					System.out.println("Employee salary for " + Total_Working_Days + "days and " + Total_Working_Hour
							+ " hours is : " + Total_Salary);
					break;
				}
				count++;
			}
			System.out.println(count);
		}
}
}

