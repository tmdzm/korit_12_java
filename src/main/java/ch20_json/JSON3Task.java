package ch20_json;
// bookId(Long), title(String), author(String), categories(List)

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.*;

@AllArgsConstructor
@Data//toString이 포함되어있다.
class Book{
    private Long bookId;
    private String title;
    private String author;
    private List<String> categories;//배열이 아니고 리스트라 좀 골때리네
}//Arrays.asList("프로그래밍","컴퓨터공학") List처럼 만들어서 넣기
//그냥 밖에 리스트를 만들어서 넣는것도 방법

public class JSON3Task {
    public static void main(String[] args) {
        List<String> category1 = new ArrayList<>();
        category1.add("AI");

        Book book1 = new Book(101L, "자바 마스터", "김경식", Arrays.asList("프로그래밍","컴퓨터공학"));
        Book book2 = new Book(102L,"gpt의 정석","엮은이",category1);

        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        String prettyString = gsonBuilder.toJson(book1);
        Map<String , Objects> taskMap = gsonBuilder.fromJson(prettyString,Map.class);
        List<Book> bookcase = new ArrayList<>();
        bookcase.add(book1);
        bookcase.add(book2);

        //2
        System.out.println(prettyString);

        //3
        System.out.println(taskMap.get("title"));

        //4
        //gsonBuilder.toJson(bookcase);
        System.out.println(gsonBuilder.toJson(bookcase));
    }
}
