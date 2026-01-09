package ch16_bean;

import lombok.Getter;

@Getter//getter가 만들어짐,Lombok
public class UserEntity {
    private int username;
    private int password;
    private String email;
    private String name;

    public UserEntity(int username, int password, String email, String name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "username : " + username + '\n'
                + "email : " + email + '\n'
                + "name : " + name + '\n'
                + "비밀번호는 안알랴줌"+ '\n';
    }
}
//명사면 엔티티다?