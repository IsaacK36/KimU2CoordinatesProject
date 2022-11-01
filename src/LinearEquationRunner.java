import java.util.Scanner;
class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String coordinate1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coordinate2 = scan.nextLine();
        System.out.println();
        int x1 = Integer.parseInt(coordinate1.substring(1, coordinate1.indexOf(",")));
        int y1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf(",") + 2, coordinate1.length() - 1));
        int x2 = Integer.parseInt(coordinate2.substring(1, coordinate2.indexOf(",")));
        int y2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf(",") + 2, coordinate2.length() - 1));
        LinearEquation coordinates = new LinearEquation(x1, y1, x2, y2);
        System.out.println(coordinates.lineInfo());
        System.out.print("Enter a value for x: ");
        System.out.println("The point on the line is " + coordinates.coordinateForX(scan.nextDouble()));
    }
}
