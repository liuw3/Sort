import java.util.Scanner;
import javax.swing.JOptionPane;
public class loopPractice {
	public static void main(String[] args){
		
		int i = 5;
		int num = i;
		//float correct = 0;
		float incorrect = 0;
		while(i != 0){
			int number1 = (int)(Math.random()*10);
			int number2 = (int)(Math.random()*10);
			int sum = number1 + number2;
			
			//JOptionPane.showMessageDialog(null, "Add %d + %d \n", number1,number2)
			//System.out.printf("Add %d + %d \n", number1,number2);
			//Scanner input = new Scanner(System.in);
			String answer = JOptionPane.showInputDialog("Add" + number1 + "+" + number2 + "=");
			int data = Integer.parseInt(answer);
			if (data != sum){
				incorrect ++;
			}
			if((num - incorrect)/num < 0.6){
				//System.out.println("bujige ");
				JOptionPane.showConfirmDialog(null,"bujige");
				break;
			}
			i --;
		}
		if(i == 0){
		//System.out.println("Your currect rate is " + (int)
							//((num - incorrect)/num * 100) + "%");
			JOptionPane.showConfirmDialog(null,"");
		}




	}
}