public class Cooperativa implements ProxyCampaign{

    @Override
    public String createCampaign(User user, String nameCampaign) {
        String messageResult = "";
        if(user.getRolUser().equals("admin")){
            messageResult= "El usuario: "+user.getName()+" es autorizado con rol: "+user.getRolUser()+" para crear campaña";
        }else{
            messageResult = "El usuario: "+user.getName()+" no es autorizado con rol: "+user.getRolUser()+" para crear campaña";
        }
        return messageResult;
    }
}
