package Basic.staticVar;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count = " + data3.count);

        /*
            의도는 생성된 객체의 누적 수를 알고 싶은 것이지만, 모두 출력은 1이 나온다.
            당연히 객체를 생성할 때 마다 메모리가 새로이 할당되므로 1이 출력되는 것은 당연하다.
         */
    }
}
