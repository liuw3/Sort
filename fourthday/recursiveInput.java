import java.util.Scanner;
public class recursiveInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers:");
		int array[]= new int[10];
		for (int i = 0; i < 10; i ++){
			 array[i]= input.nextInt();
			}

		for (int i = 10; i > 0; i -- ){
			 	System.out.printf(" %d \n",array[i - 1]);
			 }
	}
}