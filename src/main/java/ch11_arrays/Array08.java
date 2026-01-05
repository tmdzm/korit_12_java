package ch11_arrays;
/*
    향상된 for문(enhanced for loop)

    for문은 원래 index 넘버를 명확하게 알고 있어야 하지만, 일일히 element의 숫자를 새는것은 번거롭다.
    즉, for each 문,
    for(int x : 배열) 같은 형식으로 읽기만 가능하고 쓰기는 불가능, 배열안에 뭘 넣는게 안된다는 걸까
 */
public class Array08 {
    public static void main(String[] args) {
        int[] nums = new int[200];
        String[] names ={"김일","김이","김삼","김사","김오"};

        for(int i =0;i<nums.length;i++){
            nums[i] = i+1;
        }

        for(int i : nums){
            System.out.println(nums[i-1]);
        }

        for(int i=0;i<names.length;i++){
            if(i == names.length-1) System.out.println(names[i]);
            else System.out.print(names[i] +" / ");
        }

        for(String name : names){
            if(name.equals(names[names.length-1])) System.out.println(name);
            else System.out.print(name +" / ");
        }
    }
}
