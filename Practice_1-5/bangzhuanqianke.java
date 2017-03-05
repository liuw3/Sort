import java.util.Scanner;
public class bangzhuanqianke{
	public static void main(String[] arge){
		System.out.println("Enter lb");
		Scanner input = new Scanner(System.in);
		double kg = input.nextInt();
		double pound = kg/0.454;
		System.out.printf("%f kg equals to %f pound \n", kg, pound);
	}
}