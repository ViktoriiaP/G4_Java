package currency;

public class BTC extends Currency implements IsFreeConverted, CryptoCurrency {
    public BTC(double RateNBU) {
        super(RateNBU);
    }

    @Override
    public String getCurrencyName() {
        return "BTC";
    }

    @Override
    public boolean isFreeConv() {
        return false;
    }

    @Override
    public boolean cryptoCurrency() {
        return true;
    }

    @Override
    public double exchangeUAHtoCurrency (double numberOfUAH){
        double tempResult = numberOfUAH / getRateBuy(); //amount which we get in foreign currency
        System.out.println("The operation of exchange rejected by NBU. You amount in UAH " + numberOfUAH);
        return numberOfUAH;
    }
}
