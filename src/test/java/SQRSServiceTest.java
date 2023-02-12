import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.*;

public class SQRSServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 17;
        int actual = service.calcSqrt(200, 1_000);

        Assertions.assertEquals(expected, actual);

    }


}
