import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner cal = new Scanner(System.in);
System.out.println("Enter two numbers: ");
double first = cal.nextDouble();
double second = cal.nextDouble();
System.out.println("Enter the Operator(+,-,*,/): ");
char operator=cal.next().charAt(0);
double result;

switch(operator) {
case '+':
	result=first+second;
	break;
case '-':	
result=first-second;
break;
case '*':	
result=first*second;
break;
case '/':	
result=first/second;
break;
default:
System.out.println("Error! Invalid operator");
return;
}
System.out.printf("%.1f %c %.1f=%.1f",first,operator,second,result);
}

}
