package bloqueStatic;

public class ConfigurationDB {

    static final String URL;
    static final String USER;

    static {
        USER = "jmcadev";
        URL = "jdbc:mysql://localhost:3306/";
        System.out.println("Configuracion cargada...");
    }

    public static void main (String[] args) {
        System.out.println(URL);
        System.out.println(USER);
    }

}
