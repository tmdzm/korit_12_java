package ch17_static.singleton.factory;

import lombok.Getter;

public class Samsung {
    //정적 필드
    private static Samsung samsung;//그냥 getInstance()로 써도 return이 똑같아서 상관은 없다.
    @Getter
    private String company;
    private int serialNuber;

    private Samsung(){
        company = getClass().getSimpleName();//어차피 samsung
        serialNuber = 20260000;
        System.out.println("싱글턴 확인용");//핸드폰 생상 시작시 출력
    }
    public static Samsung getInstance(){
        if(samsung == null) samsung = new Samsung();
        return samsung;
    }

    //일반 메소드, 정적아님
    public String createSerialNumber(String model){
        return model + "_" + serialNuber++;
    }
}

/*
    이미 싱글톤을 배운 우리는 어차피 객체가 하나만 생성될걸하는 것을 알 고 있다.
    근데 이 메서드를 호출할때 _++가 적용은 된다.
    모델명+20250000애서 1씩 증가만 한다.
    그결과 시리얼 넘버 중복은 없다.
 */
/*
    정적변수로 시리얼 넘버를 선언하지 않고 일반 필드로 선언한 이유는 , 그냥 객체 하나만 생성된다고 보여주기 위해
    이미 static 개념을 배우고 이해한 수강생들이 떠올ㄹ릴 수 있는 의뭉이므로 이런 질문이 떠오른다면 학습이 올바르게 되고 있는 중
 */