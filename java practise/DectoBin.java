import java.util.Scanner;
public class DectoBin {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int num = 0;

System.out.print("Input a Decimal Number : ");
num = in.nextInt();

System.out.println("Binary number is: " + Integer.toBinaryString(num));
}
}