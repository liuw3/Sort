import java.util.Scanner;
public class AddThree{
	public static void main(String[] args){
		int a =(int)(Math.random() * 10);
		int b =(int)(Math.random() * 10);
		int c =(int)(Math.random() * 10);
		int sum = a + b + c;
		System.out.printf("Enter sum of %d %d and %d: ", a,b,c);
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num == sum){
			System.out.println("Your answer is correct!");

		}
		else {
			System.out.println("Your answer is incorrect!");
		}



	}
}