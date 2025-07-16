## 클래스
### 클래스란 ?
int, String 과 같이 사용자가 직접 만들 수 있는 타입의 설계도로 클래스를 사용해서
실제 메모리에 만들어진 실체를 `객체` 혹은 `인스턴스`라고 한다.

##
### 멤버변수와 필드
````java
public class Student {
    // 멤버변수 or 필드
    String name;
    int age;
    int grade;
}
````
- 자바에서 멤버변수, 필드는 같은 뜻
- 특정 클래스에 소속된 멤버이기 떄문에 `멤버변수`
- 데이터 항목을 가리키는 전통적 용어인 `필드`

##
### 객체 생성
```java
Student s1 = new Student();
```
- 객체를 사용하기 위해서는 클래스 기반 인스턴스를 생성 필요
- `new Student()` : Student 클래스 정보를 기반으로 새로운 객체를 생성하라는 뜻
- 메모리에 실제 Student 인스턴스(객체)를 생성
- 메모리 공간을 확보할 때 멤버 변수의 메모리 공간도 함께 확보

##
### 참조값
```java
Student student1 = new Student(); //1. Student 객체 생성
Student student1 = x001; //2. new Student()의 결과로 x001 참조값 반환
student1 = x001; //3. 최종 결과
```
- `new` 키워드를 통해 객체가 생성된 후, 참조값 반환
- `Student student1`이 객체의 참조값(x001)을 보관
- `Student student1` 변수는 메모리에 존재하는 실제 Student 객체(인스턴스) 접근 가능

##
### 멤버변수 접근
```java
//객체 값 대입
student1.name = "학생1";
student1.age = 15;
student1.grade = 90;

 //객체 값 사용
System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + 
student1.grade);
```
- 먼저 메모리에 있는 객체에 접근해야함
- 객체에 접근하기 위해서는 `.`(dot)을 사용

##
### 객체 배열에 대한 이해
```java
Student[] students = new Student[2];
```
```
[students] → (주소 005)
             ┌────────────┐
             │ null       │ 
             │ null       │
             └────────────┘
```
- 객체 배열 또는 클래스 배열
- 객체 배열 선언시 주소가 할당
- 배열 내부에 객체 할당을 해주지 않았기에 null이 저장

```java
students[0] = new Student();
students[1] = new Student();
```
```
[students] → (주소 X)
             ┌────────────┐
             │ [0] → 주소 A (Student 인스턴스 1)
             │ [1] → 주소 B (Student 인스턴스 2)
             └────────────┘
```
- 배열 원소에 객체 할당을 해주어야 nullPointerException 에러 없음