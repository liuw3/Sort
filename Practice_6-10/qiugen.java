import java.util.Scanner;
public class qiugen{
	public static void main(String[] arge){
		System.out.println("Enter a b and c");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		//int num;
		if(b * b - 4 * a * c > 0){
			//num = 2;
			System.out.println("The equation has two real roots");
			double print1 = root1(a,b,c);
			double print2 = root2(a,b,c);
			System.out.printf("Two roots are %f and %f \n", print1, print2);

		}
		else if( b * b - 4 * a * c == 0){
			
			System.out.println("The equation has one real root");
			double print3 = root1(a,b,c);
			System.out.printf("Two roots is %f \n", print3);
		}
		else {
			
			System.out.println("The equation has no root");
		}
	}
	public static double root1(int a, int b, int c){
		
			double root1 = (-b + Math.pow(( b * b - 4 * a * c), 0.5)) / (2 * a);
			return root1;
	}
	public static double root2(int a, int b, int c){
			double root2 = (-b - Math.pow(( b * b - 4 * a * c), 0.5)) / (2 * a);
			return root2;
	}

}