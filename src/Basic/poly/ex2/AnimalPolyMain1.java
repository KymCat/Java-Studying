package Basic.poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    /*
        상속, 메서드 오버라이딩을 이용하여 중복 코드 제거 방법

        Q. 매개변수가 Animal인 이유는 ?
        A. 동물 클래스들은 모두 Animal을 상속 받고 있고,
           업캐스팅은 자동으로 캐스팅되므로 따로 코드를 작성할 필요가 없으며,
           동물 클래스에서 오버라이딩 된 sound() 함수들이 우선권을 가지므로 코드가 정상적으로 작동

     */
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
