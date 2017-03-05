import java.util.Scanner;
public class maisonPrime{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter P value:");
		int p = input.nextInt();
		System.out.println("P     2^P - 1");
		int value = 0;
		for (int i = 2; i <= p; i ++){
			value = (int)(Math.pow(2,i) - 1);
			//System.out.printf("%d \n", value);
			if (prime(value) == true){
				System.out.printf(i + "     " + value + "\n");
			}

		}
	}
	public static Boolean prime(int n){
		int m;
		for(int j = 2; j < n; j ++){
			m = n % j;
			if(m == 0){
				return false;
			}
		}
		return true;
	}

}