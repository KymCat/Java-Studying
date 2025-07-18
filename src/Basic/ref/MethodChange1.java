package Basic.ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("before method call a = " + a); // 10

        change(a);
        System.out.println("after method call a = " + a); // 10
    }

    static void change(int x) {
        x = 20;
    }
}
