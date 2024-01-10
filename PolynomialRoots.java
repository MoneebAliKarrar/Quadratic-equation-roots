
import java.util.Scanner;

public class PolynomialRoots {

    public static void main(String[] args) {
        System.out.println("please enter the coefficients A B C of the poynomial Ax2 + Bx + C = 0: (separation is Space)");
        Scanner input = new Scanner(System.in);
        double discriminant = 0 ;
        int[] coefficients;
        coefficients = new int[3];
        for (int i = 0; i < 3; i++) {
            String coefficientstr = input.next();
            int coefficient = Integer.parseInt(coefficientstr);
            coefficients[i] = coefficient;
        }
        if (coefficients[0]==0){
            System.out.println("THIS IS NOT QUADRATIC EQUATION !!!!!!");
            return;
        }else {
        discriminant = coefficients[1]*coefficients[1] - 4 * coefficients[0]*coefficients[2];
        }
        if (discriminant > 0){
            System.out.println("THE EQUATION HAS TWO REAL ROOTS:");
            double root1,root2;
            root1 = (-coefficients[1]+Math.sqrt(discriminant))/(2*coefficients[0]);
            root2 = (-coefficients[1]-Math.sqrt(discriminant))/(2*coefficients[0]);
            System.out.println("THE FIRS IS : " + root1);
            System.out.println("THE SECOND IS : " + root2);
        }else if(discriminant<0){
            System.out.println("THE EQUATION HAS NO REAL ROOTS");
        }else {
            System.out.println("THE EQUATION HAS ONE REAL ROOT");
            double root ;
             root = -coefficients[1]/(2*coefficients[0]);
             System.out.println("THE ROOT IS : " + root);
        }
    }
}
