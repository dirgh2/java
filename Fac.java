import java.util.Scanner;
class Fac
{
public static void main(String[] args)
{
	Scanner no= new Scanner(System.in);
	System.out.println("Enter number:");
	int a=no.nextInt();
	int fact=1,i;
	for(i=1;i<=a;i++)
		{
			fact=fact*i;
		}
System.out.println(fact);
}
}