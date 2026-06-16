import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.printf("Phương trình có hai nghiệm: %.5f and %.5f\n",
                    equation.getRoot1(), equation.getRoot2());
        } else if (delta == 0) {
            System.out.printf("Phương trình có một nghiệm: %.5f\n", equation.getRoot1());
        } else {
            System.out.println("Phương trình không có nghiệm");
        }

        scanner.close();
    }
}