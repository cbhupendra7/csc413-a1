import edu.csc413.calculator.evaluator.Operand;
import edu.csc413.calculator.operators.SubtractOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


@DisplayName("Subtraction Test")
public class SubtractOperatorTest {

    @Test
    public void SubtractionTest() {
        Operand lhs = new Operand(5);
        Operand rhs = new Operand(10);
        SubtractOperator so = new SubtractOperator();
        Operand result = new Operand(so.execute(lhs, rhs).getValue());
        assertThat(result.getValue(), is(equalTo(-5)));
    }

    @Test
    public void SubtractionTestReversedOperands() {
        Operand lhs = new Operand(10);
        Operand rhs = new Operand(5);
        SubtractOperator so = new SubtractOperator();
        Operand result = new Operand(so.execute(lhs, rhs).getValue());
        assertThat(result.getValue(), is(equalTo(5)));

    }
    @Test
    public void SubtractionTestNegativeOperands() {
        Operand lhs = new Operand(-10);
        Operand rhs = new Operand(5);
        SubtractOperator so = new SubtractOperator();
        Operand result = new Operand(so.execute(lhs, rhs).getValue());
        assertThat(result.getValue(), is(equalTo(-15)));

    }
    @Test
    public void SubtractionTestNegativeOperandsReversed() {
        Operand lhs = new Operand(10);
        Operand rhs = new Operand(-5);
        SubtractOperator so = new SubtractOperator();
        Operand result = new Operand(so.execute(lhs, rhs).getValue());
        assertThat(result.getValue(), is(equalTo(15)));

    }
    @Test
    public void subtractionPrecedenceTest(){
        assertThat((new SubtractOperator().precedence()),is(equalTo(1)));
    }
}