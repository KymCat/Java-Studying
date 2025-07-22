package Basic.staticVar;

public class Data1 {
    public String name;
    public int count;

    // 객체가 생성 될 때마다 count 1 증가
    public Data1(String name) {
        this.name = name;
        count++;
    }
}
