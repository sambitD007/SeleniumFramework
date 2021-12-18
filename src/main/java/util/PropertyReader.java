package util;

import java.util.Properties;

public class PropertyReader {
    public static Properties properties = new Properties();

    public PropertyReader(){
    }

    public static String getEnvironmentData(String key){
        if(properties.getProperty(key)!=null){
            return properties.getProperty(key);
        }else{
            return "Environment variable is null";
        }
    }

}

