package org.example.task2.Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static final String CONFIGFILE = "src/main/java/org/example/task2/Config/config.properties";

    public static String get(String query) {
        try (FileInputStream PROPSINPUT = new FileInputStream(CONFIGFILE)) {
            Properties properties = new Properties();
            properties.load(PROPSINPUT);
            return properties.getProperty(query);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
