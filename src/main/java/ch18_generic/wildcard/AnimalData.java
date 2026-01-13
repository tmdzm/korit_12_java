package ch18_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AnimalData<T> {
    private T animal;

    public void showData(){
        ((Animal)animal).move();//원랜 T에는 아무 클래스나 들어갈 수 있음으로,
        //원하지 않는 클래스가 들어왔을때 오류를 내기위해 형변환을 선언, 업클래스임에도 불구하고
        if(animal.getClass() == Human.class){//getSimple~~를 받아서 equal로 비교하지 않아도 된다.
            ((Human)animal).read();
        } else if(animal.getClass() == Tiger.class){
            ((Tiger)animal).hunt();
        } else {
            System.out.println("고유메서드가 없거나 Animal의 서브 클래스가 아니다.");
        }
    }

}
/*
    현재 AnimalData의 필드인 animal에 Animal 클래스의 상속을 받은 Tiger, Human객체를 field에 대입할것이다.

    근데 T에는 어떠한 클래스도 들어갈 수 있기 때문에 현재 상황에서는 Car 클래스의 객체도 animal에 들어갈 수 있다고 해석할 수 있다.

    이번 목표는
    특정 클래스라면(즉, Animal 클래스의 상속을 받은 서브 클래스라면)
    해당 클래스에 맞는 객체 정보를 출력하도록 작성할것이다.
 */

