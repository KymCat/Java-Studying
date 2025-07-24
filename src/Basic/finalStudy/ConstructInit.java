package Basic.finalStudy;

public class ConstructInit {
    // 생성자로 초기화 후, 더 이상 값 변경 X
    final int value;

    public ConstructInit(int value) {
        this.value = value;
    }
}
