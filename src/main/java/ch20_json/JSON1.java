package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

public class JSON1 {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();
        Map<String ,Integer> jsonMap = new HashMap<>();

        //속성(키 -값 쌍)을 축하는 메서드 -> addProperty()메서드
        jsonObject1.addProperty("username",1);
        jsonObject1.addProperty("passaword",1);
        jsonObject1.addProperty("email",1);
        jsonObject1.addProperty("name","길동");
        jsonObject1.addProperty("score",4.6);


        jsonMap.put("username",1);
        jsonMap.put("passaword",1);
        jsonMap.put("email",1);
        jsonMap.put("name",710);
        jsonMap.put("score",4);


        System.out.println(jsonObject1);
        System.out.println(jsonMap);
        /*
            Map과의 차이
            1. Map에서는 key에 ""가 없었고, Json에서는 모든 key에 String 자료형처럼 보이도록 ""가 있었다.
            2. Map에서는 콘솔창에서 출력될 때 key1=value1으로 '='으로 표기되지만
                JSONM에서는 "key1":value1의 형태로 작석됨
         */

        jsonObject1.addProperty("job","대학생 인턴");
        System.out.println(jsonObject1);
        jsonObject1.addProperty("job","대기업 정규직");
        System.out.println(jsonObject1);//동일한 키라면 갱신
        /*
            컴퓨터에서는 콘솔에 출력한 결과를 확인햇을때, JSON 결과값이 한 줄로 길게 늘어져있습니다.
            그래서 가독성을 개선하는 방법으로 출력하기도 하는데
            사람이 읽기 편한 방식으로 출력하는걸 pretty print라 한다.
         */

        Gson gson = new GsonBuilder().setPrettyPrinting().create();//중괄호 열리는 부분부터 닫히는것까지 전부 스트링이라 크기가 작다.
        String jsonData = gson.toJson(jsonObject1);//jsonObject랑 json은 다르다. toJson으로 바꿔줘야 Json이다.
        System.out.println(jsonData);


    }
}

