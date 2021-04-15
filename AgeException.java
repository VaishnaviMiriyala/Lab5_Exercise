package m7.task5;

public class AgeException extends Exception{
	private String message = "";

	public AgeException() {
		super();
	}

	public AgeException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		return "Age Exception: "+message;
		
	}
	

}
