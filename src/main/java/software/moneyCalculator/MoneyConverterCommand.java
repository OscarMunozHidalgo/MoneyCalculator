package software.moneyCalculator;

public class MoneyConverterCommand implements Command{

    private final Money initialMoney;
    private final Currency currency;

    public MoneyConverterCommand(Money money, Currency currency) {
        this.initialMoney = money;
        this.currency = currency;
    }

    public String execute(){
        return convert().toString();
    }

    public Money convert(){
        return new Money(quantityConverse(currency), currency);
    }

    private double quantityConverse(Currency currency) {
        return initialMoney.getQuantity() * currency.exchangeRate()/initialMoney.getCurrency().exchangeRate();
    }

}
