package ch08_classes;

public class Car {
    String color;
    int speed;

    public void drive(){
        System.out.println(color + "색 자동차가 주행중입니다.");
    }

    public void brake(){
        System.out.println(color + "색 자동차가 멈춥니다.");
    }

    public void call(){

    }

    public void displayInfo(){

        System.out.printf("이 차의 색깔은 %s색이고, \n최고속도는 %d km/h입니다.\n",color,speed);

    }

}
