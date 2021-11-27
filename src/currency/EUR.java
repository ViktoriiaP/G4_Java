package currency;

public class EUR extends Currency implements IsFreeConverted{

    public EUR(double RateNBU) {
        super(RateNBU);
    }

    @Override
    public String getCurrencyName() {
        return "EUR";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }
}
