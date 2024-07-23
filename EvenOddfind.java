package numbersprogramming;

import java.util.Scanner;

public class EvenOddfind {



	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("please enter any number");
		int n = read.nextInt();
		if (n%2 == 1) {System.out.println("given given is odd");
		}
		else { System.out.println("given number is even");
		}
		read.close();
	}
}






