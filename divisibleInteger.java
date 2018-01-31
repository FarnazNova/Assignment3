import java.util.Scanner;

public class divisibleInteger
{
	public static void main(String[] args)
	{
		//Write a program that prompts the user to enter an integer and determines
		//whether it is divisible by 5 and 6
		//whether it is divisible by 5 or 6,
		//whether it is divisible by 5 or 6, but not both.
		Scanner scan = new Scanner(System.in);
		System.out.println("Pleas enter an integer:");
		int input = scan.nextInt();
		//whether it is divisible by 5 and 6
		 if(input%5 == 0 && input%6 == 0)
		 {
			 System.out.println(input + " s divisible by 5 and 6. ");
         }
		//whether it is divisible by 5 or 6
         if(input%5 == 0 || input%6 == 0)
         {
             System.out.println(input + " is divisible by 5 OR 6. ");
         }
        //whether it is divisible by 5 or 6, but not both.
         if(input%5 == 0 ^ input%6 == 0)
         {
             System.out.println(input + " is divisible by 5 OR 6, but not both. ");
         }

       }

}