package edu.csc413.calculator.operators;
import edu.csc413.calculator.evaluator.Operand;
public class AddOperator extends Operator {

    public int precedence(){
        return 1;
    }
    public Operand execute(Operand lhs, Operand rhs){
        Operand total = new Operand(lhs.getValue()+rhs.getValue());
        return total;
    }
}
