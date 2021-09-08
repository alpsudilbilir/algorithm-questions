package question15.LooseChange;

import java.util.HashMap;

public class Change {
    public static HashMap<String, Integer> looseChange(int cent) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pennies", 0);
        map.put("Nickels", 0);
        map.put("Dimes", 0);
        map.put("Quarters", 0);
        int countQuarters = 0;
        int countDimes = 0;
        int countNickels = 0;
        int countPennies = 0;
        if(cent <= 0){
            return map;
        }
        while (cent != 0){
            if(cent >= 25){
                countQuarters++;
                cent -= 25;
            }else if(cent >= 10){
                countDimes++;
                cent -= 10;
            }else if(cent >= 5 ){
                countNickels++;
                cent -= 5;
            }else if(cent >= 1){
                countPennies++;
                cent -= 1;
            }
        }
        map.put("Nickels",countNickels);
        map.put("Dimes",countDimes);
        map.put("Pennies",countPennies);
        map.put("Quarters",countQuarters);

        return map;
    }
}
