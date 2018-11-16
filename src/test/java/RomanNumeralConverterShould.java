import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RomanNumeralConverterShould {

    @ParameterizedTest
    @CsvSource({
            "1,I",
            "2,II",
    })
    public void convert_decimals_to_numerals(int decimal, String numeral) {
        assertThat(new RomanNumeralConverter().convert(decimal), is(numeral));
    }
}
