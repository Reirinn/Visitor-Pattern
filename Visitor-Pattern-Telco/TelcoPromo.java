public class TelcoPromo {
    public static void main(String[] args) {
    	
        TelcoSubscription smart = new Telco("Smart", 500, 15, false);
        TelcoSubscription globe = new Telco("Globe", 450, 10, true);
        TelcoSubscription ditto = new Telco("Ditto", 400, 8, true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: "  + promo.showAllowance(smart));
        System.out.println("Globe Data Usage Offer and price: "  + promo.showAllowance(globe));
        System.out.println("Ditto Data Usage Offer and price: "  + promo.showAllowance(ditto));

        System.out.println("Smart unlimited calls and text package: " + unli.showUnliCallsTextOffer(smart));
        System.out.println("Globe unlimited calls and text package: " + unli.showUnliCallsTextOffer(globe));
        System.out.println("Ditto unlimited calls and text package: " + unli.showUnliCallsTextOffer(ditto));
   
    }
}