package exercise2;
import java.util.Scanner;
public class Circle {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.print("Enter r: ");
  double r = input.nextDouble();
  double c = 2.0 * Math.PI * r;
  double a = Math.PI * r * r;

  System.out.println("Circumference: " + c);
  System.out.println("Area: " + a);

}
}

