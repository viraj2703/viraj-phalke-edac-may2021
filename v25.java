import java.util.Scanner;
public class v25
{
public static void main (String[] args)
{
Scanner in = new Scanner(System.in);
long octal_num,decimal_num =0;
int i=0;
System.out.print("Input any octal number: ");
octal_num=in.nextLong();
while(octal_num != 0)
{
decimal_num = (long)(decimal_num +(octal_num % 10) *math.pow(8,  i++));
octal_num = actal_num / 10;
}
System.out.printl("equivalent decimal number: " + decimal_num+"\n");
}
}