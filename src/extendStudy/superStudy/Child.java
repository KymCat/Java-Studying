package extendStudy.superStudy;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); // this 생략 가능
        System.out.println("super value = " + super.value); // super는 부모클래스 참조
        this.hello(); // this 생략 가능
        super.hello();// super는 부모클래스 참조
    }
}
