package question19.UniqueNumber;
public class Kata {
    public static double findUniq(double arr[]) {
        double unique = arr[0];
        if(arr[1] == arr[2] && arr[0] != arr[1]){
            return arr[0];
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[0] != arr[i]){
                return arr[i];
            }
        }
        return unique;
    }
}
