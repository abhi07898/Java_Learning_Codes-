import java.util.Scanner;

public class BintoDecb{
public static void main(String args[]){
Scanner bin = new Scanner(System.in);
System.out.println("Insert a binary number HERE :");
String nr1 = bin.next();
int decimal=Integer.parseInt(nr1,2);
System.out.println(decimal);
}}