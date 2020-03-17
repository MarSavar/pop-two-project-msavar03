package fraction;

public class FractionImpl implements Fraction {

    private int numerator;
    private int denominator;

    /**
     * Finds the greatest common divisor between two numbers by implementing Euclid's algorithm.
     *
     * @param number1 representing the first number
     * @param number2 representing the second number
     * @return greatest common divisor between number1 and number2
     */
    private int computeGCD(int number1, int number2) {

        while (number1 != 0 && number2 != 0) {
            int temporary = number2;
            number2 = number1 % number2;
            number1 = temporary;
        }

        return number1 == 0 ? number2 : number1;
    }

    /**
     * Normalises the fraction by dividing both the numerator and the denominator by their greatest
     * common divisor and by making sure that the fraction never displays a negative denominator.
     *
     * @param numerator representing the numerator
     * @param denominator representing the denumerator
     */
    private void normalise(int numerator, int denominator) {

        int gcd = computeGCD(numerator, denominator);

        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;

        if (this.denominator < 0) {
            this.numerator *= -1;
            this.denominator *= -1;
        }

        if (this.numerator == 0) this.denominator = 1;
    }

    /**
     * Parameters are the <em>numerator</em> and the <em>denominator</em>.
     * Normalize the fraction as you create it.
     * For instance, if the parameters are <pre>(8, -12)</pre>, create a <pre>Fraction</pre> with numerator
     * <pre>-2</pre> and denominator <pre>3</pre>.
     *
     * The constructor should throw an <pre>ArithmeticException</pre> if the denominator is zero.
     *
     * @param numerator representing the numerator
     * @param denominator representing the denumerator
     */

    public FractionImpl(int numerator, int denominator) {
        try {
            if (denominator == 0) throw new ArithmeticException();
            else normalise(numerator, denominator);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by 0 is not allowed!");
        }
    }


    /**
     * The parameter is the numerator and <pre>1</pre> is the implicit denominator.
     *
     * @param wholeNumber representing the numerator
     */
    public FractionImpl(int wholeNumber) {
        this.numerator = wholeNumber;
        this.denominator = 1;
    }

    /**
     * The parameter is a <pre>String</pre> containing either a whole number, such as `5` or `-3`, or a fraction,
     * such as "8/-12".
     * Allow blanks around (but not within) integers.
     * The constructor should throw an <pre>ArithmeticException</pre>
     * if given a string representing a fraction whose denominator is zero.
     * <p>
     * You may find it helpful to look at the available String API methods in the Java API.
     *
     * @param fraction the string representation of the fraction
     */
    public FractionImpl(String fraction) {
        try {
            String[] separate = fraction.trim().split("/",2);
            int numerator = Integer.parseInt(separate[0]);
            int denominator = Integer.parseInt(separate[1]);

            if (denominator == 0) throw new ArithmeticException();
            else normalise(numerator, denominator);
        }
        catch (ArrayIndexOutOfBoundsException out_of_bounds) {
            this.numerator = Integer.parseInt(fraction.trim());
            this.denominator = 1;
        }
        catch (ArithmeticException division_by_zero) {
            System.out.println("Division by 0 is not allowed!");
        }
        catch (NumberFormatException number_format_exception) {
            System.out.println("Malformed input!");
        }

    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {
        FractionImpl frac = (FractionImpl)f;
        int num = (this.numerator * frac.denominator) + (this.denominator * frac.numerator);
        int den = this.denominator * frac.denominator;
        return new FractionImpl(num,den);
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {
        FractionImpl frac = (FractionImpl)f;
        int num = (this.numerator * frac.denominator) - (this.denominator * frac.numerator);
        int den = this.denominator * frac.denominator;
        return new FractionImpl(num,den);
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {
        FractionImpl frac = (FractionImpl)f;
        int num = this.numerator * frac.numerator;
        int den = this.denominator * frac.denominator;
        return new FractionImpl(num,den);
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f) {
        FractionImpl frac = (FractionImpl)f;
        int num = this.numerator * frac.denominator;
        int den = this.denominator * frac.numerator;
        return new FractionImpl(num,den);
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        int num = this.numerator < 0 ? this.numerator * -1 : this.numerator;
        return new FractionImpl(num, this.denominator);
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        int num = this.numerator*-1;
        return new FractionImpl(num, this.denominator);

    }

    /**
     * @inheritDoc
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Fraction)) return false;
        else {
            FractionImpl f = (FractionImpl)obj;
            FractionImpl compare = new FractionImpl(f.numerator, f.denominator);
            return (this.numerator == compare.numerator && this.denominator == compare.denominator);
        }
    }

    /**
     * @inheritDoc
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction inverse() {
        int num = this.denominator;
        int den = this.numerator;
        return new FractionImpl(num,den);
    }

    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(Fraction o) {
        FractionImpl frac = (FractionImpl)o;
        FractionImpl sub = (FractionImpl)this.subtract(frac);
        if (this.equals(frac)) return 0;
        return sub.numerator < 0 ? -1 : 1;
    }

    /**
     * @inheritDoc
     */
    @Override
    public String toString() {
        if (this.numerator == 0) return ("0/1");
        if (this.denominator == 1) return String.valueOf(this.numerator);
        return(this.numerator + "/" + this.denominator);
    }
}