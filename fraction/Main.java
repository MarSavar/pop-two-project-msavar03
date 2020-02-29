package fraction;

public class Main {
    public static void main(String[] args) {
        FractionImpl hello = new FractionImpl(100,2);
        System.out.println(hello.toString());
        System.out.println(hello.inverse());
        //FractionImpl addition = new FractionImpl(2,4);
        //System.out.println(hello.divide(addition).toString());


    }

}

