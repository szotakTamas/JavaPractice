package common.sql;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {
    private static ComboPooledDataSource cpds = new ComboPooledDataSource();

    static {
        try {
            cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
            cpds.setJdbcUrl("jdbc:mysql://javalearning.cgzy1ncl0xwr.eu-west-1.rds.amazonaws.com:3306/ubi_schema?enabledTLSProtocols=TLSv1.2");
            cpds.setUser("spangli");
            cpds.setPassword("evildevil21");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return cpds.getConnection();
    }

}
