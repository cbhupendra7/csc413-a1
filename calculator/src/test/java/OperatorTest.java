import edu.csc413.calculator.operators.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

    public class OperatorTest {
    @Test
    public void createTest1(){
        Operator su = Operator.create("+");
        assertTrue(su instanceof AddOperator);
    }
    @Test
    public void createTest2(){
        Operator su = Operator.create("-");
        assertTrue(su instanceof SubtractOperator);
    }
    @Test
    public void createTest3(){
        Operator su = Operator.create("*");
        assertTrue(su instanceof MultiplyOperator);
    }
    @Test
    public void createTest4(){
        Operator su = Operator.create("/");
        assertTrue(su instanceof DivideOperator);
    }
    @Test
     public void createTest5(){
        Operator su = Operator.create("^");
        assertTrue(su instanceof PowerOperator);
    }
    @Test
    public void createTest6(){
        Operator su = Operator.create("c");
        assertTrue(su == null);
    }

}
