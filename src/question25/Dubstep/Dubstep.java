package question25.Dubstep;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Dubstep {
    public static String SongDecoder (String song) {
        String x =  song.replaceAll("WUB"," ");
        String y = x.replaceAll("\\s+"," ");
        StringBuilder stringBuilder = new StringBuilder(y);
        if(y.startsWith(" ")){
            stringBuilder.deleteCharAt(0);
        }
        if(y.endsWith(" ")){
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
        return stringBuilder.toString();
    }
}