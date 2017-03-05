import java.util.Scanner;
public class sqrtapproximation{
	public static void main(String[] args){
		System.out.println("Enter Num");
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		System.out.println("Enter lastGuess");
		double lastGuess = input.nextDouble();
		
		if (num < 0){
			System.out.println("Wrong Incorrect! num can't be negative!");
		}
		else if(lastGuess < 0){
			System.out.println("Wrong Incorrect! lastGuess should larger than 0!");
			
		}
		else{

			double nextGuess = (lastGuess + (num / lastGuess)) / 2;
			double n = Math.abs((nextGuess - lastGuess));
			while(n > 0.0001){
			//for(lastGuess > 0; (nextGuess - lastGuess) > 0.0001); nextGuess = lastGuess)
			//{
			lastGuess = nextGuess;
			nextGuess = (lastGuess + (num / lastGuess)) / 2;
			n = Math.abs(nextGuess - lastGuess);
			//}
			System.out.printf("%.10f \n", nextGuess);

		}
		
	}

}
}