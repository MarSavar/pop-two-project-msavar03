package fraction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FractionImplTest {

    FractionImpl frac1 = new FractionImpl(-2,5);
    FractionImpl frac2 = new FractionImpl(5,-20);
    FractionImpl frac3 = new FractionImpl(82);
    FractionImpl frac4 = new FractionImpl(-32);
    FractionImpl frac5 = new FractionImpl("50/25");
    FractionImpl frac6 = new FractionImpl(" 0 ");
    FractionImpl frac7 = new FractionImpl(" 4/10");
    FractionImpl frac8 = new FractionImpl(8,-16);


    @Test
    void add() {

        String comparison = frac1.add(frac1).toString();
        assertEquals(comparison, "-4/5");

        comparison = frac1.add(frac2).toString();
        assertEquals(comparison, "-13/20");

        comparison = frac1.add(frac3).toString();
        assertEquals(comparison, "408/5");

        comparison = frac1.add(frac4).toString();
        assertEquals(comparison, "-162/5");

        comparison  = frac1.add(frac5).toString();
        assertEquals(comparison, "8/5");

    }


    @Test
    void subtract() {
        String comparison = frac1.subtract(frac1).toString();
        assertEquals(comparison, "0/1");

        comparison = frac1.subtract(frac2).toString();
        assertEquals(comparison, "-3/20");

        comparison = frac1.subtract(frac3).toString();
        assertEquals(comparison, "-412/5");

        comparison = frac1.subtract(frac4).toString();
        assertEquals(comparison, "158/5");

        comparison  = frac1.subtract(frac5).toString();
        assertEquals(comparison, "-12/5");
    }

    @Test
    void multiply() {
        String comparison = frac1.multiply(frac1).toString();
        assertEquals(comparison, "4/25");

        comparison = frac1.multiply(frac2).toString();
        assertEquals(comparison, "1/10");

        comparison = frac1.multiply(frac3).toString();
        assertEquals(comparison, "-164/5");

        comparison = frac1.multiply(frac4).toString();
        assertEquals(comparison, "64/5");

        comparison  = frac1.multiply(frac5).toString();
        assertEquals(comparison, "-4/5");
    }

    @Test
    void divide() {
        String comparison = frac1.divide(frac1).toString();
        assertEquals(comparison, "1");

        comparison = frac1.divide(frac2).toString();
        assertEquals(comparison, "8/5");

        comparison = frac1.divide(frac3).toString();
        assertEquals(comparison, "-1/205");

        comparison = frac1.divide(frac4).toString();
        assertEquals(comparison, "1/80");

        comparison  = frac1.divide(frac5).toString();
        assertEquals(comparison, "-1/5");
    }

    @Test
    void abs() {
        String comparison = frac1.abs().toString();
        assertEquals(comparison, "2/5");

        comparison = frac2.abs().toString();
        assertEquals(comparison, "1/4");

        comparison = frac3.abs().toString();
        assertEquals(comparison, "82");

        comparison = frac4.abs().toString();
        assertEquals(comparison, "32");

        comparison  = frac5.abs().toString();
        assertEquals(comparison, "2");
    }

    @Test
    void negate() {
        String comparison = frac1.negate().toString();
        assertEquals(comparison, "2/5");

        comparison = frac2.negate().toString();
        assertEquals(comparison, "1/4");

        comparison = frac3.negate().toString();
        assertEquals(comparison, "-82");

        comparison = frac4.negate().toString();
        assertEquals(comparison, "32");

        comparison  = frac5.negate().toString();
        assertEquals(comparison, "-2");
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testEquals() {
        boolean comparison = frac1.abs().equals(frac7);
        assertEquals(comparison, true);

        comparison = frac1.equals(frac2);
        assertEquals(comparison, false);

        comparison = frac5.negate().equals(frac8.inverse());
        assertEquals(comparison, true);

        comparison = frac3.equals(frac3);
        assertEquals(comparison, true);

        comparison = frac5.equals(frac5.inverse());
        assertEquals(comparison,false);
    }

    @Test
    void testClone() {
    }

    @Test
    void inverse() {
        String comparison = frac1.inverse().toString();
        assertEquals(comparison, "-5/2");

        comparison = frac2.inverse().toString();
        assertEquals(comparison, "-4");

        comparison = frac3.inverse().toString();
        assertEquals(comparison, "1/82");

        comparison = frac4.inverse().toString();
        assertEquals(comparison, "-1/32");

        comparison  = frac5.inverse().toString();
        assertEquals(comparison, "1/2");
    }

    @Test
    void compareTo() {
        int comparison = frac1.compareTo(frac2); // -2/5 is lesser than -1/4
        assertEquals(comparison, -1);

        comparison = frac1.compareTo(frac3); // -2/5 is lesser than 82
        assertEquals(comparison, -1);

        comparison = frac2.compareTo(frac4); // -1/4 is greater than -32
        assertEquals(comparison, 1);

        comparison = frac7.compareTo(frac6); // 2/5 is greater than 0
        assertEquals(comparison, 1);

        comparison = frac5.compareTo(frac8.negate().inverse()); // 2 is equal to 2
        assertEquals(comparison, 0);

    }

    @Test
    void testToString() {
        String comparison = frac1.toString();
        assertEquals(comparison, "-2/5");

        comparison = frac2.toString();
        assertEquals(comparison, "-1/4");

        comparison = frac3.toString();
        assertEquals(comparison, "82");

        comparison = frac4.toString();
        assertEquals(comparison, "-32");

        comparison  = frac5.toString();
        assertEquals(comparison, "2");

        comparison  = frac6.toString();
        assertEquals(comparison, "0/1");
    }
}