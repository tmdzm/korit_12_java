package ch10_access_modifier;

class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 4) {
            System.out.println("글자수가 4자리를 초과했습니다.");
            return;
        }
        this.name = name;
        System.out.printf("이름이 %s 로 설정되었습니다.\n",name);//또는 this.name
    }
}
/*
    필드를 프라이빗 접근 제어자/지정자/제한자로(access modifier) 사용하면
    앞으로는 setter / getter로만 접근 가능하다.
    정보를 안전히 지키기 위해서.
    전에도 말했지만 프라이빗은 같은 클래스내에선 접근 가능하다.
    setter getter는 디폴트가 퍼블릭이고
    그래서 프라이빗을 같은 클래스인 setter/getter가 접근하고 public으로
 */


public class PersonMain {
    public static void main(String[] args) {

        Person person1 = new Person();

        person1.setName("김일");
        person1.setName("브레드피트");
        person1.setName("이일");

        System.out.println("현재 이름 : "+person1.getName());

    }

}
