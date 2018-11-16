import java.util.*;

public class RomanNumeralConverter {

    private final Map<Integer, String> results;

    public RomanNumeralConverter() {
        results = new LinkedHashMap<>();
        results.put(400, "CM");
        results.put(100, "C");
        results.put(90, "XC");
        results.put(50, "L");
        results.put(40, "XL");
        results.put(10, "X");
        results.put(9, "IX");
        results.put(5, "V");
        results.put(4, "IV");
        results.put(1, "I");
    }

    public String convert(int decimal) {
        if (results.containsKey(decimal))
            return results.get(decimal);

        for (int edge: results.keySet())
            if (decimal > edge)
                return results.get(edge) + convert(decimal - edge);

        return results.get(1);
    }
}
