class LinearSearch{
public static void main(String[] args){
int n=10, search=50;
int a[n]={10,20,30,40,50,60,70,80,90,100};
boolean flag = false;
for(int i=0; i<n;i++)
if(a[i]==search){
flag =true;
break;
}
if(flag)
System.out.println("Search Found");
else
System.out.println("Search not found");
}
}