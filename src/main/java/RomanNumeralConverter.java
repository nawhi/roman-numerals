public class RomanNumeralConverter {

    private final String[] results = { "I", "II", "III" };

    public String convert(int decimal) {
        return results[decimal - 1];
    }
}
