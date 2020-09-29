import edu.csc413.calculator.evaluator.Operand;
import edu.csc413.calculator.operators.MultiplyOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;




@DisplayName("Multiplication test")
public class MultiplyOperatorTest {
    @Test
    public void MultiplyTest() {
        Operand lhs = new Operand(5);
        Operand rhs = new Operand(10);
        MultiplyOperator op = new MultiplyOperator();
        Operand result = new Operand(op.execute(lhs, rhs).getValue());
        assertThat(result.getValue(), is(equalTo(50)));
    }

    @Test
    public void MultiplyReversedOperandTest() {
        Operand lhs = new Operand(10);
        Operand rhs = new Operand(5);
        MultiplyOperator op = new MultiplyOperator();
        Operand result = new Operand(op.execute(lhs, rhs).getValue());
        assertThat(result.getValue(), is(equalTo(50)));

    }

    @Test
    public void SubtractionNegativeOperandTest() {
        Operand lhs = new Operand(-10);
        Operand rhs = new Operand(5);
        MultiplyOperator so = new MultiplyOperator();
        Operand result = new Operand(so.execute(lhs, rhs).getValue());
        assertThat(result.getValue(), is(equalTo(-50)));

    }

    @Test
    public void MultiplicationNegativeOperandTest() {
        Operand lhs = new Operand(10);
        Operand rhs = new Operand(-5);
        MultiplyOperator so = new MultiplyOperator();
        Operand result = new Operand(so.execute(lhs, rhs).getValue());
        assertThat(result.getValue(), is(equalTo(-50)));

    }

    @Test
    public void MultiplicationNegativeOperandReversedTest() {
        Operand lhs = new Operand(-10);
        Operand rhs = new Operand(5);
        MultiplyOperator so = new MultiplyOperator();
        Operand result = new Operand(so.execute(lhs, rhs).getValue());
        assertThat(result.getValue(), is(equalTo(-50)));

    }
        @Test
        public void multiplicationPrecedenceTest(){
            assertThat((new MultiplyOperator().precedence()), is(equalTo(2)));
        }


}