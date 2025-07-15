package Start.casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; // expected 1.5
        System.out.println("div1 = " + div1); // 1

        double div2 = 3 / 2; // expected 1.5
        System.out.println("div2 = " + div2); // 1.0

        double div3 = 3.0 / 2; // expected 1.5
        System.out.println("div3 = " + div3); // 1.5

        double div4 = (double) 3 / 2; // expected 1.5
        System.out.println("div4 = " + div4); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b; // expected 1.5
        System.out.println("result = " + result); // 1.5

        /*
            1. 같은 타입끼리의 계산은 같은 타입의 결과가 출력
                - int + int는 int, double + double은 double
            2. 서로 다른 타입의 계산은 큰범위로 자동 형변환
                - int + long은 long + long으로 자동 형변환
                - int + double은 dobule + double로 자동 형변환
         */
    }
}
