package task3.singleton;

public class Wallet {
    private static Wallet instance;
    private static double money;

    private Wallet() {}

    public static Wallet getInstance() {
        if (instance == null) {
            instance = new Wallet();
        }
        return instance;
    }

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

