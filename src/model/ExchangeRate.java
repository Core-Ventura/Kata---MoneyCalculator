package model;

import java.util.ArrayList;
import java.util.List;

public class ExchangeRate {

    public ExchangeRate() {
        final Currency fromCurrency;
        final Currency toCurrency;
        final double rate;
    }
    
    public ExchangeRate(Currency fcurrency, Currency tcurrency, double d) {
        final Currency fromCurrency = fcurrency;
        final Currency toCurrency = tcurrency;
        final double rate = d;
    }
      
    private final List<ExchangeRate> list = new ArrayList<ExchangeRate>();
    
    public boolean add(ExchangeRate exchangeRate) {
           return list.add(exchangeRate);
    }
    
    public ExchangeRate get(int index) {
        return list.get(index);
    }

    public ExchangeRate[] toArray() {
        return list.toArray(new ExchangeRate[list.size()]);
    }

}