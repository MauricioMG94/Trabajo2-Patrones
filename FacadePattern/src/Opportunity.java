import Resources.ClientsDB;
import Resources.UserNames;

public class Opportunity {
    public void opportunityCreate (String userId, String productName, String clientId){

        String clientName = getClientName(clientId);
        String userName = UserNames.getUserName(userId);

        System.out.println("Oportunidad creada: " +
                "\nEmpleado: " + userName +
                "\nCliente: " + clientName +
                "\nProducto: " + productName )
        ;
    }

    public static String getClientName(String clientId) {
        for (ClientsDB client : ClientsDB.values()) {
            if (client.name().equalsIgnoreCase(clientId)) {
                return client.getClients()[0];
            }        }
        return null;
    }
}
