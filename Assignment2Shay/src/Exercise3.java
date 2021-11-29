public class Exercise3 {

    public static void main(String[] args) {
        System.out.println(phoneNumberNormalizer("055-8817321"));
    }


    public static String phoneNumberNormalizer(String phoneNumber){
        String correctPhoneNumber = "0";
        for(int i = 0; i < phoneNumber.length(); i++){
            if(!isDigit(phoneNumber.charAt(i)) && i != 3 ){
                return "";
            }
        }
        String phoneStartDigits = phoneNumber.charAt(0) + "" + phoneNumber.charAt(1) + "" + phoneNumber.charAt(2);
        int i = 1;

        if(phoneStartDigits.equals("972")){
            i = 3;
        }
        int iterationNumber = 0;
        while (i < phoneNumber.length()){
            if(iterationNumber == 2){
                if(phoneNumber.charAt(3) != '-') {
                    correctPhoneNumber = correctPhoneNumber + "-";
                }
            }
            correctPhoneNumber = correctPhoneNumber + phoneNumber.charAt(i);
            i++;
            iterationNumber++;

        }
        return correctPhoneNumber;
    }

    public static boolean isDigit(char digit){
        String digits = "0123456789";
        for(int i = 0; i < digits.length(); i++){
            if(digit == digits.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
