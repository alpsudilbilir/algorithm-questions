package question13.FindTheOdd;

public class FindTheOdd {
    public static int findIt(int[] a) {
        int result = 0;
        int count = 0;
            for(int i = 0; i <a.length; i++){
                for(int j = 0; j<a.length; j++){
                    if(a[i] == a[j]){
                        count++;
                    }
                }
                if(count % 2 != 0){
                    result = a[i];
                    break;
                }
            }

        return result;
    }
}
