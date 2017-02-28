import java.util.Scanner;
public class Arraylw{
	public static void main (String[] args) {
		int array1[][] = new int[10][10];
		//int numbers;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i ++){
			for (int j = 0; j < 10; j ++){
				//array[i][j] = input.nextInt();
				array1[i][j] = input.nextInt();
			}


		}
		for (int i = 0; i < 10; i ++){
			for (int j = 0; j < 10; j ++){
					System.out.printf("array[%d][%d] = %d \n",i ,j ,array1[i][j]);
				}
			}
		}
	}
