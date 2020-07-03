import java.util.Scanner;
public class Special{

    public static void main(String args[]) {
Scanner m= new Scanner(System.in);
System.out.println("enter anything");
char x= m.nextChar(); 
      
      if((x>=65 &&x<=90 )||(x>=97&&x<=122) )
      {
System.out.println("alphabet");
      }
      else if(x>=48 && x<=57)
      {
System.out.println("digit");
      }
else
{
System.out.println("special character");
    }
}
}
