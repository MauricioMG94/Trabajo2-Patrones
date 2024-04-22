package Resources;

public enum OfficeCodes {
    OFI001(new String[]{"Centro"}),
    OFI002(new String[]{"Estación"}),
    OFI003(new String[]{"Centenario"});

    public String[] offices;

    private OfficeCodes(String[] offices
    ) {
        this.offices = offices;
    }

    public String[] getOffices() {
        return offices;
    }

}
