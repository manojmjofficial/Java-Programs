//This program checks whether the given number is odd or even.
import java.util.Scanner;
class OddEven{
	public static void main(String[] qwe){
		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter a number:");
		int a=sc.nextInt();
		if(a%2==0)
		System.out.println(a+" is even");
		else
		System.out.println(a+" is odd");
	}
}
