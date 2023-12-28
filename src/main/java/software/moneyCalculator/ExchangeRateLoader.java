package software.moneyCalculator;

import java.io.IOException;
import java.util.List;

public interface ExchangeRateLoader {
    public List<Money> load() throws IOException;
}
