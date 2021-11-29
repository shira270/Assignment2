import java.util.Arrays;
public class Exercise6 {
    public static void main(String[] args) {
}

    public static int[] intersection (int[] arr1, int[] arr2){
        int[] arr1NoDuplicate = Exercise4.noDuplicate(arr1);
        int[] arr2NoDuplicate = Exercise4.noDuplicate(arr2);
        int[] intersectionArr = new int[arr1NoDuplicate.length];
        int intersectionIndex = 0;
        for (int i = 0; i < arr1NoDuplicate.length; i++){
            for (int j = 0; j < arr2NoDuplicate.length; j++){
                if (arr1NoDuplicate[i] == arr2NoDuplicate[j]){
                    intersectionArr[intersectionIndex] = arr1NoDuplicate[i];
                    intersectionIndex++;
                }
            }
        }

        int[] intersectionArrCleaned = new int[intersectionIndex];
        for (int i = 0; i < intersectionArrCleaned.length; i++){
            intersectionArrCleaned[i] = intersectionArr[i];
        }
        return intersectionArrCleaned;

    }
    public static boolean isStrangers(int[] arr1, int[] arr2){
        return intersection(arr1,arr2).length == 0;


}
}
