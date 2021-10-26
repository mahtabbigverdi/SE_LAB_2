package calculator;
import java.lang.Math;


public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double sqr(int a) {
        if (a < 0)
            return -1;
        return Math.sqrt(a);
    }

    public double rvs(int a){
        if (a == 0)
            return 0;
        return 1/(double)(a);
    }

    public double operate(int a, String op) {
        if (op.equals("rvs"))
            return this.rvs(a);
        else if (op.equals("sqr"))
            return this.sqr(a);
        else
            return 0;
    }
}
