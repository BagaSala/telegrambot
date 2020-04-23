package com.github.bagasala;

import com.j256.ormlite.jdbc.JdbcPooledConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

public class DatabaseConfiguration {
    private static final String DB_URL = "jdbc:sqlite:/Users/bogdan/Desktop/mncDB.db";
    public static ConnectionSource source;

    static {
        try {
            source = new JdbcPooledConnectionSource(DB_URL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
