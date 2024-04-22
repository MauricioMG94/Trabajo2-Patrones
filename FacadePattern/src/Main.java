public class Main {
    public static void main(String[] args) {
        Facade system = new Facade();

        String userId = "MAO94";
        String productName = "Cuenta de ahorros";
        String clientId = "CLI002";
        String officeName = "Centro";
        String status = "Vigente";
        String observations = "Cliente interesado en cuenta de ahorros de nómina.";

        system.opportunityAndInteractionCreate(userId, productName, clientId, officeName, status, observations);


    }
}