package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;

public class JSON4 {
    public static void main(String[] args) {
        List<String> category1 = new ArrayList<>();
        category1.add("AI");

        Book book1 = new Book(101L, "자바 마스터", "김경식", List.of("프로그래밍","컴퓨터공학"));
        Book book2 = new Book(102L,"gpt의 정석","엮은이",category1);
        //List.of는 오류나던데, 저긴 왜 안나지
        //Arrays.asList는 크기변경이 안된다 즉, add,remove 불가 단, set(수정)은 가능
        //List.of는 다 안됨

        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        String output2 = gsonBuilder.toJson(book1);
        Map<String , Objects> output3Map = gsonBuilder.fromJson(output2,Map.class);
        List<Book> output4Bookcase = new ArrayList<>();
        output4Bookcase.add(book1);
        output4Bookcase.add(book2);

        //2
        System.out.println(output2);

        //3
        System.out.println(output3Map.get("title"));

        //4
        System.out.println(gsonBuilder.toJson(output4Bookcase));
    }
}
