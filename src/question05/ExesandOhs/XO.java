package question05.ExesandOhs;

public class XO {

    public static boolean getXO (String str) {
        int countX = 0;
        int countO = 0;
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'x' || arr[i] == 'X'){
                countX++;
            }
            if(arr[i] == 'o' || arr[i] =='O'){
                countO++;
            }
        }
        if(countO == countX){
            return true;
        }
        if(countO == 0 && countX == 0){
            return true;
        }
        return false;
    }
}
