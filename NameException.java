package m7.task5;

public class NameException extends Exception {
	private String message;
	

	public NameException() {
		super();
	}


	public NameException(String message) {
		super();
		this.message = message;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name Exception:"+message;
	}

}
