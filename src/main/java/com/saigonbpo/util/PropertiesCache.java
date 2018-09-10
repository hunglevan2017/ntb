package com.saigonbpo.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

/**
 * Created by hunglv on 17/03/2018.
 */
public class PropertiesCache {

    private final Properties properties = new Properties() ;

    private PropertiesCache(){
        //Private Contructor to restrict new instances
    	
    	ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    	InputStream in = classLoader.getResourceAsStream("config.properties");
    	
       // InputStream in = this.getClass().getClassLoader().getResourceAsStream("/com/bpo/upload/config.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Solution for singleton pattern
    private static class LazyHolder {
        private static final PropertiesCache INSTANCE = new PropertiesCache();
    }

    public static PropertiesCache getInstance() {
        return LazyHolder.INSTANCE;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public Set<String> getAllPropertyNames(){
        return properties.stringPropertyNames();
    }

    public boolean containsKey(String key){
        return properties.containsKey(key);
    }

    public void setProperty(String key, String value){
        properties.setProperty(key, value);
    }

}
