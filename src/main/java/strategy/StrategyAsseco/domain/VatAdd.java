package strategy.StrategyAsseco.domain;

public class VatAdd implements Vat {

    @Override
    public double calculate(double firstValue, double secondValue) {
        double result;
        result = firstValue + secondValue;
        return result;
    }
}
