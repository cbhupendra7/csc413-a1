import edu.csc413.calculator.evaluator.Operand;
import edu.csc413.calculator.operators.DivideOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


@DisplayName("Division Test")
public class DivideOperatorTest {


    @Test
    public void DivisionTest() {
        Operand lhs = new Operand(5);
        Operand rhs = new Operand(10);
        DivideOperator so = new DivideOperator();
        Operand result = new Operand(so.execute(lhs, rhs).getValue());
        assertThat(result.getValue(), is(equalTo(0)));
    }

    @Test
    public void DivisionReversedOperandTest() {
        Operand lhs = new Operand(10);
        Operand rhs = new Operand(5);
        DivideOperator so = new DivideOperator();
        Operand result = new Operand(so.execute(lhs, rhs).getValue());
        assertThat(result.getValue(), is(equalTo(2)));

    }
    @Test
    public void DivisionEvenlyDivisibleTest(){
        Operand lhs = new Operand(14);
        Operand rhs = new Operand(5);
        DivideOperator so = new DivideOperator();
        Operand result = new Operand(so.execute(lhs, rhs).getValue());
        assertThat(result.getValue(), is(equalTo(2)));

    }
    @Test
    public void DivisionNegativeOperandsReversedTest() {
        Operand lhs = new Operand(10);
        Operand rhs = new Operand(-5);
        DivideOperator so = new DivideOperator();
        Operand result = new Operand(so.execute(lhs, rhs).getValue());
        assertThat(result.getValue(), is(equalTo(-2)));

    }
    @Test
    public void DivisionPrecedenceTest(){
        assertThat((new DivideOperator().precedence()),is(equalTo(2)));
    }
}



