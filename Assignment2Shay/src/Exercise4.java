import java.util.Arrays;
public class Exercise4 {
    public static void main(String[] args) {

    }


    public static int[] noDuplicate(int[] arr){
        int numberOfDeletedNumbers = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == Integer.MIN_VALUE){
                continue;
            }
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[j] = Integer.MIN_VALUE;
                    numberOfDeletedNumbers++;
                }
            }
        }
        int[] nonDuplicateArray = new int[arr.length - numberOfDeletedNumbers];
        int nonDuplicateArrayIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != Integer.MIN_VALUE){
                nonDuplicateArray[nonDuplicateArrayIndex] = arr[i];
                nonDuplicateArrayIndex++;
            }

        }
        return nonDuplicateArray;

    }
}