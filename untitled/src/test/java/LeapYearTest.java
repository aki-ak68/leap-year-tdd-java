import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    @Test
    void shouldReturnTrueForYearDivisibleBy400() {
        assertTrue(LeapYear.isLeapYear(2000));
    }

}
