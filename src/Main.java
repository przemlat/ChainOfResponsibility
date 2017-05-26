import java.util.Scanner;

/**
 * Created by plato on 2017-04-19.
 */
public class Main {

    public static void main(String[] args){

        Chain chainCalculation1 = new Add();
        Chain chainCalculation2 = new Subtract();
        Chain chainCalculation3 = new Multiply();
        Chain chainCalculation4 = new Divide();
        Chain chainCalculation5 = new Power();

        chainCalculation1.setNextChainElement(chainCalculation2);
        chainCalculation2.setNextChainElement(chainCalculation3);
        chainCalculation3.setNextChainElement(chainCalculation4);
        chainCalculation4.setNextChainElement(chainCalculation5);

        // Enter values and command here
        Values action = new Values(4, 2, "/");
        Values action1 = new Values(4, 2, "+");
        Values action2 = new Values(4, 2, "*");
        Values action3 = new Values(4, 2, "-");
        Values action4 = new Values(4, 2, "^");

        chainCalculation1.calculate(action);
        chainCalculation1.calculate(action1);
        chainCalculation1.calculate(action2);
        chainCalculation1.calculate(action4);
        chainCalculation1.calculate(action3);



    }
}
