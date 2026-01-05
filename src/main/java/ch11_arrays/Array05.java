package ch11_arrays;

public class Array05 {
    public static void main(String[] args) {
        String[] scores = {"A","B","C","D","F"};

        for(String alpha : scores){
            if(!alpha.equals("F")) System.out.print(" "+alpha+"+ /");
            else System.out.println(" "+alpha);
        }

        for(int i=0;i<scores.length;i++){
            if(!scores[i].equals("F")) System.out.print(" "+scores[i]+"+ /");
            else System.out.print(" "+scores[i]);
        }
    }

    static void addPlus(){

    }
}
