public class Telco implements TelcoSubscription {

    private String telcoName;
    private double promoPrice;
    private Integer dateAllowance;
    public boolean unliCallText ;


    public Telco(String telcoName, double promoPrice, Integer dateAllowance, boolean unliCallText){
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dateAllowance = dateAllowance;
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

    public Integer getDateAllowance() {
        return dateAllowance;
    }

    public void setDateAllowance(Integer dateAllowance) {
        this.dateAllowance = dateAllowance;
    }

    public boolean isUnliCallText() {
        return UnliCallText;
    }

    public void setUnliCallText(boolean unliCallText) {
        UnliCallText = unliCallText;
    }
}