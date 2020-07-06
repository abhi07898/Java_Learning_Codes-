import java.util.Scanner;

public class HexagonArea {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter the length of a side of the hexagon: ");
double num = input.nextDouble();

System.out.println("The area of the hexagon is: " + (6 * (num*num))/(4*Math.tan(Math.PI/6)));

}
}