package ch13_abstraction.abstract_classes;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(this.getName()+"에서 ["+model+"]을(를) 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("이전 제품 공장을 관리합니다.");
            }
        };
        factory1.setName("임시공정");
        factory1.produce("모니터");

        PhoneFactory phoneFactory1 = new PhoneFactory();
        phoneFactory1.setName("애플 스마트폰 공장");


        phoneFactory1.produce("아이폰 에어2");
        phoneFactory1.manage();

        phoneFactory1.showInfo();
        /*
            추상클래스는 상속을 전제로 함
            하지만 java 버전언에 따라 익명 클래스를 통해 FactoryMain에서만 임시적으로 쓸 수 있는갳레를 생성하는것도 가능

            그리고 메서드 오버라이딩의 경우 재정의를 전제로 하고 있기 때문에
            부모 클래스와 자식 클래스의 메서드 호출 결과가 다르게 굴러 갈 경우에만 오버라이드가 요구되고
            동일한 경우에는 그냥 부모 클래스의 메서드를 호출
         */
    }
}
/*

 */
