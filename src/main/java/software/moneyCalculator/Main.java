package software.moneyCalculator;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    //http://data.fixer.io/api/latest?access_key=8bd70f9cec061336bbed4e1a0e4ae85d
    //fqblidsmdhwcsutwhh@cazlg.com
    //123456
    //Fixed
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://data.fixer.io/api/latest?access_key=8bd70f9cec061336bbed4e1a0e4ae85d");
        InputStream x = url.openStream();
        String a = new String(x.readAllBytes());
        System.out.printf(a);
        MainFrame mainframe = new MainFrame();
        mainframe.setVisible(true);
    }
}
