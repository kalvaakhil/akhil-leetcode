import java.math.BigDecimal;
class Solution {
    public static boolean isNumber(String s) {
        try {
            BigDecimal bigDecimal = new BigDecimal(s);
            return true;
        } catch (NumberFormatException e) {
            if (e.getMessage() != null && (e.getMessage().equals("Too many nonzero exponent digits.") || e.getMessage().equals("Exponent overflow."))) return true;
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}