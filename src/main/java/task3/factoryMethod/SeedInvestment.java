package task3.factoryMethod;

public class SeedInvestment implements Investment {
    @Override
    public void raiseMoney() {
        System.out.println("Seed investment typically comes from angel investors");
    }
}
