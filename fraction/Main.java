package fraction;

public class Main {
    public static void main(String[] args) {
        FractionImpl hello = new FractionImpl("5/10");
        System.out.println(hello);
        FractionImpl addition = new FractionImpl(1,2);
        //System.out.println(hello.divide(addition).toString());
        //FractionImpl newfrac = new FractionImpl(-34,2);

        System.out.println(hello.add(addition));


    }

}

