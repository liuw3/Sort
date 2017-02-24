public class bubbleSort {
   public static void main(String[] args) {
      // Prints "Hello, World" in the terminal window.
      int list[] = {8,7,6,5,1};
     	//System.out.println("the list number is " + list[0]);
      int temp;
      for(int j = list.length; j>= 0; j --){
      	for (int i = 0; i < j - 1; i ++){
      		if( list[i] > list[i + 1]){
      			temp = list[i + 1];
      			list[i + 1] = list [i];
      			list [i] = temp;

      	}


      	//
      }

  	}	
  	      		for(int x = 0; x < list.length; x ++){
			System.out.println(list[x]);
		}
   }
}