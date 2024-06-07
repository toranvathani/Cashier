import org.example.Cashier;
import org.junit.jupiter.api.Test;

public class CashierTest {
    @Test(expected = RuntimeException.class)
    public void validateCurr(){
        Cashier.validateTransaction("USD", 10);
    }

    @Test(expected = RuntimeException.class)
    public void validateAmou(){
        Cashier.validateTransaction("EUR",-10);
    }
}
