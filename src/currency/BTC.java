package currency;

public class BTC extends Currency implements CryptoCurrency {
    public BTC(double RateNBU) {
        super(RateNBU);
    }

    @Override
    public String getCurrencyName() {
        return "BTC";
    }
    
    @Override
    public boolean cryptoCurrency() {
        return true;
    }

    @Override
    public double exchangeUAHtoCurrency(double numberOfUAH) {
        System.out.println("The operation of exchange rejected by NBU. You amount in UAH " + numberOfUAH);
        return numberOfUAH;
    }
}
