/**
 * Created by plato on 2017-04-19.
 */
public class Values {

    private int value1;
    private int value2;

    private String calculationToPerform;

    public Values(int value1, int value2, String calculationToPerform){
        this.value1 = value1;
        this.value2 = value2;
        this.calculationToPerform = calculationToPerform;
    }

    public int getValue1(){ return value1; }
    public int getValue2(){ return value2; }
    public String getCalculationToPerform(){ return calculationToPerform; }

}
