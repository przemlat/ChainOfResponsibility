/**
 * Created by plato on 2017-04-19.
 */
public interface Chain {

    public void setNextChainElement(Chain nextChainElement);

    public void calculate(Values action);

}

