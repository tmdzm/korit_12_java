package ch13_abstraction.abstract_classes;

public class TabletFactory extends Factory{

    public void upgrade(String model){
        System.out.println(model + "로 업그레이드 합니다.");
    }

    @Override
    public void produce(String model) {
        System.out.println(model+"컴퓨터를 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("컴퓨터 공장을 관리합니다.");
    }
}
