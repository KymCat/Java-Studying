package Basic.finalStudy;

public class FieldInit {
    // 관례 : static final 변수는 대문자
    // 초기값을 넣어버린 final 변수는 생성자로도 변경 안됨
    static final int CONST_VALUE = 10;
    final int value = 10;

    public FieldInit() {
        // this.value = value;  컴파일 오류
        // this.CONST_VALUE = 20;  컴파일 오류
    }
}
