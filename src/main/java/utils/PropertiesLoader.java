package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {
    private static Properties properties;
    private static String propertiesFileName = String.format("properties/configuration.properties");

    private PropertiesLoader() {
    }

    public static Properties loadProperties() {

        if (properties == null) {
            properties = new Properties();

            try {
                properties.load(new FileInputStream(propertiesFileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }

    public static String getProperty(String key) {
        String propertyValue = loadProperties().getProperty(key);
        return propertyValue;
    }

}
