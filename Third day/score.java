import java.util.Scanner;
public class score{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n = input.nextInt();
		int array[] = new int[n];
		System.out.println("Enter student scores:");
		for(int i = 0; i < array.length; i ++){
			array[i] = input.nextInt();
		}
		int temp;
		for(int j = array.length; j>= 0; j --){
      	for (int i = 0; i < j - 1; i ++){
      		if( array[i] > array[i + 1]){
      			temp = array[i + 1];
      			array[i + 1] = array[i];
      			array[i] = temp;

      	}
      }
  }
		//array[] = array.sort[];
		for(int i = 0; i < n; i ++)
		{
			int a = array[array.length -1];
			if (array[i] + 10 >= a){
				System.out.printf("Student " + i + "  score  is  " + array[i] + "  and grade is A \n");
			}
			else if(array[i] + 20 >= a){
				System.out.printf("Student " + i + "  score  is  " + array[i] + "  and grade is B \n");
			}
			else if (array[i] + 30 >= a){
				System.out.printf("Student " + i + "  score  is  " + array[i] + "  and grade is C \n");
			}
			else if (array[i] + 40 >= a){
				System.out.printf("Student " + i + "  score  is  " + array[i] + "  and grade is D \n");
			}
			else{
				System.out.printf("Student " + i + "  score  is  " + array[i] + "  and grade is D \n");
			}

			
			
		}
	}
}