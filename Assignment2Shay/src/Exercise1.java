
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(containString("I love meat", "meat"));
    }
    public static boolean containString(String str1, String str2) {
        for(int i = 0; i <= str1.length() -str2.length(); i++){
            if(str1.charAt(i) == str2.charAt(0)){

                boolean flag = true;
                for(int j = 0; j < str2.length(); j++){
                    if(str2.charAt(j) != str1.charAt(i)){
                        flag = false;
                        break;
                    }
                    i++;
                }
                if(flag){
                    return true;
                }
            }
        }
        return false;
    }
}