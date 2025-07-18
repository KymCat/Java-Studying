package Basic.ref;

public class classVarChange {
    public static void main(String[] args) {
        Data d1 = new Data();
        Data d2 = d1; // 참조형은 주소값 복사

        d1.value = 10;
        System.out.println("d1 = " + d1.value);
        System.out.println("d2 = " + d2.value);

        // d1.value 변경
        d1.value = 20;
        System.out.println("d1 = " + d1.value);
        System.out.println("d2 = " + d2.value);

        // d2.value 변경
        d2.value = 30;
        System.out.println("d1 = " + d1.value);
        System.out.println("d2 = " + d2.value);

        // 참조형 변수는 대입에 주소값을 변경하기 때문에 원본도 함께 바뀜
    }
}
