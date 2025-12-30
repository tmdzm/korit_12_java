package ch09_getter_setter;

public class Person {
    String name;
    int age;
    String address;

    public Person() {
    }

    //이름 매개변수 생성자

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 4) System.out.println("변경할 수 없습니다.");
        else {
            System.out.println("변경되었습니다.");
            System.out.println("변경전 : "+this.name);
            this.name = name;
            System.out.println("변경후 : "+name);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("그건 불가능한 나이요");

        }
        else this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}

/*
class Solution {
2
    public int solution(int n, int w, int num) {
3
        int answer = 0;
4
        int r = n/w;//단의 갯수
5
        int whenBox = 0;
6
        boolean oddEven = false;
7
        boolean IgotBox = false;
8
        //자기 머리위의 단이 몇개인지가 중요하잖아?
9
        //while로 몇번째 단에 num이 있는지 찾고, 공식으로 몇개까지 단이 있는지 확인한다면
10
        for(int i = 0;i<r;i++){
11
            if(oddEven == false){
12
                oddEven = true;
13
                for(int j = 1+2w*i;j<=w+2w*i;j++){
14
                    if(j==num) gotBox = true;
15
                    if(j==n) break;
16
                }
17
                if(IgotBox==true) answer++;
18
            } else {
19
                oddEven = false;
20
                if(n<2w*i){
21

22
                }
23
                for(int j = 2w*i;j>w*i+1;j--){//아, 딱 나눠 떨어지지 않으면 안된다. w로 나눠 나머지가 나오면...
24
                    if(j==num){
25
                        IgotBox = true;
26
                    }
27
            }   if(IgotBox ==true)answer++;
28

29
        }
30

31
        return answer;
32
    }
33
}
34
//배열을 쓰는 문제인가?
35
//반복은 1~w까지, 2차원 배열로 하면 되나?
36
//1 -> 2w -> 2w + 1 -> 4w 형태로 왼쪽이 올라가며, 홀수층이면 ++, 짝수면 --
37
//위 아래가 좀 규치적으로 차이가 나는것 같긴한데 1,3,5~
38
//왼쪽에서 오른쪽으로 2n-2^i만큼 차이가 나는듯, 홀짝에 따라 오른쪽에서 왼쪽으로 가기도 한다.
39
//배열을 안쓰고도 풀 수 있을것 같은데
40
//총갯수 n과 찾아야할 num만 안다면, 공식을 이용한 해결이 가능할듯
 */