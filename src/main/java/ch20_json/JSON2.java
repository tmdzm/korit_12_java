package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@ToString
class User{
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;

}

public class JSON2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        //하나는 한 줄 출력/ 하나는 pretty printing 버전
        User user1 = new User("kim1","9876","a@test.com","김일","20");
        //JsonObject가 아니어도 된다.
        String jsonData1 = gson.toJson(user1);//json은 전부 String이라 이런 대입이 가능한듯? 하다
        String what2 = gsonBuilder.toJson(user1);
        System.out.println(jsonData1);//한줄
        System.out.println(what2);//예쁘게 나옴, 키밸류 쌍마다 줄바꿈이 일어남
        /*
            Map 자료형 -> json 데이터로 바꾸는것도 가능
         */

        Map<String ,String> productMap1 = new HashMap<>();
        productMap1.put("productCode","MYWY3KH/A");
        productMap1.put("productName","아이폰 16 프로 맥스");

        String jsonProduct = gson.toJson(productMap1);

        System.out.println(gson.toJson(productMap1));
        System.out.println(gsonBuilder.toJson(productMap1));
        /*
            이상의 두 사례에서 toJson()이라는 메서드는 argument로 Java Object 자체를 넣는것도.
            Map으로 생성된 entry를 Json형태로 바꾸는것도 가능하다. Json Object도 마찬가지로 가능

            그러면 json->Map/java Object는 가능할까?

            json은 아까보니 Sting-double, String-String 자기 마음대로 묶을 수 있던데
            Map은<>로 정해져 있어서, 몇개는 안될것 같은데

         */

        //from- 즉 Json인 걸 불러서 쓴다는 뜻
        User user2 = gsonBuilder.fromJson(what2, User.class);//class 자료형으로 넣어야해서 .class
        System.out.println(user2);
        Map<String,String> productMap2 = gson.fromJson(jsonProduct, Map.class);
        System.out.println(productMap2);

        /*
            jsonProduct1/2는 Java Object로 못 바꾼다. -> 클래스가 아직 정의 되지 않아서
            그러면 jsonData1을 Map 자료형의 userMap1으로 변경후 출력해보자
         */
        Map<String,String> userMap1 = gson.fromJson(jsonData1, Map.class);//아까 빨간불 나오지 않았나
        System.out.println(userMap1);

        List<User> users = new ArrayList<>();
        users.add(user1);
        System.out.println(users);
        String jsonUsers = gsonBuilder.toJson(users);
        System.out.println(jsonUsers);
    }
}
