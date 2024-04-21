public interface TelcoSubscription {

    public String accept(UsagePromo usagePromo, double price);
    public String accept(UnliCallsTextOffer unliCallOffer, boolean unliCallsText);
    public String getTelcoName();
    public double getPromoPrice();
    public Integer getDataAllowance();
    public boolean isUnliCallText();
}