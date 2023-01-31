package authright.java.util;

import java.sql.*;

public class MySQLTest {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:4306/RUNOOB";

    static final String User = "root";
    static final String PASS = "Work@2021";

    public void createConnection() throws SQLException, ClassNotFoundException {
        Class.forName(JDBC_DRIVER);

        Connection conn = DriverManager.getConnection(DB_URL,User,PASS);

    }

}
