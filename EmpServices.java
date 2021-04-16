package m7.task5;

public class EmpServices {
	public void doValidate(String name) throws NameException {
		String arr[] = name.split(" ");
		if((arr[0].isEmpty() && arr[1].isEmpty())||arr.length < 1) {
			throw new NameException("The name is not given properly");
		}else {
			System.out.println("The name is "+name);
		}
	}

}
