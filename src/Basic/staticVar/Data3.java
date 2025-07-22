package Basic.staticVar;

public class Data3 {
    public String name;
    public static int count; // static 변수 (정적변수)

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
