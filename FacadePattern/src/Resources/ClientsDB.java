package Resources;

public enum ClientsDB {

    CLI001(new String[]{"Eduardo Angarita"}),
    CLI002(new String[]{"Andrea Acosta"}),
    CLI003(new String[]{"Ramona Martinez"});

    public String[] clients;

    private ClientsDB(String[] clients) {
        this.clients = clients;
    }

    public String[] getClients() {
        return clients;
    }

}
