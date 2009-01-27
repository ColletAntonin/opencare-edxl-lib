package org.opencare.lib.model;

import java.util.Properties;

public final class Options {

  private final Properties properties = new Properties();
  
  ClassLoader getClassLoader() {
    return Thread.currentThread().getContextClassLoader();
  }
  
  public Options() {
    try {
      properties.load(
        getClassLoader().getResourceAsStream(
          "META-INF/config/capstore.properties"));
    } catch (Exception e) {}
  }
  
  public String getOption(String option, String defaultvalue) {
    String value = properties.getProperty(option);
    return value != null ? value : defaultvalue;
  }
  
}
