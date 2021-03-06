package org.tsedneva.tasks.plantsconverter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public final class FileHelper {

    public String getFilePathToSave() throws PropertiesFileException{
        Properties prop = new Properties();

        String result = "";
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("project.properties")) {
            prop.load(inputStream);
            result = prop.getProperty("app.basedir");

        } catch (IOException exception) {
            throw new PropertiesFileException();
        }
        return result;
    }
}
