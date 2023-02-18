import java.util.*;
public class Main {
    public static void main(String[] args) throws NumberFormatException{
        Scanner in = new Scanner(System.in);
        try {
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());

            Calculator calc = new Calculator(a, b);
            System.out.println(calc.Add(a, b));
            System.out.println(calc.Subtract(a, b));
            System.out.println(calc.Multiplication(a, b));
            System.out.println(calc.Division(a, b));
        }
        catch (NumberFormatException ex) {
            System.out.println(ex + " You need to enter only integers");
        }
    }
}

class Calculator {
    int a, b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double Add(int a, int b) throws ArithmeticException {
        if (a < 0 || b < 0) {
            throw new ArithmeticException("You need to enter only positive numbers!");
        }
        else {
            return a + b;
        }
    }

    public double Subtract(int a, int b) {
        if (a < 0 || b < 0) {
            throw new ArithmeticException("You need to enter only positive numbers!");
        }
        else {
            return a - b;
        }
    }

    public double Multiplication(int a, int b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("You can not enter ZERO!");
        }
        else {
            return a * b;
        }
    }

    public double Division(int a, int b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("You can not enter ZERO!");
        }
        else {
            return a * b;
        }
    }

}
