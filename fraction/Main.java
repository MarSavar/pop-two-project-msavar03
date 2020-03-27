package fraction;

public class Main {
    public static void main(String[] args) {

        // Testing constructor with two integers.
        // Positive first argument, positive second argument.
        System.out.println("Testing constructor with two integers: 2, 4");
        FractionImpl fraction1  = new FractionImpl(2,4);
        System.out.println("(1) The fraction is "+ fraction1);
        System.out.println("(1) The absolute fraction is "+fraction1.abs());
        System.out.println("(1) The inverse fraction is "+fraction1.inverse());
        System.out.println("(1) The negated fraction is "+fraction1.negate());
        System.out.println("**********");

        // Positive first argument, negative second argument.
        System.out.println("Testing constructor with two integers: 3, -8");
        FractionImpl fraction2  = new FractionImpl(3,-8);
        System.out.println("(2) The fraction is "+ fraction2);
        System.out.println("(2) The absolute fraction is "+fraction2.abs());
        System.out.println("(2) The inverse fraction is "+fraction2.inverse());
        System.out.println("(2) The negated fraction is "+fraction2.negate());
        System.out.println("**********");

        // Negative first argument, positive second argument.
        System.out.println("Testing constructor with two integers: -10, 4");
        FractionImpl fraction3  = new FractionImpl(-10,4);
        System.out.println("(3) The fraction is "+ fraction3);
        System.out.println("(3) The absolute fraction is "+fraction3.abs());
        System.out.println("(3) The inverse fraction is "+fraction3.inverse());
        System.out.println("(3) The negated fraction is "+fraction3.negate());
        System.out.println("**********");

        // Negative first argument, negative second argument.
        System.out.println("Testing constructor with two integers: -5, -25");
        FractionImpl fraction4  = new FractionImpl(-5,-25);
        System.out.println("(4) The fraction is "+ fraction4);
        System.out.println("(4) The absolute fraction is "+fraction4.abs());
        System.out.println("(4) The inverse fraction is "+fraction4.inverse());
        System.out.println("(4) The negated fraction is "+fraction4.negate());
        System.out.println("**********");

        // Testing constructor with a single integer.
        System.out.println("Testing constructor with a single integer: -6");
        FractionImpl fraction5  = new FractionImpl(-6);
        System.out.println("(5) The fraction is "+ fraction5);
        System.out.println("(5) The absolute fraction is "+fraction5.abs());
        System.out.println("(5) The inverse fraction is "+fraction5.inverse());
        System.out.println("(5) The negated fraction is "+fraction5.negate());
        System.out.println("**********");

        // Testing constructor with strings.
        System.out.println("Testing constructor with a string: \" -9 / 4 \"");
        FractionImpl fraction6  = new FractionImpl(" -9 / 4 ");
        System.out.println("(6) The fraction is "+ fraction6);
        System.out.println("(6) The absolute fraction is "+fraction6.abs());
        System.out.println("(6) The inverse fraction is "+fraction6.inverse());
        System.out.println("(6) The negated fraction is "+fraction6.negate());
        System.out.println("**********");

        // Testing constructor with a string.
        System.out.println("Testing constructor with a string: \" 12 \"");
        FractionImpl fraction7  = new FractionImpl(" 12 ");
        System.out.println("(7) The fraction is "+ fraction7);
        System.out.println("(7) The absolute fraction is "+fraction7.abs());
        System.out.println("(7) The inverse fraction is "+fraction7.inverse());
        System.out.println("(7) The negated fraction is "+fraction7.negate());
        System.out.println("**********");
        
        // Testing operations

        // Addition
        System.out.println("Testing addition.");
        System.out.println("(1) "+fraction1+" + ("+fraction2+") = "+fraction1.add(fraction2));
        System.out.println("(2) "+fraction3+" + "+fraction4+" = "+fraction3.add(fraction4));
        System.out.println("(3) "+fraction5+" + ("+fraction6+") = "+fraction5.add(fraction6));
        System.out.println("(4) "+fraction1+" + ("+fraction3+") = "+fraction1.add(fraction3));

        // Subtraction
        System.out.println("Testing subtraction.");
        System.out.println("(1) "+fraction1+" - ("+fraction2+") = "+fraction1.subtract(fraction2));
        System.out.println("(2) "+fraction3+" - "+fraction4+" = "+fraction3.subtract(fraction4));
        System.out.println("(3) "+fraction5+" - ("+fraction6+") = "+fraction5.subtract(fraction6));
        System.out.println("(4) "+fraction1+" - ("+fraction3+") = "+fraction1.subtract(fraction3));

        // Multiplication
        System.out.println("Testing multiplication.");
        System.out.println("(1) "+fraction1+" * ("+fraction2+") = "+fraction1.multiply(fraction2));
        System.out.println("(2) "+fraction3+" * "+fraction4+" = "+fraction3.multiply(fraction4));
        System.out.println("(3) "+fraction5+" * ("+fraction6+") = "+fraction5.multiply(fraction6));
        System.out.println("(4) "+fraction1+" * ("+fraction3+") = "+fraction1.multiply(fraction3));

        // Division
        System.out.println("Testing division.");
        System.out.println("(1) "+fraction1+" / ("+fraction2+") = "+fraction1.divide(fraction2));
        System.out.println("(2) "+fraction3+" / "+fraction4+" = "+fraction3.divide(fraction4));
        System.out.println("(3) "+fraction5+" / ("+fraction6+") = "+fraction5.divide(fraction6));
        System.out.println("(4) "+fraction1+" / ("+fraction3+") = "+fraction1.divide(fraction3));

    }

}

