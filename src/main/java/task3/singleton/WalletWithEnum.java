package task3.singleton;

public enum WalletWithEnum {
    INSTANCE;

    private static double money;

    private WalletWithEnum() {}

    public void addMoney(double add_money) {
        money = money + add_money;
    }

    public void giveMoney(double give_money) {
        if (money < give_money) {
            System.out.println("There is no enough money");
            return;
        }
        money =  money - give_money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
