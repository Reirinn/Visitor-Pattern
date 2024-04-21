import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallsTextOffer {

    private static final Map<String, String> offerMap = new LinkedHashMap<>() {{
        offerMap.put("Smart", "Do not offer any free calls or texts, and you will be charged per use.");
        offerMap.put("Globe", "Comes with unlimited calls and texts to subscribers within their network. \n\t\t\t\t\tCalls and texts to other networks are charged extra.");
        offerMap.put("Ditto", "Includes unlimited calls and texts to all networks within the country.");
    }};


    public String showUnliCallsTextOffer(String telcoName, Boolean unliCallText) {
        return unliCallText ? unliCallOfferMap.getOrDefault(telcoName, "Telco Name not Found") : "Do not offer any free calls or texts, and you will be charged per use.";

    }

    public String showUnliCallsTextOffer(TelcoSubscription telco) {
        return this.showUnliCallsTextOffer(telco.getTelcoName(), telco.isUnliCallText());
    }
}