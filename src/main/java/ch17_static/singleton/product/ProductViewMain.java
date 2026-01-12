package ch17_static.singleton.product;

public class ProductViewMain {
    public static void main(String[] args) {
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();//getInstance는 ProductView의 자료형
        ProductView.getInstance();//아무리 생성해도 1번만 동작한다

        //ProductView productView1 = new ProductView();프라이빗이라 불가능

        System.out.println(ProductView.count);
        System.out.println(ProductView.getInstance().toString());
        /*
            이상의 코드에서 다양하게 검증했을 때 알 수 있는 점은
            getInstance() 메서드는 생성자를 호출하는 method이기 때문에 기본적으로는 호출 횟수만큼 객체가 생성되어야 한다.
            하지만 내부에 조건문을 통해 하나의 객체라도 생성되어있다면 해당 객체를 return하게끔 작성되었기 때문에
            결과적으로 생성자가 호출되는 횟수는 1로 고정
         */
    }
}
