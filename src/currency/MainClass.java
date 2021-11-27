package currency;

public class MainClass {
    public static void main(String[] args) {
        USD usd = new USD(27);
        System.out.println(usd.getRateNBU());
        System.out.println(usd.getMarga());
        usd.setRateNBU(27.55);
        System.out.println(usd.getRateNBU());
        usd.exchangeUAHtoCurrency(1000);
        usd.ecxhangeCurrencytoUAH(300);

        EUR eur = new EUR(31);
        eur.ecxhangeCurrencytoUAH(1000);
        eur.exchangeUAHtoCurrency(100);

        CHF chf = new CHF(25.32);
        chf.ecxhangeCurrencytoUAH(1900);
        chf.exchangeUAHtoCurrency(5000);

        // Currency currency = new Currency(100);
        System.out.println(usd.isFreeConv());
        chf.setMarga(2.25);
        chf.ecxhangeCurrencytoUAH(300);
        chf.exchangeUAHtoCurrency(1000);
        chf.setRateNBU(37);
        chf.exchangeUAHtoCurrency(2000);

        BTC btc = new BTC(999);
        btc.ecxhangeCurrencytoUAH(3000);
        btc.exchangeUAHtoCurrency(5000);
        btc.cryptoCurrency();


    }
}
