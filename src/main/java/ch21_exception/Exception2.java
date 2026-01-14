package ch21_exception;

class LoginFailedException extends Exception{
    public LoginFailedException(String message){
        super(message);//받은 메세지를 출력한다는 뜻이 아님, 그리고 프라이빗임
        System.out.println("로그인 시 예외가 발생하였습니다.");//생성자가 생성될 때 호출, 즉 e로 만들어진 시점에서 출력
    }
}

public class Exception2 {
    public static void login(String id, String password) throws LoginFailedException{
        String correctId = "admir";
        String correctPassword = "1q2w3e4r!";
        //if(id != correctId) 옛날방식

        if(!id.equals(correctId)||!password.equals(correctPassword)){
            throw new LoginFailedException("ID 또는 PW가 틀렸습니다.");//throw를 쓰기위해선 throws 명령어가 필요하다
        }
    }

    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword = "1234qwer!!";

        //throws를 달고 있으면 try, catch문을 쓰지 않으면 오류가난다.
        //혹은 main도 method에 해당하니까 main 메서드에 throws를 입력해도 됩니다.
        try {
            login(inputId,inputPassword);
        } catch (LoginFailedException e){
            System.out.println("로그인 실패 : "+e.getMessage());//getter를 통해 출력을 해서 super(message)부분이 출력된다.
        } finally {
            System.out.println("프로그램 정상종료");
        }
    }
}
