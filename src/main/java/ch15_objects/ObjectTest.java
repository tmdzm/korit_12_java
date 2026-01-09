package ch15_objects;

public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest() {
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo(){
        System.out.println("이름 : "+name+"\n주소 : "+address);
    }

    @Override
    public String toString() {
        return "이름 : " + name + '\n' +
                "주소 : " + address;
    }
}
/*
public String toString() {//알트 인서트로 넣고 super.toString으로 바꿨다.
        return super.toString();//오버라이딩 가능한걸 찾는 단축키가 뭐지
        //이 상태는 저장공간의 물리적 공간을 출력한다.
    }
 */
