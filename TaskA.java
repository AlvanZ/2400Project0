// Alvan Zhuang
//CS1400
//Assignment 5
//11/14/2021
public class TaskA {
    public static void main(String[] args){
        int[] test = {0, 2, 6, 4, 3, 3, 2, 0, 3, 6, 0, 7, 3}; 
        System.out.println(numberCount(test, 4, 0));
    }

    public static int numberCount(int[] arr, int number, int index){
        int wanted = number;
        int start = index ;
        if(arr.length-index == 1){
            if(arr[index] == number){
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            if(arr[index]==wanted){
            return 1+ numberCount(arr, wanted, start+1);
            }
            else {
                return numberCount(arr, wanted, start+1);
            }
        }
        }
}
