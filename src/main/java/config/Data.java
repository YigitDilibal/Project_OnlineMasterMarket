package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Data {

    private static Properties properties;

    static {
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/data.properties");
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Data file could not be loaded!");
        }
    }

    public static String getData(String key) {
        return properties.getProperty(key);
    }


}
