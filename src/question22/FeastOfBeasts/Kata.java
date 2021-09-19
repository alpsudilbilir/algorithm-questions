package question22.FeastOfBeasts;

public class Kata {
    public static boolean feast(String beast, String dish) {
        return dish.startsWith(String.valueOf(beast.charAt(0))) && dish.endsWith(String.valueOf(beast.charAt(beast.length() - 1)));
    }

}