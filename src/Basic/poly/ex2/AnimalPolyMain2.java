package Basic.poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Caw() };

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    // ctrl + alt + m => 드래그 부분 메서드 추출
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    /*
        이 코드의 문제점
        1. Animal의 인스턴스를 만들고 sound()를 사용하는 문제
            => Animal은 추상적인 개념으로 누군가가 실수로 사용하는 문제를 하결 필요

        2. Animal 클래스를 상속받고 sound() 메서드 오버라이딩을 하지 않을 가능성
            => 코드상 문제는 없지만 Animal.sound()가 호출되어 의도와는 다른 코드가 된다

        해결방법 : 추상 클래스
     */
}
