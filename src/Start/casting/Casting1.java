package Start.casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue); // 10

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue); // 10.0

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue); // 20.0
    }

    /*
        작은 범위에서 큰 범위로의 대입은 자바 언어에서 허용
        하지만 결국 대입하는 형(타입)을 맞추어야 하기 때문에 내부적으로 형변환(자동 or 묵시적 형변환)
     */
}
