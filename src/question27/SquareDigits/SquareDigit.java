package question27.SquareDigits;

public class SquareDigit {
    public int squareDigits(int n) {
        String txtNum = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < txtNum.length(); i++){
            int x = Character.getNumericValue(txtNum.charAt(i));
            sb.append(String.valueOf(x*x));
        }
        return Integer.parseInt(sb.toString());
    }
}
