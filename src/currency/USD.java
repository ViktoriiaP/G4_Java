package currency;

public class USD extends Currency implements IsFreeConverted{


    public USD(double RateNBU) {
        super(RateNBU);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }
}
