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

        String result = "";

        while (decimal >= 100) {
            result += results.get(100);
            decimal -= 100;
        }

        while (decimal >= 90) {
            result += results.get(90);
            decimal -= 90;
        }

        while (decimal >= 50) {
            result += results.get(50);
            decimal -= 50;
        }

        while (decimal >= 40) {
            result += results.get(40);
            decimal -= 40;
        }

        while (decimal >= 10) {
            result += results.get(10);
            decimal -= 10;
        }

        while (decimal >= 9) {
            result += results.get(9);
            decimal -= 9;
        }

        while (decimal >= 5) {
            result += results.get(5);
            decimal -= 5;
        }

        while (decimal >= 1) {
            result += results.get(1);
            decimal -= 1;
        }

        return result;
    }
}
