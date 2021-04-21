import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


    public class CalculatorTests { /*Also known as MyFirstJunitJupiterTests*/

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        int result = calculator.add(5,2);

        assertEquals(7,result);
    }
    @Test
    void testSubtraction(){
        int result = calculator.sub(8,5);

        assertEquals(5, result);
    }
    @Test
    void testMultiplication() {
        int result = calculator.mult(4, 5);
        
        assertEquals(20, result);
    }
    @Test
        void TestDivision(){
        int result = calculator.div2(2,2);
        assertEquals(1, result);
    }
    @Test
        void testSquareRoot(){
        double result = calculator.squareRoot(9);
        assertEquals(3,result);
    }
}
