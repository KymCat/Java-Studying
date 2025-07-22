package Basic.staicMethod;

public class DecoMain {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil utils = new DecoUtil();
        String deco = utils.deco(s);

        System.out.println("before: " + s);
        System.out.println("after " + deco);

        /*
            문자열을 꾸미기 위해서 멤버변수도 없는 클래스를 만들고 객체생성까지..
            뭔가 너무 필요없는 과정이 있는게 아닌가 ?
        */

        // static 메서드를 사용해보자
        String decoStatic = DecoUtilStatic.deco(s); // 정적 메서드 사용
        System.out.println("before: " + s);
        System.out.println("after " + decoStatic);

        // 객체 생성없이 클래스.정적메서드로 바로 사용하여 코드 줄이기 !
    }


}
