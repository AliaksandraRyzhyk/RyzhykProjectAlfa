package task3.factoryMethod;

public class PreseedInvestment implements Investment {
    @Override
    public void raiseMoney() {
        System.out.println("Pre-seed investment typically comes from the founder of the startup and their family members.");
    }
}
