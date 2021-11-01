package task3.singleton;

public class ProgramPatternSingletonWithEnum {
    public static void main(String[] args) {
        System.out.println(WalletWithEnum.INSTANCE.getMoney());
        WalletWithEnum.INSTANCE.addMoney(100.0);
        System.out.println(WalletWithEnum.INSTANCE.getMoney());
        WalletWithEnum.INSTANCE.giveMoney(33.0);
        System.out.println(WalletWithEnum.INSTANCE.getMoney());
    }
}

