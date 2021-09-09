package question17.MexicanWave;

import java.util.Arrays;

public class MexicanWave {
    public static String[] wave(String str) {
        int countLetters = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                countLetters +=1;
            }
        }
        String[] arr = new String[countLetters];
        char[] charArr;
        charArr = str.toCharArray();
        int i = 0;
        int j = 0;
        while (i < charArr.length){
            if(Character.isLetter(charArr[i])){
                charArr[i] = Character.toUpperCase(charArr[i]);
                String text = String.valueOf(charArr);
                arr[j] = text;
                charArr = str.toCharArray();
                j++;
            }
            i++;

        }
        return arr;
    }
}