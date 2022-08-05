import java.util.Arrays; 
import java.util.Scanner;  
public class SortArray  
{   
public static void main(String[] args)   
{   
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter 5 number:");
  int [] array = new int [5];   
for(int i=0;i<5;i++)
{
	array[i]=sc.nextInt();
}
Arrays.sort(array);   
System.out.println("Elements of array sorted in ascending order: ");  

for (int i = 0; i < array.length; i++)   
{       
System.out.println(array[i]);   
}   
}  
}  