package currency;

public class CHF extends Currency implements IsFreeConverted {
    public CHF(double RateNBU) {
        super(RateNBU);
    }

    @Override
    public String getCurrencyName() {
        return "CHF";
    }

    @Override
    public boolean isFreeConv() {
        return false;
    }
}
