package ch17_static.singleton.product;

public class ProductView {
    //보통 싱글톤 패턴 정적변수 이름이 instnace
    private static ProductView instance;//정적 변수 선언
    public static int count = 1;//확인용

    private ProductView(){
        int cnt = 1;
        System.out.println(cnt + " 번 째 객체가 생성되었습니다.");
        cnt++;
        System.out.println("정적 변수를 참조하는 "+count+" 번 째 객체가 생성되었습니다.");
        count++;
    }

    public static ProductView getInstance(){
        if(instance == null){
            instance = new ProductView();//10번 호츌하든 , 100번 호출 하든 1번?
        }
        return instance;//
    }
}
