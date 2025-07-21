## 생성자
### this
```java
public class Member {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        ...
   }
}
```
- `initMember` 메서드에서 멤버변수의 값을 초기화
- 하지만 `initMember` 매개변수와 `Member` 클래스의 멤버변수의 이름이 같음
- `this` 키워드를 사용해서 멤버변수와 매개변수를 구분
  
```java
void initMember(String name, int age, int grade) {
    this.age = age;
    this.name = name;
    this.grade = grade;
}
```
- `this`키워드가 사용된 변수는 클래스의 멤버변수
- `=` 뒤에 있는 변수는 메서드의 매개변수

##
### 생성자
객체를 생성하고 바로 초기값을 할당해야 하는 경우가 많다. 앞의 `initMember`와 같은 메서드를
매번 만들어야한다. 하지만 대부분의 객체 지향 언어는 객체를 생성하자마자 즉시 필요한 기능을 좀 더
편리하게 수행할 수 있도록 `생성자`라는 기능을 제공한다.
  
  
```java
public class Member {
    String name;
    int age;
    int grade;
    
    // 생성자
    Member(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
```
- 생성자의 이름은 클래스 이름과 같아야 함
- 생성자는 반환 타입이 없음

##
### 생성자 호출
생성자는 인스턴스를 생성하고 즉시 호출된다. 생성자를 호출하는 방법은 `new` 명령어 다음에
생성자 이름과 매개변수에 맞추어 인수를 전달하면 된다.
```java
new 생성자이름(매개변수 목록);
new 클래스이름(매개변수 목록);
```
#### 생성자 장점
- 중복 호출 제거
- 생성자 호출 필수 제약
    - 객체 null 방지
    - 필수값 입력 보장

##
### 기본 생성자
```java
public class Member {
    String name;
    int age;
    int grade;
    
    Member() { // 기본 생성자
    }
}
```
- 매개변수가 없는 생성자를 기본 생성자
- 클래스에 생성자가 하나도 없으면 자바 컴파일러에서 기본 생성자 자동 생성
- 생성자가 하나라도 있으면 자바는 기본 생성자를 생성하지 않음

##
### 오버로딩
`오버로딩`은 자바의 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메소드가 있더라도
매개변수의 개수 또는 타입이 다르면 같은 이름을 사용해서 메소드를 정의 가능하다.
```java
public class Member {
    String name;
    int age;
    int grade;
    
    // 생성자 1
    Member(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 생성자 2 (오버로딩)
    Member(String name, int age) {
        this(name, age, 50);
    }
}
```
- `생성자1`과 `생성자2`는 이름이 같은 생성자
- 매개변수 개수가 다르므로 둘은 오버로딩 관계
- 참고로 리턴값만 다른것은 오버로딩 불가능

#### 호출
```java
Member m1 = new Member("Minsu", 10, 85);
Member m2 = new Member("James", 12);
```
##
### this() 사용
```java
// 생성자 1
Member(String name, int age, int grade) {
    this.name = name;
    this.age = age;
    this.grade = grade;
}

// 생성자 2 (오버로딩)
Member(String name, int age) {
    this(name, age, 50); // Member(String name, int age, int grade) 호출
}
```
- 블럭의 첫줄에만 작성 가능
- 생성자 내부에서 생성자를 호출하는 기능
- 중복되는 `this`의 코드들을 방지