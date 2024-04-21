import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {
    private static Map<String, Double> priceMap;

    static{
        priceMap = Map.ofEntries(
            priceMap.put("Smart", 15),
            priceMap.put("Globe", 10),
            priceMap.put("Ditto", 8),
        )
    }
    @Override
    public String showAllowance(String telcoName, double money) {
        int dataAllowance = priceMap.get(telcoName);
        return "Offers a data allowance of " + dataAllowance + " GB for " + money + " pesos per month";
    }

    public String showAllowance(TelcoSubscription telco) {
        return this.showAllowance(telco.getTelcoName(), telco.getPromoPrice());
    }


    @Override
    public String showAllowance(String telcoName, Double money) {
        return "ok";
    }
}