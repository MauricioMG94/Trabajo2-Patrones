public class Campaign implements ProxyCampaign{
    public IProxyCampaign campaign;
    @Override
    public String createCampaign(User user, String nameCampaign) {
        if(campaign== null){
            campaign = new IProxyCampaign();
        }
        return campaign.createCampaign(user,nameCampaign);
    }
}
