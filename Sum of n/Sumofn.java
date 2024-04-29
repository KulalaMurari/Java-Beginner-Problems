import java.util.Scanner;
class Sumofn {
public static void main(String[] args){
int sum=0;
Scanner obj = new Scanner(System.in);
int n = obj.nextInt();
for(int m=0; m<=n; m++){
 sum=sum+m;
System.out.println(sum);
}
}
}