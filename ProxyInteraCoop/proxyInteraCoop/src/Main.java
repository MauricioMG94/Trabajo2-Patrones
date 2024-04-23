public class Main {

    public static void main(String[] args) {

        User user1 = new User("employee","Jose");
        User user2 = new User("admin","Josefa");

        IProxyCampaign createCampaign1 = new IProxyCampaign();
        System.out.println(createCampaign1.createCampaign(user1, "Credito hipotecario con tasa de 1.5%"));

        System.out.println("-----------------------------Creando otra oferta-------------------------------------");

        IProxyCampaign createCampaign2 = new IProxyCampaign();
        System.out.println(createCampaign2.createCampaign(user2, "Credito hipotecario con tasa de 2%"));

    }
}