package ch11_arrays;

public class Array09EnhanceFor {//아니 왜 for each문이라 안하는거지
    public static void main(String[] args) {
        String[] names ={"김일","김이","김삼","김사","김오"};

        for(int i=0;i<names.length;i++){
            if(i == names.length-1) System.out.println(names[i]);
            else System.out.print(names[i] +" / ");
        }

        for(String name : names){
            if(name.equals(names[names.length-1])) System.out.println(name);
            else System.out.print(name +" / ");
        }

        for(int i=0;i<names.length;i++) {
            System.out.println((i+1)+"번 : "+names[i]);
        }


        System.out.println("--------");


        int i =0;
        for(String name : names){
            i++;
            System.out.println(i+"번 : "+name);
        }
    }
}
