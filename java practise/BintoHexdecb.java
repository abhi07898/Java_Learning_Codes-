import java.util.Scanner;

public class BintoHexdecb {
public static void main (String[] args){

Scanner input = new Scanner (System.in);
System.out.print("Print binary number to convert: ");
String binary = input.next();

int hex = Integer.parseInt(binary, 2);
String hexadecimal = Integer.toHexString(hex);

System.out.print("Equal is: " + hexadecimal);
}
}