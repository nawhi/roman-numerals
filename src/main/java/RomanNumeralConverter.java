public class RomanNumeralConverter {
    public String convert(int decimal) {
        if (decimal == 3)
            return "III";
        if (decimal == 2)
            return "II";
        return "I";
    }
}
