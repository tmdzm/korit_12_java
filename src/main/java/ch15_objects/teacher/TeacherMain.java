package ch15_objects.teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("안근수", "해운대고등");

        teacher1.setName("안근수");
        teacher1.setSchool("해우대고등");
        System.out.println(teacher1);
        System.out.println(teacher2);

        boolean result = teacher1.equals(teacher2);
        System.out.println(result);//당장은 false, 재정의를 통해 true로 바꿀수도 있다.
        //주소지로 같은지를 판단했기 때문

        Class tClass = teacher1.getClass(); // 지난 시간에 했습니다.
        System.out.println(tClass); // 결과값 : class ch15_objects.teachers.Teacher
        System.out.println(tClass.getSimpleName()); // 결과값 : Teacher
        System.out.println(teacher1.getClass().getSimpleName());
        // 여러분들은 어느 수준까지는 그냥 작성할지, 아니면 너무 기니까 어느 부분은 잘라서
        // 변수에 대입할지 여러분 자체 성향 / 조직 성향에 따라 결정하셔야 합니다.

        Field[] fields = tClass.getDeclaredFields();
        // 배열이네요, 그러면
        System.out.println(fields); // 주소값만 나오겠네요.
        // 두 가지 방법으로 field를 확인할 수 있을 것 같습니다.
        // 1. 반복문 사용 / 2. Arrays를 사용하는 방법.
        System.out.println(Arrays.toString(fields));
        for (int i = 0; i < fields.length; i++) {
            System.out.println("필드명 출력 : " + fields[i].getName());
            System.out.println("패키지 명 + 클래스 명 출력: " + fields[i].getType());
            System.out.println("클래스 명 출력 : " + fields[i].getType().getSimpleName() + "\n");
        }
        // 이상에서 클래스 명에서 주의할 것은 Teacher라는 원본의 자료형이 아니라 field의 자료형을 의미합니다.

        for (Field field : fields) {
            System.out.println("필드명 출력 : " + field.getName());
            System.out.println("패키지 명 + 클래스 명 출력 : " + field.getType());
            System.out.println("클래스 명 출력 : " + field.getType().getSimpleName());
        }

        Method[] methods = tClass.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));
        for (Method method : methods) {
            System.out.println("메서드 명 출력 : " + method.getName());
            System.out.println("리턴 타입 출력 : " + method.getReturnType());
            System.out.println();
        }

        // 새로운 객체 만들겠습니다.
        ch15_objects.teacher.Teacher teacher3 = new ch15_objects.teacher.Teacher("안근수", "코리아아이티");

        boolean result2 = teacher1.equals(teacher3);
        System.out.println(result2);    // 결과값 : false

        /*
            teacher3의 자료형은 ch15_objects.Teacher이지
            ch15_obejcts.teachers.Teacher가 아니기 때문에 내부에 동일한 값이 들어가 있다고 하더라도
            false라는 결과값을 가지게 됩니다.


            ch16_bean 패키지 생성 -> UserEntity / UserEntityMain
         */
    }
}
