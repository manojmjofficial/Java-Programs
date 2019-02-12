//This Program Checks whether the given character is a Vowel or Consonant
import java.util.Scanner;
class Vowel{
	public static void main(String[] qwe){
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().toLowerCase().charAt(0);
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		System.out.println("Vowel");
		else
		System.out.println("Consonant");
	}
}
