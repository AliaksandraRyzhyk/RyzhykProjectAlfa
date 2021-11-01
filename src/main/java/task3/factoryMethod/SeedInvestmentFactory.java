package task3.factoryMethod;

public class SeedInvestmentFactory implements InvestmentFactory {
    @Override
    public Investment createInvestment() {
        return new SeedInvestment();
    }
}
