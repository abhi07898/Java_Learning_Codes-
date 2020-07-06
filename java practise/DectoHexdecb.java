import java.util.Scanner;
public class DectoHexdecb{
public static void main(String[] args){
Scanner no = new Scanner(System.in);
System.out.println("Decimal");
int nr1 = no.nextInt();
System.out.println("Hexa no is = " + Integer.toHexString(nr1));
}
}