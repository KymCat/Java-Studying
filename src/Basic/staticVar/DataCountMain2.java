package Basic.staticVar;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = " + counter.count);

        /*
            DataCountMain1과 다르게 객체의 생성 누적수가 증가함
            Counter 라는 공통된 클래스를 Data2 클래스 내에서 참조하므로 가능

            하지만 클래스가 아니라 다른 것으로 공통된 무언가를 할 수 있지 않을까 ?
                    =>>> static 변수
         */
    }
}
