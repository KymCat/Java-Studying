package Basic.ref;

public class varChange {
    public static void main(String[] args) {
        int a = 10;
        int b = a; // a의 값 복사

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a 변경
        a = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b 변경
        b = 30;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 값 복사는 각 변수에 아무런 영향이 없음
    }
}
