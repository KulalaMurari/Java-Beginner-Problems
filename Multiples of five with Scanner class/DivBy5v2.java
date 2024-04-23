import java.util.Scanner;
class DivBy5v2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Value :");
int m = sc.nextInt();
int n=1;
for (; n<=m; ){
if(n%5==0)
System.out.println(n);
 n++;
}
}
}