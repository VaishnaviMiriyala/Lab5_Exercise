package m7.task5;
import java.util.Scanner;
public class EmployeeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary");
		int salary = sc.nextInt();
        EmployeeServices es = new EmployeeServices();
        try {
        	es.doValidate(salary);
        }
        catch(Exception e) {
        	System.out.println(e);
        }
	}

}
