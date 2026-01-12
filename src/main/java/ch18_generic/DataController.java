package ch18_generic;

import ch18_generic.bmi.Person;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date();

        ResponseData<String> responseData1 = new ResponseData<>("날짜 저장 성공",now.toString());
        System.out.println(responseData1);//객체지만 @data때문에 출력됨

        ResponseData<Integer> responseData2 = new ResponseData<>("날짜 저장 성공",10);//int는 오류
        System.out.println(responseData2);//객체를 선언하고 초기화한 시점, T에 들어갈 자료형을 명시할 수 있다.
        //double도 가능
        ResponseData<Person> responseData4 = new ResponseData<>("사람 객체 저장 성공",new Person("강사",177,71));
        System.out.println(responseData4);
    }
}
