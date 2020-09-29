package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator{

    public int precedence(){

        return 3;
    }
    public Operand execute(Operand lhs, Operand rhs){
        Operand total = new Operand((int)Math.pow(lhs.getValue(),rhs.getValue()));
        return total;
    }
}
