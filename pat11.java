public class pat11
{ 

public static void main(String[]args){


for(int i=1;i<=5;i++)
{
	for(int k=5;k>=i;k--)   // For space
{
	
System.out.print(" ");
}

for(int j=1;j<=i;j++)   // For Printing
{
	
System.out.print("*");
}
for(int j=2;j<=i;j++)   // For Printing
{
	
System.out.print("*");
}

System.out.println();

}
}
}