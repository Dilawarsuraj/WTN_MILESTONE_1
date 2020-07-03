import java.util.Scanner;
class Palindrom
{
   public static void main (String[] args){
 System.out.println("enter num");
Scanner m=new Scanner(System.in);
int num =m.nextInt();
int j,i=0;
int o=num;
while(num!=0){
  j= num%10;
i=i*10+j;
num=num/10;}
if(o==i)
System.out.println("it is palindrom");
else
System.out.println("it is not palindrom");

}
}
