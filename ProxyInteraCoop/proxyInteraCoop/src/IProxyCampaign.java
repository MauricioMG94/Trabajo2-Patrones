public class IProxyCampaign implements ProxyCampaign {

    public Cooperativa campaign;

    public void ProxyCampaign(User user){
        System.out.println("Iniciando proxy para la creacion de campañas de ventas con usuario: "+user.getName()+" rol "+user.getRolUser());
    }
    @Override
    public String createCampaign(User user, String nameCampaign) {
        ProxyCampaign(user);
        if(campaign== null){
            campaign = new Cooperativa();
        }
        return campaign.createCampaign(user,nameCampaign);
    }
}
