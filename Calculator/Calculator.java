import java.util.Scanner;
class Calculator{
public static void main(String[] args){
@SuppressWarnings("resource")
Scanner obj1 = new Scanner(System.in);
System.out.println("1. Addition"+"\n"+"2. Subtraction"+"\n"+"3. Multiplication"+"\n "+"4. Division");
int choice = obj1.nextInt();
switch (choice){
case 1:
	int num1 = obj1.nextInt();
	int num2 = obj1.nextInt();
	int sum1 = num1+num2;
	System.out.print("The sum is "+sum1);
	break;


case 2:
	int num3 = obj1.nextInt();
	int num4 = obj1.nextInt();
	int sum2 = num3-num4;
	System.out.print("The Difference is "+sum2);
	break;

case 3:
	int num5 = obj1.nextInt();
	int num6 = obj1.nextInt();
	int sum3 = num5*num6;
	System.out.print("The Product is "+sum3);
	break;

case 4:
	int num7 = obj1.nextInt();
	int num8 = obj1.nextInt();
	int sum4 = num7/num8;
	System.out.print("The Value is "+sum4);
	break;



default:
	System.out.print("Invalid Input");
	


}
}
}