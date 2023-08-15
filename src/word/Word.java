//how to print a integer entered by a used
package word;
import java.util.Scanner;
public class Word 
{
	public static void main(String []args)
	{
		fun1();
	}
	static void fun1(){
		Scanner Sc= new Scanner(System.in);
		int number1=Sc.nextInt();
		int number2=Sc.nextInt();
		int number3=Sc.nextInt();
//		System.out.print("Larest number of these three is:"+Math.max(Math.max(number1, number2), number3));
		if(number1<number2)
		{
			if(number2<number3)
			{
				System.out.print("largest number is : " +number3 );
			}
			else
			{
				System.out.print("largest number is: " +number2 );
			}
		}	
		
		else
		
		{
			if(number1<number3)
			{
				System.out.print(" largest number is :" +number3);
			}
			else
			{
				System.out.println("largest number is :" +number1);
			}
		}
		
	}	
}


