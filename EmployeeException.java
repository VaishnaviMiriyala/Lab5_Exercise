package m7.task5;

public class EmployeeException extends Exception{
	private String message;
     
	
	public EmployeeException() {
		super();
	}


	public EmployeeException(String message) {
		super();
		this.message = message;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Exception: "+message;
	}
	
	

}
