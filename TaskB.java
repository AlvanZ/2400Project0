// Alvan Zhuang
//CS1400
//Assignment 5
//11/14/2021
public class TaskB {
    public static void main(String[] args){
        System.out.println(sum(4));
    }
    public static int sum(int num){
        if(num==1){
            return 1;
        }
        else{
            return num + sum(num-1);
        }
    }
}
