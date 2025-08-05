## 다형성
### 다형적 참조
```java
public class Parent {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
```
```java
public class Child extends Parent {

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
```
```java
Parent poly = new Child();
Child poly2 = new Parent(); // 컴파일 오류
```
- Java 에서는 부모 타입이 자식 타입을 담을 수 있음
- 반대로는 불가능
- `poly`는 `Parent` 타입이므로 `Parent` 클래스 안에서 기능을 검색
- 상속 관계에서 자식 방향으로 찾아 내려갈 수 없음
- 따라서 `poly`는 `childMethod()`를 찾을 수 없음
- `childMethod()`를 호출 하고 싶으면 캐스팅이 필요

#### 다운 캐스팅
```java
Parent poly = new Child();
Child child = (Child) poly; // 다운 캐스팅
child.childMethod();
```
- `poly`를 `Child` 타입으로 다운 캐스팅
- `child`는 `poly`의 참조값을 저장
- `poly` 자체가 `Child` 타입으로 바뀌는 것이 아님

##
### 업 캐스팅 vs 다운 캐스팅
```java
// 업 캐스팅
Parent parent = child;

// 다운 캐스팅
Child child = (Child) parent;
```
- 업 캐스팅은 타입 생략 가능
- 다운 캐스팅은 타입 생략 불가능

#### 다운 캐스팅 주의점
```java
Parent parent2 = new Parent();
Child child2 = (Child) parent2; // ClassCastException 오류
child2.childMethod();
```
- `parent2`는 `Parent` 타입이며 `new Parent`로 메모리 할당
- `Child`타입으로 다운 캐스팅 하였지만 오류 발생
- `parent2`는 `Parent`로 메모리가 할당 되었으므로 `Child`가 존재하지 않음
-  따라서 `childMethod()` 검색 불가능

##
### instanceof
어떤 인스턴스를 참조하고 있는지 확인해주는 키워드
```java
Parent parent1 = new Parent();
Parent parent2 = new Child();
```
`parent1`과 `parent2`는 각각 `Parent`도 참조 할 수 있고
`Child`도 참조 할 수 있으므로 인스턴스의 타입을 확인하고 싶다면
`instanceof`키워드를 사용하면 된다.

```java
private static void call(Parent parent) {
    parent.parentMethod();

    // 인스턴스가 Child 면
    if (parent instanceof Child) {
        System.out.println("Child 인스턴스");
        ((Child) parent).childMethod();
    }
}
```

##
### 메소드 오버라이딩
상속관계에서 오버라이딩 된 메서드는 항상 우선권을 가진다. 오버라이딩은 부모 타입에서
정의한 기능을 자식 타입에서 재정의하는 것이다. 손자에게도 같은 메서드를 오버라이딩을 할 경우에도
손자의 오버라이딩 된 메서드가 우선권을 가진다. 즉 가장 하위에 있는 자식의 오버라이딩 메서드가 우선권을 가진다.

```java
public class Parent {
    public String value = "parent";

    public void method() {
        System.out.println("Parent.method\n");
    }
}
```
```java
public class Child extends Parent {
    public String value = "child";

    @Override
    public void method() {
        System.out.println("Child.method\n");
    }
}
```
```java
Parent poly = new Child();
System.out.println("Parent -> Child");
System.out.println("value = " + poly.value);
poly.method(); // 메소드 오버라이딩이 우선권
```
- `poly`는 `Parent`타입
- `value`는 parent가 출력
- 하지만 `method()`는 우선권이 있는 `Child`의 `method()`가 호출

##
### 추상
#### 추상클래스
```java
abstract class Animal {...}
```
- 추상적인 개념을 제공하는 클래스
- 실체인 인스턴스를 생성할 수 없음
- 상속을 목적, 부모 클래스 역할을 담당
- 추상 클래스 선언시 `abstract` 키워드 사용
- 클래스 내 추상 메서드 존재시 무조건 추상 클래스로 선언

#### 추상 메서드
```java
 public abstract void sound();
```
- 자식 클래스에서 반드시 오버라이딩 해야하는 메서드
- 추상 메서드 선언시 `abstract` 키워드 사용

#### 순수 추상 클래스
모든 메서드가 추상 메서드인 클래스, 따라서 상속된 자식 클래스에서
모든 메서드를 구현해야한다. 따라서 순수 추상 클래스는 규격을 나타내며
Java 에서 순수 추상 클래스를 더 편리하게 사용할 수 있도록 `인터페이스`라는 개념을 제공한다.

##
### 인터페이스
Java는 순수 추상 클래스를 더 편리하게 사용 할 수 있는 인터페이스 라는 기능을 제공
```java
// 순수 추상 클래스
 public abstract class Animal {
    public abstract void sound();
    public abstract void move();
 }
```
```java
 public interface Animal {
    void sound();
    void move();
 }
```
- 인터페이스의 메서드는 모두 `public`, `abstract`
- 메서드에 `public abstract`를 생략 가능(권장)
- 인터페이스는 다중 구현(다중 상속) 지원
- 인터페이스의 멤버 변수는 `public`, `static`, `fianl` 이 모두 포함(생략 권장)

#### 상속 vs 구현
```java
 public class Caw implements InterfaceAnimal {...}
```
부모 클래스의 기능을 자식에게 상속할 때, 클래스는 상속 받는다고 표현하지만, 
인터페이스의 기능을 자식에게 상속할 때, 인터페이스를 구현한다고 표현한다. 표현의 차이는
목적의 차이 때문에 발생한다. 상속은 부모의 기능을 그대로 물려받는 것이 목적이고, 인터페이스는
정의한 모든 메서드를 자식이 오버라이딩 해서 기능을 구현해야한다는 목적이 있다. 따라서 구현한다고 표현한다.

인터페이스는 메서드 이름만 있는 설계도 이며, 실제 어떻게 작동하는지는 하위 클래스에서 모두 구현해야 한다.

#### 다중 구현
상속에서는 다중 상속을 지원하지 않는다. 부모가 여러명일 때 자식에서 상속받은 메서드 이름이
모든 부모에게 있다면 어떤 부모의 메서드를 사용해야 할지 모르는 다이아몬드 문제가 발생한다.
하지만 인터페이스는 모든 기능을 자식에서 구현해야하므로 이러한 다이아몬드 문제에서는 자유롭다.
따라서 인터페이스에서는 다중 구현을 허용한다.