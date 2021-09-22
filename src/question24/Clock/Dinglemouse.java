package question24.Clock;

public class Dinglemouse {
    public static String whatTimeIsIt(final double angle) {
            int first = (int) angle / 30;
            int second = (int) (angle % 30)*2;
            int sx = (int) Math.floor(second);
            return String.format("%02d:%02d",first,sx);
        }

}


