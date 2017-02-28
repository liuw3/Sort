import java.util.Scanner;
public class testlw{

	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		int array[] = new int[10];
		int start = 0;
		int end = 9;
		for(int i = 0; i < 10; i ++){
			array[i] = input.nextInt();
		}
		// for(int j = 0; j < 10; j ++){
		// 	System.out.println("the fdsfds" + array[j]);
		// }
		System.out.println("please input search number:" );
		int number = input.nextInt();
		int mid = 0;
		// _search(0,9,number);

		// public int _search(int start, int end, int number){
		// 	if (array[start + (start + end)/2] > number){
		// 		_search()

		// 	}


		//}
		while (end - start >1){
			mid = start + (end - start)/2;
			if (array[mid] > number){
				end = mid;
			}
			else if (array[mid] < number){
				start = mid;
			}
			else {
				return mid;
			}

		}
		if (array[start] == number){
			return start;
		}
		else {
			return end;
		}

	}
}