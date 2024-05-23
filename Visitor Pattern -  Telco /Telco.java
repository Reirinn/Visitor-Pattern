public class Telco implements TelcoSubscription {

    private String telcoName;
    private double promoPrice;
    private Integer dataAllowance;
    public boolean unliCallText ;


    public Telco(String telcoName, double promoPrice, Integer dateAllowance, boolean unliCallText){
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo usagePromo, double money) {
        this.promoPrice = money;
        return usagePromo.showAllowance(telcoName, promoPrice);
    }

    @Override
    public String accept(UnliCallsTextOffer unliCallOffer, boolean unliCallText) {
        this.unliCallText = unliCallText;
        return unliCallOffer.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public Integer getDataAllowance() {
        return dataAllowance;
    }

    public void setDateAllowance(Integer dataAllowance) {
        this.dataAllowance = dataAllowance;
    }

    public boolean isUnliCallText() {
        return unliCallText;
    }

    public void setUnliCallText(boolean unliCallText) {
        unliCallText = unliCallText;
    }

    
}