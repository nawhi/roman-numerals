import java.util.SortedMap;
import java.util.TreeMap;

public class RomanNumeralConverter {

    private final SortedMap<Integer, String> results;

    public RomanNumeralConverter() {
        results = new TreeMap<>();
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
        if (decimal > 100)
            return results.get(100) + convert(decimal - 100);
        if (decimal > 90)
            return results.get(90) + convert(decimal - 90);
        if (decimal > 50)
            return results.get(50) + convert(decimal - 50);
        if (decimal > 40)
            return results.get(40) + convert(decimal - 40);
        if (decimal > 10)
            return results.get(10) + convert(decimal - 10);
        if (decimal > 5)
            return results.get(5) + convert(decimal - 5);
        return results.get(1) + convert(decimal - 1);
    }
}
