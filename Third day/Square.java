import java.util.Scanner;
public class square{
	public static void main(String[] args){
		double s = 0;
		Scanner input = new Scanner(System.in);
		double i = input.nextDouble();
		s = 5 * i * i / 4 * Math.tan(3.14 / 5);
		System.out.printf("%f \n",s); 
	}
}