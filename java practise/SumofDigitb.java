import java.util.Scanner;

public class SumofDigitb {
public static void main(String[] args) {

Scanner in = new Scanner(System.in);
System.out.println("Enter number");


String number = in.next();
int sum = 0;

for(int i = 0; i <= number.length() - 1; i++) {
String substring = number.substring(i, i + 1);
int digit = Integer.parseInt(substring);
sum += digit;
}
System.out.println(sum);
}
}