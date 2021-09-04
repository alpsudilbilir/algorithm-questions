package question09.DescendingOrder;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        int result = 0;
        String newStr = null;
        String numStr = String.valueOf(num);
        char[] charArr =  numStr.toCharArray();
        if(charArr.length == 1){
            return Integer.valueOf(String.valueOf(charArr));
        }
        for(int i = 0; i< charArr.length; i++){
            for(int j = 0; j < charArr.length; j++){
                if(Character.getNumericValue(charArr[i]) > Character.getNumericValue(charArr[j])){
                    char temp = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = temp;
                    newStr = String.valueOf(charArr);
                    result = Integer.valueOf(newStr);
                }

            }
        }

        return result;
    }
}
