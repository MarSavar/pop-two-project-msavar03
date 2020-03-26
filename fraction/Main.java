package fraction;

public class Main {
    public static void main(String[] args) {
        FractionImpl fraction1  = new FractionImpl("-2/8");
        System.out.println("(1) The fraction is "+ fraction1);
        System.out.println("(1) The absolute fraction is "+fraction1.abs());
        System.out.println("(1) The inverse fraction is "+fraction1.inverse());
        System.out.println("(1) The negated fraction is "+fraction1.negate());

        FractionImpl fraction2 = new FractionImpl(1,3);
        System.out.println("The fraction is "+ fraction2);

        System.out.println("The sum of "+fraction2+" and "+fraction1+" is "+fraction1.add(fraction2));
        System.out.println("The difference is "+fraction1.subtract(fraction2));
        System.out.println("The multiplication is "+fraction1.multiply(fraction2));
        System.out.println("The division is "+fraction1.divide(fraction2));

        System.out.println("Comparison: "+fraction1.compareTo(fraction2));
        System.out.println("Equality: "+fraction1.equals(fraction2));
        //System.out.println(hello.divide(addition).toString());
        //FractionImpl newfrac = new FractionImpl(-34,2);


    }

}

