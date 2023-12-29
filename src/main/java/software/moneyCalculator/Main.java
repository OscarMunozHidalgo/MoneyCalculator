package software.moneyCalculator;

import software.moneyCalculator.viewer.MainFrame;

import java.io.IOException;
import java.util.List;

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


        MainFrame mainframe = new MainFrame();
        //mainframe.setVisible(true);
    }
}
