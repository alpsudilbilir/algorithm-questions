package question21.PersistantBugger;
//123
class Persist {
    public static int persistence(long n) {
        int result = 1;
        int count = 0;
        if(n < 10){
            return 0;
        }
        do{
            while (n > 0){
                result *= n % 10;
                n = n / 10;
            }
            n = result;
            result = 1;
            count++;
        }while (n >= 10);
        return count;
    }
}
