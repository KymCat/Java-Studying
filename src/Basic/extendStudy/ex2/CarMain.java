package Basic.extendStudy.ex2;


public class CarMain {
    public static void main(String[] args) {
        /*
            Car를 상속받은 electricCar 와 GasCar는 move()를 사용할 수 있다.
            부모는 자식클래스에 접근 불가능
            자식은 부모클래스에 기능을 물려받기때문에 접근 가능
         */
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
