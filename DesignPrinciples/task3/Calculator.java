import java.util.Scanner;

class Calculator
{
public static void main(String args[])
{
MathFunctions c=new MathFunctions();
Scanner in=new Scanner(System.in);
int x,y;
while(true)
{
System.out.println("Menu");
System.out.println("1.Addition");
System.out.println("2.Multiplication");
System.out.println("3.Division");
System.out.println("4.Substraction");
System.out.println("5.exit");
System.out.println("Enter your choice");
int ch=in.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter 1st number");
x=in.nextInt();	
System.out.println("Enter 2nd number");
y=in.nextInt();
System.out.println("Addition:"+c.add(x,y));
break;
case 2:
System.out.println("Enter 1st number");
x=in.nextInt();	
System.out.println("Enter 2nd number");
y=in.nextInt();
System.out.println("Multiplication:"+c.mul(x,y));
break;
case 3:
System.out.println("Enter 1st number");
x=in.nextInt();	
System.out.println("Enter 2nd number");
y=in.nextInt();
System.out.println("Division:"+c.div(x,y));
break;
case 4:System.out.println("Enter 1st number");
x=in.nextInt();	
System.out.println("Enter 2nd number");
y=in.nextInt();
System.out.println("Substraction:"+c.sub(x,y));
break;
case 5:System.exit(0);
default:System.out.println("invalid option");
}
}
}
}