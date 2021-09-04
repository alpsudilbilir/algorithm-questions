package question03.ShortestWord;

public class ShortestWord {
    public static int findShort(String s) {
        String[] splitStr = s.split("\\s+");
        int min = splitStr[0].length();
        for(int i = 0; i < splitStr.length; i++){
            if(splitStr[i].length() < min){
                min = splitStr[i].length();
            }
        }
        return min;
    }
}
