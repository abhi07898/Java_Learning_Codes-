import java.util.Scanner;

public class DectoOctb {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int a = sc.nextInt();

System.out.println(Integer.toOctalString(a));
}
}