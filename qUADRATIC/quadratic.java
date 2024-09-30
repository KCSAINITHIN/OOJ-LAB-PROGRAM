
import java.util.Scanner;

class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, r1, r2;
        System.out.println("Enter the coefficient a: ");
        a = sc.nextDouble();  
        System.out.println("Enter the coefficient b: ");
        b = sc.nextDouble();  
        System.out.println("Enter the coefficient c: ");
        c = sc.nextDouble();  

        d = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Not a quadratic equation!");  
        } else if (d == 0) {
            r1 = (-b) / (2 * a);
            System.out.printf("Roots are real and equal: %.2f%n", r1);  
        } else if (d > 0) {
            r1 = ((-b) + (Math.sqrt(d))) / (2 * a);
            r2 = ((-b) - (Math.sqrt(d))) / (2 * a);
            System.out.printf("The roots are: r1 = %.2f, r2 = %.2f%n", r1, r2);  
        } else {  // d < 0
            System.out.println("Roots are imaginary.");
            r1 = (-b) / (2 * a);
            r2 = Math.sqrt(-d) / (2 * a);
            System.out.printf("The real part is: %.2f and the imaginary part is: %.2f i%n", r1, r2);          }

        sc.close();      }
}
