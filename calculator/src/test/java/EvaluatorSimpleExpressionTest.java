

import edu.csc413.calculator.evaluator.Evaluator;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EvaluatorSimpleExpressionTest {

    public Evaluator evaluator;

    /**
     no result expected here as there is unpaired parentheses
     * */

@Test
  public void unbalanceExpressionTest() {
            String testExpression = "2+3*9((6+1)-8";
            assertThrows(NullPointerException.class, () -> {
        this.evaluator.evaluateExpression(testExpression);
        });

        }
    /***
     * no result expected as there is invalid Operator
     */


    @Test
    public void invalidOperatorExpressionTest() {
            String testExpression = "5+8**10";
            assertThrows(EmptyStackException.class, () -> {
        this.evaluator.evaluateExpression(testExpression);
        });
        }
 }


