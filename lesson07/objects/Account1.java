public class Account1 {
    private static int instanceCount = 0;

    public Account1() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
