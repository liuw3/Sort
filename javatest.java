import java.util.Scanner;
//import javax.swing.JOptionPane;
public class javatest {
	public static void main (String[] args){
		//int number1 = (int)(System.currentTimeMillis()%10);
		//int number2 = (int)(System.currentTimeMillis()*7%10);
		//int number1 = (int)(Math.random()*10);
		//int number2 = (int)(Math.random()*10);
		//int sum = number1 + number2;
		//System.out.printf("Add %d + %d \n", number1,number2);
		//System.out.print("Add " + number1 +" "+number2 );
		//System.out.printf("Add %d %d equals to 10?", number1, number2);
		//Scanner input = new Scanner(System.in);
		//int answer = JOptionPane.showConfirmDialog(null,"2 + 6 = 10?");
		//int answer = 10;
		//if (10 == sum){
			//System.out.println("True");
			//if(answer == True)
				//System.out.println("True");
			//else
				//System.out.println("False");}
		//else {
			//if(answer == True)
					//System.out.println("False");
				//else
					//System.out.println("True");

			//}
		//if (answer == JOptionPane.YES_OPTION)
			//JOptionPane.showMessageDialog(null, "False");
		//else
			//JOptionPane.showMessageDialog(null, "True");
	Scanner input = new Scanner(System.in);
	int answer = input.nextInt();
	switch (answer){
		case 1: 
				System.out.println("1yuefen");
				break;
		case 2: 
				System.out.println("2yuefen");
				break;
		default: System.out.println("Incurrect Input");

	}



	}
}