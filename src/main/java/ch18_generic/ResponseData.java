package ch18_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseData<T> {
    private String message;
    private T data;
}
/*
    제네릭을 쓸것이라면 class에 추가적인 명령어가 필요하다
    <T>
    이거 빼먹고 field에 T 썻다가 오류나는 사람들 많음
 */