package Basic.staticVar;

public class DataCountMain3 {
    public static void main(String[] args) {
        Basic.staticVar.Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("A count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("A count = " + Data3.count);



        // 추가
        // 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); // 실제로는 메서드 영역의 static 영역으로 감

        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }

    /*
        static이 붙은 멤버변수 => Data3.count
        static 변수는 인스턴스 영역(힙영역)이 아니라 메서드 영역에서 관리
        따라서 한 곳에서 count가 관리되므로 객체가 생성될때마다 누적되는 것임 !

         < 정적변수는 딱 하나만 존재 ! >
     */



}
