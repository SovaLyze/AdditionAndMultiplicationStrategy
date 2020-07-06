package strategy.StrategyAsseco.domain;

public class VatMulti implements Vat {

    @Override
    public double calculate(double firstValue, double secondValue) {
        double result;
        result = firstValue * secondValue;
        return result;
    }
}
