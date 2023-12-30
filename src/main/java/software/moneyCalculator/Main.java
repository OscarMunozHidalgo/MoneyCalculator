package software.moneyCalculator;

import software.moneyCalculator.model.FixerApiCurrencyLoader;
import software.moneyCalculator.controller.MoneyConverterCommand;
import software.moneyCalculator.model.Currency;
import software.moneyCalculator.model.Money;
import software.moneyCalculator.viewer.MainFrame;
import software.moneyCalculator.viewer.MockFrame;

import java.io.IOException;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    //http://data.fixer.io/api/latest?access_key=8bd70f9cec061336bbed4e1a0e4ae85d
    //fqblidsmdhwcsutwhh@cazlg.com
    //123456
    //Fixed

    //https://v6.exchangerate-api.com/v6/a4fb20e77a139bf7429d8c38/latest/USD
    //debogztxnepuurltvo@ckptr.com
    //123456
    //app.exchangerate-api.com/sign-up
    public static void main(String[] args) throws IOException {

        List<Currency> currencies = new FixerApiCurrencyLoader("https://v6.exchangerate-api.com/v6/a4fb20e77a139bf7429d8c38/latest/USD").load();
        Money initial = new Money(100, currencies.get(0));
        String finalx = new MoneyConverterCommand(initial, currencies.get(1)).execute();
        System.out.println(initial.getCurrency().letterCode() + "-" + initial.getCurrency().exchangeRate());
        System.out.println(currencies.get(1).letterCode() + "-" + currencies.get(1).exchangeRate());
        System.out.println(finalx);

        List<String> currenciesList = currencies.
                stream().
                map(s->s.letterCode()).
                filter(s -> (s != null && s.length() > 0)).
                collect(toList());

        String[] mainFrameInput = currenciesList.toArray(new String[0]);
        for(String a : mainFrameInput){
            System.out.print("Dato: ");
            System.out.println(a);
        }

        MainFrame mainframe = new MainFrame(mainFrameInput);
        mainframe.setVisible(true);

        MockFrame sec = new MockFrame();
        //sec.setVisible(true);
    }

    /*private static String getCode(Currency currency) {
        return currency.letterCode();
    }*/

}
