import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashBackHacker;

public class CashbackHackServiceTest {

    @Test

    public void shouldRemain100IfAmount900() {

        CashBackHacker service = new CashBackHacker();

        int amount = 900;
        int expected = 300;
        int actual = service.remain(900);

        Assert.assertEquals(actual, expected);

    }
}
