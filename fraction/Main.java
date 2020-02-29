package fraction;

public class Main {
    public static void main(String[] args) {
        FractionImpl hello = new FractionImpl(2,-25);
        FractionImpl ciao = new FractionImpl(4,50);
        System.out.println(hello.add(ciao));
        //FractionImpl addition = new FractionImpl(2,4);
        //System.out.println(hello.divide(addition).toString());


    }

}

