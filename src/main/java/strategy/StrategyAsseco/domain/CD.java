package strategy.StrategyAsseco.domain;

public class CD  {

    private double firstNumber;
    private double secondNumber;

    public CD(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double price(Vat vat) {
        return vat.calculate(10, 5);
    }
}
