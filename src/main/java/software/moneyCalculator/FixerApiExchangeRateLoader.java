package software.moneyCalculator;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FixerApiExchangeRateLoader implements ExchangeRateLoader{
    private URL url;
    private static Date lastDate;

    public FixerApiExchangeRateLoader(String url) throws MalformedURLException {
        this.url = new URL(url);
    }

    @Override
    public List<Money> load() throws IOException {
        URLConnection urlConnection = url.openConnection();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){
            return load(reader);
        }catch (IOException e){
            return null;
        }
        /*InputStream stream = url.openStream();
        String data = new String(stream.readAllBytes());
        System.out.println(data.lines().map(this::toMoney).collect(toList()));
        System.out.println(url.openStream().read());
        return null;*/

    }

    private List<Money> load(BufferedReader reader) {
        return reader.lines().map(this::toMoney).collect(toList());
    }

    private Money toMoney(String s) {
        return toMoney(s.split(","));
    }

    private Money toMoney(String[] split) {
        return new Money();
    }
}
