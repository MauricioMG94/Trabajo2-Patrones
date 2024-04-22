package Resources;

public enum CurrentCampaigns {
    DOCENTES_CREDITOS(new String[]{"Préstamo personal", "Préstamo Hipotecario", "Tarjeta de crédito"}),
    GOBERNACION_NOMINA(new String[]{"Cuenta de ahorros", "Cuenta corriente"}),
    MILITARES_HIPOTECARIO(new String[]{"Préstamo Hipotecario"});

    private String[] campaigns;

    private CurrentCampaigns(String[] campaigns) {
        this.campaigns = campaigns;
    }

    public String[] getCampaigns() {
        return campaigns;
    }
}
