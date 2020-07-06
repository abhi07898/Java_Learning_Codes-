public class HexagonAreab {

public static void main(String[] args) {

int side;
Scanner in = new Scanner(System.in);

System.out.println("Insert a length of a side for your hexagon: ");
side = in.nextInt();

System.out.println("The length of a side of your hexagon is: " + side + ". The area of your hexagon is:" + (Math.pow(6, 2))*(3 * Math.sqrt(3)/2));

}

}