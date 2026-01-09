package ch17_static;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Prodcut {

    private String name;//인스턴스가 생성될때 초기화 null로
    private int instanceCnt = 0;
    //정적 변수 선언
    //@Setter
    //@Getter//정적변수는 각각 getter를 붙여야하는듯>
    private static int cnt = 0;//int 정적변수는 안된다, 왜? 롬복 너무 허접한데
    @Getter
    private final static String title = "제품입니다.";

    public Prodcut(){
        System.out.println("Product 클래스의 객체가 생성됨");
        instanceCnt++;
        cnt++;
    }

    public static void setCnt(int cnt) {
        Prodcut.cnt = cnt;
    }

    public static int getCnt() {
        return cnt;
    }

    public void increaseInstanceCnt(){
        System.out.println("현재 : "+getInstanceCnt()+" 에서 "+(++instanceCnt)+"로 증가하였다.");
    }
}
