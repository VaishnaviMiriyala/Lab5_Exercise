package m7.task5;

public class AgeService {
     public void doValidate(int age) throws AgeException {
    	 if(age > 15) {
    		 System.out.println("The persons age is: "+age);
    	 }else {
    		 throw new AgeException("The person age is less than 15");
    	 }
     }
}
