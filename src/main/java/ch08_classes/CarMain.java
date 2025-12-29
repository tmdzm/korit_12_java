package ch08_classes;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car yourCar = new Car();

        myCar.color = "빨강";
        myCar.speed = 160;

        yourCar.color = "노랑";
        yourCar.speed = 180;

        myCar.drive();
        yourCar.drive();

        myCar.displayInfo();
        yourCar.displayInfo();
    }
}
//스레드 마렵네