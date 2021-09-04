package question01.SortTheOdd;

public class Kata {
    public static int[] sortArray(int[] array) {
        for( int i =0; i<array.length; i++){
            for(int j =0; j<array.length; j++){
                if(array[i] % 2 != 0 && array[i] < array[j] && array[j] %2 != 0){
                    Integer temp= array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}