package ch16_bean;

import lombok.*;

@RequiredArgsConstructor
@Getter

@ToString

@NoArgsConstructor
@AllArgsConstructor
public class UserEntityLombok {
    private int username;
    @Setter//password만 set이 가능, class 밖에 둬야 전부가능하다
    private int password;
    @NonNull
    private String email;
    @NonNull
    private String name;
    //final 인 필드가 있는경우, 반드시 초기화가 되어야 하기때문에 NoArgs~를 쓸 수 없다.
    //NomNull의 역할은? 뭐지
}
