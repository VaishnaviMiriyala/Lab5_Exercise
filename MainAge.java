package m7.task5;

import java.util.Scanner;

public class MainAge{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = sc.nextInt();
		AgeService as = new AgeService();
		try {
			as.doValidate(age);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}