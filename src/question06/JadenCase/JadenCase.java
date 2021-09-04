package question06.JadenCase;

public class JadenCase {

    public static String toJadenCase(String phrase) {
        if(phrase == null){
            phrase = "";
        }
        if(phrase.equals("")){
            return null;
        }

        String[] splitStr = phrase.split("\\s+");
        for(int i = 0; i< splitStr.length; i++){
            splitStr[i] = splitStr[i].substring(0,1).toUpperCase() + splitStr[i].substring(1);
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < splitStr.length; i++){
            sb.append(splitStr[i]);
            if(i<splitStr.length -1){
                sb.append(" ");
            }
        }
        phrase = sb.toString();
        return phrase;
    }
}
