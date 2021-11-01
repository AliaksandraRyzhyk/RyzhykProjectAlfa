package task3.singleton;

public class ProgramPatternSingleton {
    public static void main(String[] args) {
        Wallet wallet = Wallet.getInstance();
        System.out.println(wallet.getMoney());
        wallet.addMoney(100.00);
        System.out.println(wallet.getMoney());
        wallet.giveMoney(33.00);
        System.out.println(wallet.getMoney());
    }
}

