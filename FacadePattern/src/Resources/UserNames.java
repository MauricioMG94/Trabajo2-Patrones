package Resources;

public enum UserNames {
    MAO94(new String[]{"Mauricio Martinez"}),
    JIM95(new String[]{"Jimena Rivas"}),
    JAV91(new String[]{"Javier Monsalve"});

    public String[] users;

    private UserNames(String[] userName) {
        this.users = userName;
    }

    public String[] getUsers() {
        return users;
    }

    public static String getUserName(String userId) {
        for (UserNames user : UserNames.values()) {
            if (user.name().equalsIgnoreCase(userId)) {
                return user.getUsers()[0];
            } else {
                return "Empleado no existe.";
            }
        }
        return null;
    }
}
