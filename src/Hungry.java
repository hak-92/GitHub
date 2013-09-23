import java.util.Scanner;
public class Hungry {
	
	private static Scanner input;

	public static void main (String [] args)
	{
		input = new Scanner(System.in);
		
	
	System.out.println ("You are hungry");
	System.out.println ("You decide to get in line");
	System.out.println ("And then you buy lunch");
	System.out.println ("BUT WAIT?! Are you thirsty? (1 = yes, 0 = no)");
	
	int answer = input.nextInt();
	
	if (answer == 1)
	{
		System.out.println ("Dont forget your diet! Did you have breakfast today? (1 = yes, 0 = no)");
		
		int b_answer = input.nextInt();
		
		if (b_answer == 1)
		{	
			System.out.println ("Cant get too fat! Diet coke for you!");
		}
		
		if (b_answer == 0)
		{	
			System.out.println ("Ok ok, you can have some coke...");
		}
		
	
		
	}
	
	if (answer == 0)
	{
		System.out.println ("Well I guess your not thirsty, but you're getting water anyway!");
	}
	

	System.out.println ("Now you finally sit down and eat lunch");

	System.out.println ("Yum, that was good! Now you go and return your tray");
	System.out.println ("Well thats it for now, time to Leave");
	System.out.println ("The end");

}
}