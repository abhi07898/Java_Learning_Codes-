import java.util.Scanner;

public class Binaryadd {
public static void main(String args[]) {

Scanner test= new Scanner(System.in);

System.out.println("Enter The First Binary No: ");
String bn1 = test.nextLine();

System.out.println("Enter The Second Binary No: ");
String bn2 = test.nextLine();

int n1 =Integer.parseInt(bn1, 2);
int n2 =Integer.parseInt(bn2, 2);
int n3 = n1 + n2;

System.out.println("The Addition Of 2 Binary No is : " + Integer.toBinaryString(n3));

}
}