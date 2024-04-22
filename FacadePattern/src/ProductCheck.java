import Resources.ProductTypes;

public class ProductCheck {

    public void checkProductType (String productName){
        String productType = getProductType(productName);

        if (productType == null) {
            System.out.println("Tipo de producto: " + "No clasificado");
        } else {
            System.out.println("Tipo de producto: " + productType);
        }
    }

    public static String getProductType(String productName) {
        for (ProductTypes type : ProductTypes.values()) {
            for (String product : type.products) {
                if (product.equalsIgnoreCase(productName)) {
                    return type.name();
                }
            }
        }
        return null;
    }
}
