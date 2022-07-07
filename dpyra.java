import java.util.*;
public class dpyra
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("number of rows  ");
int a = scanner.nextInt();
for (int i = 1; i <= a; i++)
{
for (int j = a; j > i; j--)
{
System.out.print("*");
}
System.out.println();
}
}
}