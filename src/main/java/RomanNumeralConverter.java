import java.util.*;

public class RomanNumeralConverter {

    private final Map<Integer, String> numerals;

    public RomanNumeralConverter() {
        numerals = new LinkedHashMap<>();
        numerals.put(1000, "M");
        numerals.put(900, "CM");
        numerals.put(500, "D");
        numerals.put(400, "CD");
        numerals.put(100, "C");
        numerals.put(90, "XC");
        numerals.put(50, "L");
        numerals.put(40, "XL");
        numerals.put(10, "X");
        numerals.put(9, "IX");
        numerals.put(5, "V");
        numerals.put(4, "IV");
        numerals.put(1, "I");
    }

    public String convert(int decimal) {
        if (numerals.containsKey(decimal))
            return numerals.get(decimal);

        for (int boundary: numerals.keySet())
            if (decimal > boundary)
                return numerals.get(boundary) + convert(decimal - boundary);

        return numerals.get(1);
    }
}
