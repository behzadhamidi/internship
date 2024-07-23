package overloading;

import overloading.EquationSolver;

public class Main {
    public static void main(String[] args) {
        EquationSolver solver = new EquationSolver();

        solver.solve(2, 3, 6);

        solver.solve(2, 3, 4, 10);
    }
}
