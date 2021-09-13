package question18.PrimorialNumber;
// 4 -> 2*3*5*7 = 210
public class Primorial {
    public static String numPrimorial(int n) {
        long result = 2;
        boolean isPrime = true;
        boolean isFinished = true;
        long num = 3;
        long count = 0;
        while (true){
            for(long i = 2; i < num; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                result *= num;
                num++;
                count++;
                if(count+1 == n){
                    break;
                }
            }
            isPrime = true;
            num++;
        }
        return ""+result;
    }
}