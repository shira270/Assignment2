public class Exercise5 {
    public static void main(String[] args) {
        int[] goodArr = {2, 3, 7, 8, 7, 6, 1};
        int[] badArr = {1, 2, 3, 4, 3, 6, 7, 8, 9};
        System.out.println(upDown(goodArr));
        System.out.println(upDown(badArr));
    }
    public static int upDown (int[] arr){
        boolean goingUp = true;
        int topIndex = 0;
        for (int i = 0; i < arr.length -1; i++){
            if(goingUp && arr[i] < arr[i + 1]) {
                topIndex = i + 1;
            }
            else if (arr[i] > arr[i + 1]){
                goingUp = false;
            }
            else {
                return -1;
            }
        }
        return topIndex;



    }
}
