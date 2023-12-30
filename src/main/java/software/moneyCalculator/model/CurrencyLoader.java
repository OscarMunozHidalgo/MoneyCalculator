package software.moneyCalculator.model;

import software.moneyCalculator.model.Currency;

import java.io.IOException;
import java.util.List;

public interface CurrencyLoader {
    public List<Currency> load() throws IOException;
}
