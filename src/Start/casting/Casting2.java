package Start.casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; 컴파일 오류발생
        intValue = (int) doubleValue; // 명시적 형변환
        System.out.println(intValue); // 1

        /*
            큰 법위 => 작은범위 형변환
            명시적 형변환을 해줘야 컴파일 오류가 발생하지 않음
         */
    }
}
