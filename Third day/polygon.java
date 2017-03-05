import java.util.Scanner;
public class polygon{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of edges :");
		int n = input.nextInt();
		System.out.print("Enter length of edges:");
		double l= input.nextInt();
		double s = n * l * l /(4 * Math.tan(3.14/n));
		System.out.printf("The square is %f \n", s);
	}
}