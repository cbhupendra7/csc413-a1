import edu.csc413.calculator.evaluator.Evaluator;
import edu.csc413.calculator.exceptions.InvalidExpressionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;



    @DisplayName("Evaluator Test")
    public class evaluateExpressionUnitTest {


        @Test
        public void Simplify() throws InvalidExpressionException {
            int result;
            String tokenExpression = "5+4*5-5";
            Evaluator simplify = new Evaluator();
            result = simplify.evaluateSimpleExpression(tokenExpression);
            assertThat(result, equalTo(20));
        }

        @Test
        public void Parenthesis() throws InvalidExpressionException {
            int result;
            String tokenExpression = "2+5+(3*3)";
            Evaluator simplify = new Evaluator();
            result = simplify.evaluateExpression(tokenExpression);
            assertThat(result, equalTo(16));

        }
        @Test
        public void DoubleParenthesis() throws InvalidExpressionException {
            int result;
            String tokenExpression = "5+5+2+((3*3))";
            Evaluator simplify = new Evaluator();
            result = simplify.evaluateExpression(tokenExpression);
            assertThat(result, equalTo(21));

        }



    }
