//This program checks whether the given number is a Positive, Negative or a Zero.
import java.util.Scanner;
class CheckSign{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number:");
int a=scan.nextInt();
if(a<0){
System.out.println(a+" is a Negative Integer");
}
else if(a>0){
System.out.println(a+" is a Positive Integer");
}
else{
System.out.println("The Given number is a Zero");
}
}
}
