## 상속
객체 지향 프로그래밍의 핵심 요소 중 하나로, 기존 클래스의 필드와 메서드를 새로운 클래스에서
재사용하게 해준다. 기존 클래스의 속성과 기능을 그대로 물려받는 것이고 `extends` 키워드를 사용한다.
그리고 `extends` 대상은 하나만 선택 할 수 있다.

- 부모 클래스(슈퍼 클래스) : 상속을 통해 자신의 필드와 메서드를 다른 클래스에 제공하는 클래스
- 자식 클래스(서브 클래스) : 부모 클래스로부터 필드와 메서드를 상속받는 클래스

##
### 상속의 필요성
```java
public class ElectricCar {
    public void move() {
        System.out.println("차를 이동합니다");
    }

    public void charge() {
        System.out.println("충전합니다");
    }
}
```
```java
public class GasCar {

    public void move() {
        System.out.println("차를 이동합니다");
    }

    public void fillUp() {
        System.out.println("기름을 주유합니다");
    }
}
```
- 전기차와 가솔린차는 자동차의 구체적인 개념
- 자동차는 전기차와 가솔린차를 포함하는 추상적인 개념
- 공통기능 move()
- 주유 방식만 다를뿐 이동방식은 같음
- 상속으로 공통된 기능은 부모에게 물려받고 다른 기능은 각자 구현

##
### 상속 관계
```java
public class Car {

    public void move() {
        System.out.println("차를 이동합니다.");
    }
}
```
```java
public class ElectricCar extends Car{

    public void charge() {
        System.out.println("충전합니다");
    }
}
```
```java
public class GasCar extends Car{

    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }
}
```
- `extends` 키워드를 통해 Car 클래스를 상속받음
  - 부모 클래스 : Car
  - 자식 클래스 : ElectricCar, GasCar
- Car클래스의 move()를 자식클래스(전기차, 가솔린차)들이 사용가능
- 자식클래스는 부모클래스 접근 가능
- 부모클래스는 자식클래스 접근 불가능

##
### 상속과 메모리 구조
```java
ElectricCar electricCar = new ElectricCar();
```
<img width="701" height="197" alt="Image" src="https://github.com/user-attachments/assets/4061f103-8661-4de9-acd1-f7d81d1a08e8" />  

- `new ElectricCar()` 호출시 상속관계인 Car 클래스 또한 인스턴스 생성
- 참조값은 하나지만 그 안은 Car, ElecrtricCar 두가지 클래스 정보 공존

#### `electricCar.charge()` 호출
<img width="679" height="180" alt="Image" src="https://github.com/user-attachments/assets/9b055e9d-5497-4c98-916d-aa0f488cf223" />

- 호출하는 변수의 타입을 기준으로 클래스 선택
- `electricCar`의 클래스는 ElectricCar 이므로 ElectricCar 를 통해서 `charge()`를 찾음

#### `electricCar.move()` 호출
<img width="677" height="155" alt="Image" src="https://github.com/user-attachments/assets/6a77fe57-c842-4b32-88b1-7c0687edf750" />

- 호출하는 변수의 타입을 기준으로 클래스 선택
- `electricCar`를 선택하여 `move()`를 검색
- `move()`가 없으면 상속 관계어서는 부모타입으로 올라가 검색
- 부모 클래스 Car 에는 move()가 있으므로 `move()`를 호출

##
### 메서드 오버라이딩
```java
public class ElectricCar extends Car {

    // Car 클래스의 move()를 재정의
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다");
    }
}
```
- Car 클래스의 `move()`를 ElectricCar 클래스에서 재정의
- 어노테이션 `@Override`는 옵션이지만 사용하길 권장
- 어노테이션을 사용하면 실수를 방지

#### 오버라이딩과 메모리 구조
<img width="694" height="185" alt="Image" src="https://github.com/user-attachments/assets/f8b9512b-9d55-469d-afde-c0fa64b63264" />

- `electricCar.move()`를 호출
- 호출한 `electricCar`의 타입은 ElectricCar 이므로 `move()`를 ElectricCar 에서 검색
- ElectricCar 에 `move()`가 존재하므로 해당 메서드를 실행, 부모 타입을 찾지 않음

#### 메서드 오버라이딩 조건
- 메서드 이름 동일
- 메서드 매개변수 모두 동일
- 반환 타입 동일
- 접근제어자는 상위 클래스의 메서드 보다 더 제한적이면 안됨
  - 부모가 `protected`면 자식은 `protected` 혹은 `public` 
- 예외는 상위클래스의 메서드보다 더 많은 체크 예외를 `throws`로 선언 안됨
- `static`, `final`, `private` 키워드가 붙은 메서드는 오버라이딩 안됨
- 생성자 오버라이딩 안됨

##
### 상속 접근지정자
- default : 같은 패키지면 접근 가능
- public : 접근가능
- protected : 같은 패캐지 or 자식 접근 가능
- private : 접근 불가능

##
### super 
```java
public class Parent {
    public String value = "parent";

    public void hello() {
        System.out.println("Parent.hello");
    }
}
```
```java
public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }
}
```
- 부모, 자식 클래스에 같은 이름의 변수와 오버라이딩된 메서드가 존재
- 자식 클래스에서 부모의 필드, 메서드에 접근하고싶으면 `super`와 `.`을 활용
  - `super.hello()`
  - `super.value`

#### super.생성자
```java
public class Root {

    public Root() {
        System.out.println("Root 생성자");
    }
}
```
```java
public class Level1 extends Root{
    
    public Level1(int a) {
        super(); // 생략가능
        System.out.println("Level1 생성자 a = " + a);
    }

    public Level1(int a, int b) {
        super(); // 생략가능
        System.out.println("Level1 생성자 a = " + a + " b = " + b);
    }
}
```
- 부모의 생성자 기본 생성자
- 자식 생성자의 첫줄에는 반드시 `super()`로 부모 생성자를 반드시 호출
  - 부모 생성자가 기본 생성자면 생략가능
- `this()`를 사용해도 마지막에 한번은 `super()`로 부모 생성자를 반드시 호출
