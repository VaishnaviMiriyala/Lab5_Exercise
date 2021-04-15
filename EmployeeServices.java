package m7.task5;

public class EmployeeServices{
      public void doValidate(int salary) throws EmployeeException {
    	  if(salary < 3000) {
    		  throw new EmployeeException("The salry is less than 3000");
    	  }else {
    		  System.out.println("The salary of Employee is "+salary);
    	  }
      }
}
