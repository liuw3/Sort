import java.util.Scanner;
public class RandomInteger{
	public static void main(String[] arge){
		int a = (int)(Math.random() * 100);
		int b = (int)(Math.random() * 100);
		int sum = a + b;
		// boolean t = True;
		// boolean f = False;
		System.out.printf("Enter the sum of %d and %d: \n", a, b);
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num == sum ){
			System.out.println("Your answer is correct \n");
		}
		else{
			System.out.println("Your answer is incorrect \n");
		}
	}
}