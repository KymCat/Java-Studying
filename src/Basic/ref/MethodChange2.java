package Basic.ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.value = 10;
        System.out.println("before method call value = " + d1.value); // 10

        change(d1);
        System.out.println("before method call value = " + d1.value); // 20
    }

    static void change(Data dataX) {
        dataX.value = 20;
    }
}
