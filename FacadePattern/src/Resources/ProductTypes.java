package Resources;

public enum ProductTypes {
    ACTIVOS(new String[]{"Cuenta de ahorros", "Cuenta corriente", "CDT"}),
    PASIVOS(new String[]{"Préstamo personal", "Préstamo Hipotecario", "Tarjeta de crédito"}),
    TRANSACCIONALES(new String[]{"Tarjeta débito", "Banca en línea", "Banca móvil"});

    public String[] products;

    private ProductTypes(String[] products) {
        this.products = products;
    }

    public String[] getProducts() {
        return products;
    }
}
