package pt.isel;

public class App1 {
    public static void main(String[] args) {
        perTypeMethod(); // <=> App.perTypeMethod();

        new App().otherInstanceMethod();
        System.out.println("App from package pt.isel");
    }

    public void perInstanceMethod() {}

    public void otherInstanceMethod() {
        perInstanceMethod(); // <=> this.perInstanceMethod()
    }

    public static void perTypeMethod() {}
}
