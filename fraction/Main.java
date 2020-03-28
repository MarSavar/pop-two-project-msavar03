package fraction;
import java.util.ArrayList;

public class Main {

    /**
     * Prints out a separator.
     */
    public static void separator() {
        String sep = "-";
        System.out.println(sep.repeat(25));
    }

    /**
     * Automates the display of functions by taking a fraction as an argument
     * and displaying the following: normalised form, absolute value,
     * inverted and negated versions.
     * Increases count by 1 once the strings are displayed.
     * @param fraction representing the fraction to be displayed.
     */

    static int count = 1;
    public static void display(FractionImpl fraction) {

        try {
            System.out.println("(" + count + ") The fraction is " + fraction);
            System.out.println("(" + count + ") The absolute fraction is " + fraction.abs());
            System.out.println("(" + count + ") The inverse fraction is " + fraction.inverse());
            System.out.println("(" + count + ") The negated fraction is " + fraction.negate());
        }
        catch (ArithmeticException e) {
            System.out.println("Division by 0 is not allowed!");
        }

        separator();
        count++;

    }

    public static void main(String[] args) {

        // Constructor with two integers.
        // Positive first argument, positive second argument.
        FractionImpl fraction1 = new FractionImpl(2, 4);
        display(fraction1);

        // Positive first argument, negative second argument.
        FractionImpl fraction2  = new FractionImpl(3,-8);
        display(fraction2);

        // Negative first argument, positive second argument.
        FractionImpl fraction3  = new FractionImpl(-10,4);
        display(fraction3);

        // Negative first argument, negative second argument.
        FractionImpl fraction4  = new FractionImpl(-5,25);
        display(fraction4);

        // Constructor with a single integer.
        FractionImpl fraction5  = new FractionImpl(-6);
        display(fraction5);

        // Constructor with string including a forward slash.
        FractionImpl fraction6  = new FractionImpl(" -9 / 4 ");
        display(fraction6);

        // Constructor with a string representing a whole number.
        FractionImpl fraction7  = new FractionImpl("12");
        display(fraction7);

        // Testing 0.
        FractionImpl fraction8  = new FractionImpl(0);
        display(fraction8);

        // Putting all fractions into an ArrayList in order to automate operations.
        ArrayList<FractionImpl> fractions = new ArrayList<>();
        fractions.add(fraction1);
        fractions.add(fraction2);
        fractions.add(fraction3);
        fractions.add(fraction4);
        fractions.add(fraction5);
        fractions.add(fraction6);
        fractions.add(fraction7);
        fractions.add(fraction8);

        // Testing operations
        System.out.println("Addition");
        separator();
        for (int i=0; i<8;i+=2) {
            FractionImpl first = fractions.get(i);
            FractionImpl second = fractions.get(i+1);
            System.out.println(">> "+first+ " + "+ second +" = " + first.add(second));
        }
        separator();

        System.out.println("Subtraction");
        separator();
        for (int i=0; i<8;i+=2) {
            FractionImpl first = fractions.get(i);
            FractionImpl second = fractions.get(i+1);
            System.out.println(">> "+first+ " - "+ second +" = " + first.subtract(second));
        }
        separator();

        System.out.println("Multiplication");
        separator();
        for (int i=0; i<8;i+=2) {
            FractionImpl first = fractions.get(i);
            FractionImpl second = fractions.get(i+1);
            System.out.println(">> "+first+ " * "+ second +" = " + first.multiply(second));
        }
        separator();

        System.out.println("Division");
        separator();
        for (int i=0; i<8;i+=2) {
            FractionImpl first = fractions.get(i);
            FractionImpl second = fractions.get(i+1);
            try {
                System.out.println(">> "+first+ " / "+ second +" = " + first.divide(second));
            } catch (ArithmeticException e) {
                System.out.println("Division by 0 is not allowed!");
            }
        }
        separator();

        System.out.println("Equality");
        separator();
        for (int i=0; i<8;i+=2) {
            FractionImpl first = fractions.get(i);
            FractionImpl second = fractions.get(i+1);
            System.out.println(">> "+first+ " = "+ second +" = " + first.equals(second));
        }
        separator();

        System.out.println("Comparison");
        separator();
        for (int i=0; i<8;i+=2) {
            FractionImpl first = fractions.get(i);
            FractionImpl second = fractions.get(i+1);
            System.out.println(">> "+first+ " compared to "+ second +" = " + first.compareTo(second));
        }

    }

}

