package question16.FruitMachine;

public class Solution {
    public static int fruit(final String[][] reels, final int[] spins) {
        int num1 = spins[0];
        int num2 = spins[1];
        int num3 = spins[2];
        String firstReel = reels[0][num1];
        String secondReel = reels[1][num2];
        String thirdReel = reels[2][num3];

        if(firstReel.equals(secondReel) &&  firstReel.equals(thirdReel)){
            switch (firstReel){
                case "Wild":
                    return 100;
                case "Star":
                    return 90;
                case "Bell":
                    return 80;
                case "Shell":
                    return 70;
                case "Seven":
                    return 60;
                case "Cherry":
                    return 50;
                case "Bar":
                    return 40;
                case "King":
                    return 30;
                case "Queen":
                    return 20;
                case "Jack":
                    return 10;
            }
        }else if(firstReel.equals(secondReel) || firstReel.equals(thirdReel) || secondReel.equals(thirdReel)){
                if(firstReel.equals(secondReel)){
                    switch (firstReel){
                        case "Wild":
                            return 10;
                        case "Star":
                            if(thirdReel.equals("Wild")){
                                return 18;
                            }
                            return 9;
                        case "Bell":
                            if(thirdReel.equals("Wild")){
                                return 16;
                            }
                            return 8;
                        case "Shell":
                            if(thirdReel.equals("Wild")){
                                return 14;
                            }
                            return 7;
                        case "Seven":
                            if(thirdReel.equals("Wild")){
                                return 12;
                            }
                            return 6;
                        case "Cherry":
                            if(thirdReel.equals("Wild")){
                                return 10;
                            }
                            return 5;
                        case "Bar":
                            if(thirdReel.equals("Wild")){
                                return 8;
                            }
                            return 4;
                        case "King":
                            if(thirdReel.equals("Wild")){
                                return 6;
                            }
                            return 3;
                        case "Queen":
                            if(thirdReel.equals("Wild")){
                                return 4;
                            }
                            return 2;
                        case "Jack":
                            if(thirdReel.equals("Wild")){
                                return 2;
                            }
                            return 1;


                    }
                }else if(firstReel.equals(thirdReel)){
                    switch (firstReel){
                        case "Wild":
                            return 10;
                        case "Star":
                            if(secondReel.equals("Wild")){
                                return 18;
                            }
                            return 9;
                        case "Bell":
                            if(secondReel.equals("Wild")){
                                return 16;
                            }
                            return 8;
                        case "Shell":
                            if(secondReel.equals("Wild")){
                                return 14;
                            }
                            return 7;
                        case "Seven":
                            if(secondReel.equals("Wild")){
                                return 12;
                            }
                            return 6;
                        case "Cherry":
                            if(secondReel.equals("Wild")){
                                return 10;
                            }
                            return 5;
                        case "Bar":
                            if(secondReel.equals("Wild")){
                                return 8;
                            }
                            return 4;
                        case "King":
                            if(secondReel.equals("Wild")){
                                return 6;
                            }
                            return 3;
                        case "Queen":
                            if(secondReel.equals("Wild")){
                                return 4;
                            }
                            return 2;
                        case "Jack":
                            if(secondReel.equals("Wild")){
                                return 2;
                            }
                            return 1;
                    }

                }else if(secondReel.equals(thirdReel)){
                    switch (secondReel){
                        case "Wild":
                            return 10;
                        case "Star":
                            if(firstReel.equals("Wild")){
                                return 18;
                            }
                            return 9;
                        case "Bell":
                            if(firstReel.equals("Wild")){
                                return 16;
                            }
                            return 8;
                        case "Shell":
                            if(firstReel.equals("Wild")){
                                return 14;
                            }
                            return 7;
                        case "Seven":
                            if(firstReel.equals("Wild")){
                                return 12;
                            }
                            return 6;
                        case "Cherry":
                            if(firstReel.equals("Wild")){
                                return 10;
                            }
                            return 5;
                        case "Bar":
                            if(firstReel.equals("Wild")){
                                return 8;
                            }
                            return 4;
                        case "King":
                            if(firstReel.equals("Wild")){
                                return 6;
                            }
                            return 3;
                        case "Queen":
                            if(firstReel.equals("Wild")){
                                return 4;
                            }
                            return 2;
                        case "Jack":
                            if(firstReel.equals("Wild")){
                                return 2;
                            }
                            return 1;
                    }

                }
        }
        return 0;
    }
}