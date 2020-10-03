# java-codes
//ARMSTRONG NUMBER CODE

import java.util.*;
class armstrong
{
int num=121;

public static void main()
{
int n=num, sum=0;

while(n>0)
{
int d=n%10;
sum=sum+d*d*d ;
n=n/10;
}

if(sum==num)
System.out.println("Armstrong");
else
System.out.println("not armstrong");
}
}
