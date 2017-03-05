import java.util.Scanner;
public class cramer{
	public static void main(String[] arge){
		System.out.println("Please enter a b c d e and f.");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		if((a * d - b * c) != 0){
		double x = (e * d - b * f)/(a * d - b * c);
		double y = (a * f - e * c)/(a * d - b * c);
		System.out.printf("x is %.1f and y is %.1f \n", x, y);
	}
		else{
			System.out.printf("This equation has no solution \n");
		}




	}
}