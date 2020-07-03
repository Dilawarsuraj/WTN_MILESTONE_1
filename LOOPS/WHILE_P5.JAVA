import java.util.Scanner;
class SumNum
{
   public static void main (String[] args){
 System.out.println("enter num");
Scanner m=new Scanner(System.in);
int num =m.nextInt();
int i=num,sum=0;
 while(num!=0)
    {
        sum += num % 10;
        num = num / 10;
    {
   System.out.println (sum);
}
}
}
}
