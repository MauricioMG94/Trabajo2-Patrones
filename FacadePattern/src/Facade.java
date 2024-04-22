public class Facade {

    public void opportunityAndInteractionCreate (String userId, String productName, String clientId,  String officeName, String status, String observations) {

        System.out.println("Información de la interacción:");
        Interaction interaction = new Interaction();
        interaction.interactionCreate(userId, officeName, status, observations);

        System.out.println("\nInformación de la oportunidad de negocio:");
        Opportunity opportunity = new Opportunity();
        opportunity.opportunityCreate(userId, productName, clientId);

        ProductCheck productCheck = new ProductCheck();
        productCheck.checkProductType(productName);

        CampaignCheck campaignCheck = new CampaignCheck();
        campaignCheck.checkCampaignType(productName);
    }
}
