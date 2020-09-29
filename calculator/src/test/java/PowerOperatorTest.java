import edu.csc413.calculator.evaluator.Operand;
import edu.csc413.calculator.operators.PowerOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@DisplayName("Power Test")
public class PowerOperatorTest {



    @Test
    public void PowerTest() {
        Operand lhs = new Operand(2);
        Operand rhs = new Operand(2);
        PowerOperator so = new PowerOperator();
        Operand result = new Operand(so.execute(lhs, rhs).getValue());
        assertThat(result.getValue(), is(equalTo(4)));
    }

    @Test
    public void PowerTestNegativeBase() {
        Operand lhs = new Operand(-2);
        Operand rhs = new Operand(4);
        PowerOperator so = new PowerOperator();
        Operand result = new Operand(so.execute(lhs, rhs).getValue());
        assertThat(result.getValue(), is(equalTo(16)));
    }
    @Test
    public void powerPrecedenceTest(){
        assertThat((new PowerOperator().precedence()),is(equalTo(3)));
    }
}