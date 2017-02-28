import java.util.Scanner;
public class CountNum{
	public static void main(String[] args){
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();


		while (n != 0){
			if(n > 0){
				count1 ++;
				
			}
			if(n < 0){
				count2 ++;

			}
			sum = sum + n;
			count ++;
		}
		double aver = sum/count;
		while (n == 0){
			System.out.printf("There are %d nagetive numbers. \n There are %d positive numbers \n. The sum of numbers is %d \n. The average is %f \n" ,count2,count1,sum,aver);
		}
	}
		

		




	}
}