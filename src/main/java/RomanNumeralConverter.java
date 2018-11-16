import java.util.SortedMap;
import java.util.TreeMap;

public class RomanNumeralConverter {

    private final SortedMap<Integer, String> results;

    public RomanNumeralConverter() {
        results = new TreeMap<>();
        results.put(1, "I");
        results.put(4, "IV");
    }

    public String convert(int decimal) {
        if (results.containsKey(decimal))
            return results.get(decimal);
        return results.get(1) + convert(decimal - 1);
    }
}
