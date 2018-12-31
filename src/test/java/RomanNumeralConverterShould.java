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
            "50,L",
            "89,LXXXIX",
            "90,XC",
            "91,XCI",
            "100,C",
            "101,CI",
            "400,CD",
            "401,CDI",
            "500,D",
            "501,DI",
            "900,CM",
            "1000,M",
            "1999,MCMXCIX",
            "2018,MMXVIII"
    })
    public void convert_decimals_to_numerals(int decimal, String numeral) {
        assertThat(new RomanNumeralConverter().convert(decimal), is(numeral));
    }
}
