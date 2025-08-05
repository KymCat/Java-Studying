package Basic.poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();


        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");

        /*
            동물의 울음소리를 출력하는 프로그램
            Q. 동물이 추가되면 어떻게 될까 ?
            A. 클래스를 새로 만들고 main에 sound()를 추가해야한다.

            하지만 동물이 추가될 때 마다 중복되는 코드가 작성된다.

            중복되는 코드 제거
            1. 메서드 방법
                -> 동물마다 클래스로 나뉘므로 매개변수에 담지 못하므로 불가능

            2. 배열과 for문
                -> 배열은 하나의 타입으로 담아야 하므로 불가능

            모두 타입이 다르기 때문에
            타입을 하나로 같게 할 수 있다면 메서드, 배열을 활용해서 중복 제거 가능
                => 다형적 참조와 메서드 오버라이딩

             ex2 패키지에 해결방법 작성
         */
    }
}
