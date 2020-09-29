import edu.csc413.calculator.evaluator.Operand;
import edu.csc413.calculator.operators.AddOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@DisplayName("Addition Test")
public class AddOperatorTest {
   @Test
    public void AdditionTest(){
       Operand lhs = new Operand(5);
       Operand rhs = new Operand(10);
       AddOperator addoperator = new AddOperator();
       Operand result = new Operand(addoperator.execute(lhs,rhs).getValue());
       assertThat(result.getValue(), equalTo(15));
   }
    @Test
    public void AdditionReverseOperandTest(){
        Operand lhs = new Operand(10);
        Operand rhs = new Operand(5);
        AddOperator addoperator = new AddOperator();
        Operand result = new Operand(addoperator.execute(lhs,rhs).getValue());
        assertThat(result.getValue(), equalTo(15));
    }
    @Test
    public void AdditionWithNegativeOperandTest(){
        Operand lhs = new Operand(5);
        Operand rhs = new Operand(-10);
        AddOperator addoperator = new AddOperator();
        Operand result = new Operand(addoperator.execute(lhs,rhs).getValue());
        assertThat(result.getValue(), equalTo(-5));
    }
    @Test
    public void AdditionNegativeOperandsReversedTest(){
        Operand lhs = new Operand(-10);
        Operand rhs = new Operand(5);
        AddOperator addoperator = new AddOperator();
        Operand result = new Operand(addoperator.execute(lhs,rhs).getValue());
        assertThat(result.getValue(), equalTo(-5));
    }
    @Test
    public void AdditionPrecedenceTest(){
       assertThat((new AddOperator().precedence()), equalTo(1));
    }

}
