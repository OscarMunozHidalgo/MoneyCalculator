package software.moneyCalculator;

import java.util.List;

public interface ExchangeRateLoader {
    public List<Money> load();
}
