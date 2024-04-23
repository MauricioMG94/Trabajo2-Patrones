public class IProxyCampaign implements ProxyCampaign {

    public void ProxyCampaign(User user){
        System.out.println("Iniciando proxy para la creacion de campañas de ventas con usuario: "+user.getName()+" rol "+user.getRolUser());
    }
    @Override
    public String createCampaign(User user, String nameCampaign) {
        ProxyCampaign(user);
        String messageResult = "";
        if(user.getRolUser().equals("admin")){
            messageResult= "El usuario: "+user.getName()+" es autorizado con rol: "+user.getRolUser()+" para crear campaña: "+nameCampaign;
        }else{
            messageResult = "El usuario: "+user.getName()+" no es autorizado con rol: "+user.getRolUser()+" para crear campaña: "+nameCampaign;
        }
        return messageResult;       
    }
}
