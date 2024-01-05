package software.ulpgc.kata6;

import java.util.Map;

public class RomanDecoder {

    private static final Map<Character, Integer> romanMap = Map.of(
      'I',1,
      'V',5,
      'X',10,
      'L',50,
      'C',100,
      'D',500,
      'M',1000
    );
    public int decode(String romanNumber) {
        if(isInvalidRomanNumber(romanNumber)){
            throw new IllegalArgumentException("Invalid Roman number");
        }
        int result = 0;
        int lastValue = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            int currentValue = romanMap.get(romanNumber.charAt(i));
            if(lastValue < currentValue){
                result += currentValue - 2 * lastValue;
            } else{
                result += currentValue;
            }
            lastValue = currentValue;
        }
        return result;
    }

    private boolean isInvalidRomanNumber(String romanNumber) {
        if(isNullOrEmpty(romanNumber)) return true;
        if(hasInvalidDigits(romanNumber)) return true;
        if(hasInvalidRepetitions(romanNumber)) return true;
        return hasInvalidSubstractions(romanNumber);
    }

    private static boolean isNullOrEmpty(String romanNumber) {
        return romanNumber == null || romanNumber.isEmpty();
    }

    private static boolean hasInvalidSubstractions(String romanNumber) {
        return romanNumber.matches("(I[LCDM])|(X[DM])|V[XLCDM]|L[CDM]|DM");
    }

    private static boolean hasInvalidRepetitions(String romanNumber) {
        return romanNumber.matches("([IXCM])\\1\\1\\1|([VLD])\\2");
    }

    private static boolean hasInvalidDigits(String romanNumber) {
        return romanNumber.matches(".*[^IVXLCDM]+.*");
    }
}
