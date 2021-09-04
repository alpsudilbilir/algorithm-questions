package question08.ValidatePinCode;

public class Solution {

    public static boolean validatePin(String pin) {
        boolean check = true;
        if(pin.length() == 4 || pin.length() == 6){
            for(char c: pin.toCharArray()){
                if(!Character.isDigit(c)){
                    check = false;
                }
            }
        }else{
            return false;
        }
        return check;
    }
}
