public class randomMatrix{
	public static void main(String[] args){
		int[] array = {0,1};
		int index1,index2,index3;
		int random1,random2,random3;
		//System.out.println("aray lenth"+ array.length);
	// 	int index;
	// 	do{
	// 	index = (int)(Math.random() * 10); 
	// 	//System.out.printf("%d \n", index);
	// }while(index > array.length - 1);
	// 	System.out.println("random index  " + index +
	// 	 "  random num in array: " + array[index] );
		for(int i = 0; i < 3; i ++){
		index1 = (int)(Math.random()*(array.length - 0.01));
		index2 = (int)(Math.random()*(array.length - 0.01));
		index3 = (int)(Math.random()*(array.length - 0.01));
		random1 = array[index1];
		random2 = array[index2];
		random3 = array[index3];
		System.out.printf("%d  %d  %d\n", random1,random2,random3);
	}
	}
}