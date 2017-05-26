/**
 * Created by plato on 2017-04-19.
 */
public class Subtract implements Chain{

    private Chain nextChainElement;

    @Override
    public void setNextChainElement(Chain nextChainElement) {
        this.nextChainElement = nextChainElement;

    }

    @Override
    public void calculate(Values action) {
        if(action.getCalculationToPerform() == "-"){
            System.out.println(action.getValue1() + " - " + action.getValue2() + " = " + (action.getValue1() - action.getValue2()));
        } else{
            nextChainElement.calculate(action);
        }

    }
}
