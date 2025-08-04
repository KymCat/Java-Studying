package Basic.poly.basic;

// instanceof
public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 call");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 call");
        call(parent2);

        Child child = new Child();
        System.out.println("child call");
        call(child);
    }
    private static void call(Parent parent) {
        parent.parentMethod();

        // 인스턴스가 Child 면
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스");
            ((Child) parent).childMethod();
        }
    }
}
