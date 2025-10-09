import Algorithm.GeoPolicalZoneDriver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPolicalZoneDriverTest {
    @Test
    public void testThatStateCanBeFound() {
        String stateToCheck = "lagos";
        String expectedState = GeoPolicalZoneDriver.checkForStateInZone(stateToCheck);
        String actual = "SOUTHWEST";
        assertEquals(expectedState, actual);

    }

    @Test
    public void testThatUknownStateCanBeFound() {
        String stateToCheck = "Alabama";
        String expectedState = GeoPolicalZoneDriver.checkForStateInZone(stateToCheck);
        String actual = "Unknown state";
        assertEquals(expectedState, actual);

    }
}
