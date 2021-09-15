package question20.Cry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class WhereIsMyParent {
    static String findChildren(final String text) {
        char[] chars = text.toCharArray();
        Arrays.sort(chars);
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i < chars.length; i++){
            arrayList.add((String.valueOf(chars[i])));
        }
        Collections.sort(arrayList,String.CASE_INSENSITIVE_ORDER);
        StringBuffer sb = new StringBuffer();
        for(String s : arrayList){
            sb.append(s);
        }
        return sb.toString();
    }
}
