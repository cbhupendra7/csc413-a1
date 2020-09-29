
import edu.csc413.calculator.evaluator.Evaluator;
import edu.csc413.calculator.exceptions.InvalidExpressionException;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EvaluatorSimpleExpressionTest {

    public Evaluator evaluator;


    @Test
    public void OddOperand() {
        String Expression = "9+((6+1)-8";
        Evaluator ExpressionTest = new Evaluator();
        assertThrows(InvalidExpressionException.class, () -> ExpressionTest.evaluateExpression(Expression));

    }

    @Test
    public void DoubleOperator() {
            String Expression = "8**10";
            Evaluator ExpressionTest = new Evaluator();
            assertThrows(EmptyStackException.class, () -> ExpressionTest.evaluateExpression(Expression));
        }
 }


