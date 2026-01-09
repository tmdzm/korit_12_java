package ch16_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user = new UserEntity(1,1234,"honggildong@gamil.com","길동");
        UserEntityLombok userL = new UserEntityLombok(2,3456,"illumi@gamil.com","일나리");
        UserEntityLombok userR = new UserEntityLombok();

        System.out.println(user);
        System.out.println(userL);

        userR.setPassword(1234);
    }
}
