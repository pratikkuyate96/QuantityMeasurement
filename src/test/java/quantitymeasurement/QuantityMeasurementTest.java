package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenFeetValue_WhenEqual_ReturnTrue() {
        Unit value1 = new Unit(0);
        Unit value2 = new Unit(0);
        boolean isEqual = this.quantityMeasurement.compare(value1, value2);
        Assert.assertEquals(true, isEqual);
    }
}
