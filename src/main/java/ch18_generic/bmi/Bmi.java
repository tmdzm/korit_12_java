package ch18_generic.bmi;

public class Bmi {

    private double calcBmi(Person person){
        return person.weight/((person.height*0.01)*(person.height*0.01));
    }

    public void printResult(Person person){
        double bmi = calcBmi(person);
        String bmiStr = String.format("%.1f", bmi);
        System.out.print(person.name+"님의 키는 "+person.height+"cm 몸무게는 "+person.weight+"kg로 bmi는 지수는 "+bmiStr+"으로 ");
        if(bmi >= 35) System.out.println("3단계 비만입니다.");
        else if(bmi >= 30) System.out.println("2단계 비만입니다.");
        else if(bmi >= 25) System.out.println("1단계 비만입니다.");
        else if(bmi >= 23) System.out.println("비만전단계 입니다.");
        else if(bmi >= 18.5) System.out.println("정상 입니다.");
        else System.out.println("저체중 입니다.");
    }

}
