

public class App {
    public static void main(String[] args) {
        B1 b1 = B1.INSTANCE;
        b1.foo();

        B b = B.INSTANCE;
        b.foo();



//        new Account();
//        new Account();
//        new Account();
//        new Account();
//        System.out.println(Account.Companion.getCountInstances());
    }
}
