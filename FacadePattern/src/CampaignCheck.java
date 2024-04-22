import Resources.CurrentCampaigns;

public class CampaignCheck {
    public void checkCampaignType (String productName){
        String campaignName = getCampaignName(productName);

        if (campaignName == null) {
            System.out.println("Campaña: " + "No tiene campaña asociada.");
        } else {
            System.out.println("Campaña: " + campaignName);
        }
    }

    public static String getCampaignName(String productName) {
        for (CurrentCampaigns campaign_name : CurrentCampaigns.values()) {
            for (String product : campaign_name.getCampaigns()) {
                if (product.equalsIgnoreCase(productName)) {
                    return campaign_name.name();
                }
            }
        }
        return null;
    }
}
