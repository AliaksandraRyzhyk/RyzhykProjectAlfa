package task3.factoryMethod;

public class PreseedInvestmentFactory implements InvestmentFactory {
    @Override
    public Investment createInvestment() {
        return new PreseedInvestment();
    }
}
