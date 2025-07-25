package extendStudy.superStudy;

public class superMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.call();

        /*
         출력
            this value = child
            super value = parent
            Child.hello
            Parent.hello
         */
    }
}
