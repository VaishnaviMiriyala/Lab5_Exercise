package m7.task5;
import java.util.Scanner;
public class MainEmp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
        String name = sc.nextLine();
        EmpServices es = new EmpServices();
        sc.close();
        try {
        	es.doValidate(name);
        }
        catch(Exception e){
        	System.out.println(e);
        }
	}

}
