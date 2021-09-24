package question26;

public class BuyCar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        double startPriceold = (double) startPriceOld;
        double startPricenew = (double) startPriceNew;
        int countMonths = 1;
        double increaseDecrease = 0.5;
        int n = 0;
        int[] rich = {countMonths-1,startPriceOld-startPriceNew};
        if(startPriceOld > startPriceNew){
            return rich;
        }
        while (true){
            if(countMonths % 2 == 0){
                percentLossByMonth += increaseDecrease;
            }
            startPriceold -= (startPriceold * (percentLossByMonth/100));
            startPricenew -= (startPricenew * (percentLossByMonth/100));
            n += savingperMonth;
            countMonths++;
            if (startPriceold + n > startPricenew){
                break;
            }
        }
        int[] result = {countMonths-1,(int) (Math.round(startPriceold+n-startPricenew))};
        return result;
    }
}
