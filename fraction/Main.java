package fraction;

public class Main {
    public static void main(String[] args) {
        FractionImpl hello = new FractionImpl("2");
        System.out.println("The fraction is "+ hello);
        System.out.println("The absolute fraction is "+hello.abs());
        System.out.println("The inverse fraction is "+hello.inverse());
        System.out.println("The negated fraction is "+hello.negate());

        FractionImpl newfrac = new FractionImpl(1,3);
        System.out.println("The fraction is "+ newfrac);

        System.out.println("The sum is "+hello.add(newfrac));
        System.out.println("The difference is "+hello.subtract(newfrac));
        System.out.println("The multiplication is "+hello.multiply(newfrac));
        System.out.println("The division is "+hello.divide(newfrac));

        System.out.println("Comparison: "+hello.compareTo(newfrac));
        System.out.println("Equality: "+hello.equals(newfrac));
        //System.out.println(hello.divide(addition).toString());
        //FractionImpl newfrac = new FractionImpl(-34,2);


    }

}

