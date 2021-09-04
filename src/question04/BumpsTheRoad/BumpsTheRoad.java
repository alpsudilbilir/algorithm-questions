package question04.BumpsTheRoad;

public class BumpsTheRoad {
    public static String bumps(final String road) {
        int countn = 0;
        for(char c: road.toCharArray()){
            if(c == 'n'){
                countn++;
            }
        }
        if(countn<=15){
            return "Woohoo!";
        }
        return "Car Dead";
    }
}

