package question10.FixStringCase;

public class Solution {

    public static String solve(final String str) {
        int countUpper = 0;
        int countLower = 0;
        String newStr = null;
        for(int i = 0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                countUpper++;
            }
            if(Character.isLowerCase(str.charAt(i))){
                countLower++;
            }
        }
        if(countUpper > countLower){
            char[] charArr = str.toCharArray();
            for (int j = 0; j<charArr.length; j++) {
                charArr[j] = Character.toUpperCase(charArr[j]);
            }
            newStr = String.valueOf(charArr);
        }else{
            char[] charArr = str.toCharArray();
            for (int j = 0; j<charArr.length; j++) {
                charArr[j] = Character.toLowerCase(charArr[j]);
            }
            newStr = String.valueOf(charArr);
        }

        return newStr;
    }
}