package currency;

abstract class Currency { //abstract class rejected new object from class
    private double rateNBU;
    private double marga = 1.1;


    public double getRateBuy() {
        return rateNBU * marga;
    }

    public double getRateSell() {
        return rateNBU / marga;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }

    public Currency (double RateNBU){
        this.rateNBU = RateNBU;
    }

    public double getRateNBU() {
        return rateNBU;
    }

    public void setRateNBU(double rateNBU) {
        this.rateNBU = rateNBU;
    }

    abstract public String getCurrencyName(); // help return currency name

    public double exchangeUAHtoCurrency (double numberOfUAH){
        double tempResult = numberOfUAH / getRateBuy(); //amount which we get in foreign currency
        System.out.println(String.format("For %s UAH you get %s  %s by rate %s", numberOfUAH, tempResult,getCurrencyName(),getRateBuy()));//added currency name
    return tempResult;
    }
    public double ecxhangeCurrencytoUAH (double numberOfCurrency){
       double tempResult = numberOfCurrency * getRateSell();
        System.out.println(String.format("For %s %s you get %s UAH by rate %s",numberOfCurrency,getCurrencyName(),tempResult,getRateSell()));
        return tempResult;
    }

}
