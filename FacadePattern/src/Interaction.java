import Resources.OfficeCodes;
import Resources.UserNames;
import java.time.LocalDate;

public class Interaction {

    public void interactionCreate (String userId, String officeName, String status, String observations){

        LocalDate record_date = LocalDate.now();
        String userName = UserNames.getUserName(userId);
        String office_code = getOfficeCode(officeName);

        System.out.println("Interacción creada: " +
                "\nEmpleado: " + userName +
                "\nNombre Oficina: " + officeName +
                "\nCódigo Oficina: " + office_code +
                "\nEstado: " + status +
                "\nObservaciones: " + observations +
                "\nFecha de creación: " + record_date)
        ;
    }

    public static String getOfficeCode(String officeName) {
        for (OfficeCodes office_name : OfficeCodes.values()) {
            for (String office : office_name.getOffices()) {
                if (office.equalsIgnoreCase(officeName)) {
                    return office_name.name();
                }
            }
        }
        return null;
    }
}
