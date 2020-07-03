import java.util.Scanner;
public class Colour{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter ch");
char ch=sc.next().charAt(0);
switch(ch){
 case 'y' :
System.out.println("yellow");
break;
 case 'g' :
System.out.println("green");
break;
case 'b':
System.out.println("bule");
break;
case 'r':
System.out.println("red");
break;
  default:
System.out.println("invalid code");
break;
}
}
}
