package ch10_access_modifier;
// 이하의 클래스는 default가 생략되어 있을 수 도
class  AccessModifierExample{
    //field 선언
    public int publioVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public int getPrivateVar() {//퍼블릭은 어디서나 접근가능
        return privateVar;//프라이빗은 같은 클래스내에선 접근 가능하다 -> 리턴이 가능하다
    }//필드의 이름을 직접 노출하지 않는다는 '보안'상의 이점이 있다.
}


public class Main {//main은 public클래스 여야 한다.또한 public 클래스의 이름은 파일명과 같아야 한다.
    public static void main(String[] args) {
        //default 생성
        AccessModifierExample example = new AccessModifierExample();//private class라면 이렇게 생성 할 수 없다.
        System.out.println(example.defaultVar);
        System.out.println(example.protectedVar);
        System.out.println(example.publioVar);
        //System.out.println(example.privateVar); 필드의 직접 조회 불가능

        System.out.println(example.getPrivateVar());
    }
}
