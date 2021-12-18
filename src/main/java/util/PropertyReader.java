package util;

import java.io.*;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyReader {
    public static Properties properties = new Properties();

    public PropertyReader() throws Exception {

    }

    public static String getEnvironmentData(String key) throws IOException {
        String folderPath = System.getProperty("user.dir");
        FileInputStream stream = new FileInputStream(Paths.get(folderPath+ "/config.properties").toFile());
        properties.load(stream);
        if(properties.getProperty(key)!=null){
            return PropertyReader.properties.getProperty(key);
        }else{
            return "Environment variable is null";
        }
    }

}

