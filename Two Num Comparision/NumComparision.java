import java.util.Scanner;
class NumComparision{
public static void main(String[] args){
Scanner obj1 = new Scanner(System.in);
System.out.println("Comparision Of Two Numbers");
int num1 = obj1.nextInt();
int num2 = obj1.nextInt();
if(num1>num2){	
	System.out.print(num1+"is Greater");
}
else{
	System.out.print(num2+"is Greater");}
}
}