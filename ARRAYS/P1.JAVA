import java.util.Scanner;
public class ArraySum{
public  static void main(String args[])
{

int i,sum=0;
float avg;
Scanner sc=new Scanner(System.in);
 System.out.print("Enter The Size of the Array : ");
       int size=sc.nextInt();
int array[]=new int[size];

System.out.println("enter the elements of array");
for(i=0;i<array.length;i++)
{  array[i]=sc.nextInt();
sum=sum+array[i];
}
avg =(float)(sum/array.length);
System.out.println(sum);
System.out.println(avg);
}
}
