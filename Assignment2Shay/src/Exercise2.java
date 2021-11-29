import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers ");
        printAverage();

    }
    public static void printAverage() {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];
        int average = 0;
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
            average = average + arr[i];
        }
        average = average / arr.length;
        for (int i = 0; i < arr.length; i++) {
            boolean biggerThanAv = arr[i] > average;
            if(biggerThanAv){
                boolean isFound = false;
                for (int j = i + 1;  j < arr.length; j ++){
                    if (arr[i] == arr[j]){
                        isFound = true;
                        break;
                    }

                }
                if (!isFound){
                    System.out.print(arr[i] + " ") ;
                }
            }

        }
    }
}


