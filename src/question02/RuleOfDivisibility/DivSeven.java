package question02.RuleOfDivisibility;

class DivSeven {
    public static long[] seven(long m) {
        int count = 0;

        while (m > 99 ){
            long division = m/10;
            long rem = m % 10;
            m = division - (2*rem);
            count++;
        }
        long[] arr = {m,count};
        return arr;
    }
}

