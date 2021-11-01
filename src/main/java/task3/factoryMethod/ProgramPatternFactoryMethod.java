package task3.factoryMethod;

public class ProgramPatternFactoryMethod {
    public static void main(String[] args) {
        InvestmentFactory investmentFactory = createInvestmentByType("preseed investment");
        Investment investment = investmentFactory.createInvestment();
        investment.raiseMoney();
    }

    static InvestmentFactory createInvestmentByType(String type) {
        if (type.equalsIgnoreCase("seed investment")) {
            return new SeedInvestmentFactory();
        } else if (type.equalsIgnoreCase("preseed investment")) {
            return new PreseedInvestmentFactory();
        } else {
            throw new RuntimeException(type + " is unknown type");
        }
    }
}
