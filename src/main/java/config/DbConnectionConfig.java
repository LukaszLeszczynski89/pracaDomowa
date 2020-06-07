package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionConfig {

    private static final String H2_DB_URL = "jdbc:h2:tcp://localhost/~/db/jdbc-database";
    private static DbConnectionConfig instance;

    private Connection dbConnection;

    private DbConnectionConfig() {

        // It shouldn't be needed
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static DbConnectionConfig getInstance() {
        if (null == instance) {
            instance = new DbConnectionConfig();
        }

        return instance;
    }

    public Connection getConnection() {
        if (null == dbConnection) {
            try {
                dbConnection = DriverManager.getConnection(H2_DB_URL, "Lukas", "");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return dbConnection;
    }

}
