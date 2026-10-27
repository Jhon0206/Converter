import dev.jhon0206.converter.length.LengthConverter;
import dev.jhon0206.converter.length.LengthUnit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthConverterTest {

    private static final double TOLERANCE = 0.00001;

    @Test
    public void mustConvertKilometersToMeters(){
        var converter = new LengthConverter();
        double result = converter.convert(2.5, LengthUnit.KILOMETER, LengthUnit.METER);
        assertEquals(2500d, result, TOLERANCE);
    }
}
