import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double litersPer100km;
    double milesPerGallon;
    litersPer100km = sc.nextDouble();
    sc.close();
    milesPerGallon = 237.50/litersPer100km;
    System.out.printf("miles-per-gallon: %.2f", milesPerGallon);
  }
}
