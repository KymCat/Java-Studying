package Basic.memory;

public class JavaMemoryMain {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");

        // main이 먼저 실행 되었지만 가장 마지막에 end
        // 자바의 실행은 스택구조로 실행됨
    }

    static void method1(int m1) {
        System.out.println("method1 start");

        int cal = m1 * 2;
        method2(cal);

        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("mehtod2 end");
    }
}
