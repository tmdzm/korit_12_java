package ch17_static.singleton.factory;

import lombok.AllArgsConstructor;

public class Factory {
    private String factoryName;

    public Factory(String factoryName) {
        this.factoryName = factoryName;
        System.out.println(factoryName+" 건설 완료");
    }

    public SmartPhone produceSmartPhone(){
        System.out.println(factoryName+"에서 스마트폰을 생산합니다.");
        String model = "갤럭시s27";
        String serial;
        //지역 변수로 삼성객체 생성
        //그럼 계속 prodiceSmartPhone()을 호출하더라도 이하의 객체가 계속 대입
        Samsung samsung = Samsung.getInstance();
        serial = samsung.createSerialNumber(model);

        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(),model,serial);
        return smartPhone;
    }
}
