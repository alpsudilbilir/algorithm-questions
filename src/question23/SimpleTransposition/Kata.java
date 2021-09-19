package question23.SimpleTransposition;

public class Kata {
    public static String simpleTransposition(String text) {
        String[] arr = text.split("");
        int length1;
        int length2;
        if(arr.length % 2 != 0){
            length1 = arr.length/2+1;
            length2 = arr.length/2;
        }else{
            length1 = arr.length/2;
            length2 = arr.length/2;
        }
        String[] strArr1  = new String[length1];
        String[] strArr2 = new String[length2];
        int j = 0;
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            if( i % 2 == 0){
                strArr1[j] = arr[i];
                j++;
            }else{
                strArr2[k] = arr[i];
                k++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String s : strArr1){
            sb.append(s);
        }
        for (String s : strArr2){
            sb.append(s);
        }
        return sb.toString();
    }
}
