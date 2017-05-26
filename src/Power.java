import static java.lang.Math.pow;

/**
 * Created by plato on 2017-04-19.
 */
public class Power implements Chain{

    private Chain nextChainElement;

    @Override
    public void setNextChainElement(Chain nextChainElement) {
        this.nextChainElement = nextChainElement;

    }

    @Override
    public void calculate(Values action) {
        if(action.getCalculationToPerform() == "^"){
            System.out.println(action.getValue1() + " ^ " + action.getValue2() + " = " + (pow((double)action.getValue1(), (double)action.getValue2())));
        } else{
            System.out.println("You can only perform +, -, *, / or ^");
        }

    }
}
