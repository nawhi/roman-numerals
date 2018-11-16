import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RomanNumeralConverterShould {

    @ParameterizedTest
    @CsvSource({
            "1,I",
            "2,II",
            "3,III",
            "4,IV",
            "5,V",
            "6,VI",
            "7,VII",
            "8,VIII",
            "9,IX",
            "10,X",
            "15,XV",
            "39,XXXIX",
            "40,XL",
            "48,XLVIII",
    })
    public void convert_decimals_to_numerals(int decimal, String numeral) {
        assertThat(new RomanNumeralConverter().convert(decimal), is(numeral));
    }
}
