package question11.AlternatingCase;

public class StringUtils {
    public static String toAlternativeString(String string) {
        char[] charArray;
        charArray = string.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if(Character.isLowerCase(charArray[i])){
                charArray[i] = Character.toUpperCase(charArray[i]);

            }else if(Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }
        string = String.valueOf(charArray);

        return  string;
    }
}
