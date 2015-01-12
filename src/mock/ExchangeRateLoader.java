package mock;

import model.Currency;
import model.ExchangeRate;


public class ExchangeRateLoader implements persistence.ExchangeRateLoader {
    @Override
    public ExchangeRate load() {
        ExchangeRate set = new ExchangeRate();
        set.add(new ExchangeRate(
                new Currency("EUR","Euro","€"),
                new Currency("USD","Dolar americano","$"),
                1.1806));
        set.add(new ExchangeRate(
                new Currency("EUR","Euro","€"),            
                new Currency("HKD","Dolar Hong Kong","$"),
                9.1729));
        return set;
    }
}
