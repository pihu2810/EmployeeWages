package Day9;

public class CompanyEmpWage 
{
	public final String CompanyName;
	public final int Total_Working_Days;
	public final int Total_Working_hours;
	public final int Per_Hour_Salary;
	public  int totalEmoWage;
	
	public CompanyEmpWage (String CompanyName, int Total_Working_Days, int Per_Hour_Salary,int Total_Working_hours) {
		this.CompanyName = CompanyName;
		this.Total_Working_Days = Total_Working_Days;
		this.Per_Hour_Salary = Per_Hour_Salary;
		this.Total_Working_hours=Total_Working_hours;
	}
	public void setTotalEmpWage(int totalEmoWage) {
		this.totalEmoWage=totalEmoWage;
	}
 public  String toString() {
		 
		 return "Total employee Salary for Company: " + CompanyName + " is :" +totalEmoWage;
	 }
}
