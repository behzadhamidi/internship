package overloading;

public class EquationSolver {


    public void solve(double a, double b, double c) {

        if (a == 0 && b == 0) {
            System.out.println("No solution exists.");
            return;
        }

        double y = c / b;
        double x = (c - b * y) / a;

        System.out.println("Solution for 2-variable equation: x = " + x + ", y = " + y);
    }


    public void solve(double a, double b, double c, double d) {

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("No solution exists.");
            return;
        }


        double z = d / c;
        double y = (d - c * z) / b;
        double x = (d - b * y - c * z) / a;

        System.out.println("Solution for 3-variable equation: x = " + x + ", y = " + y + ", z = " + z);
    }
}
