package MyLearning;

import java.util.Scanner;

public class Basics {
//Main method
	public static void main(String arg[]) {
		System.out.println("What is your name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("The name is:"+name);
		System.out.println("What is your age");
		int age=sc.nextInt();
		System.out.println("Your age is"+age);
	}
}
