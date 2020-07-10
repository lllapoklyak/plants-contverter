package org.tsedneva.tasks.plantsconverter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.JAXBException;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.tsedneva.tasks.plantsconverter.entities.Plants;

/** Entry point for Plants Converter. */
public final class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    private App() {
    }

    /** Main entry point. */
    public static void main(String[] args) {
        logger.info("Start plants converting.");

        try {
            FileHelper helper = new FileHelper();
            String appBaseDir = helper.getFilePathToSave();

            Plants plants = PlantsConverter.fromJson(Files.newBufferedReader(Paths.get(appBaseDir, "plants.json")));

            FileOutputStream output = new FileOutputStream(Paths.get(appBaseDir, "plants.xml").toString());
            PlantsConverter.toXml(output, plants);
            output.close();

            logger.info("End converting.");

        } catch (IOException exception) {
            logger.error("Error with reading/writing file");
        } catch (PropertiesFileException exception) {
            logger.error("Error reading project properties file");
        } catch (JsonSyntaxException | JsonIOException exception) {
            logger.error("Error parsing JSON");
        } catch (JAXBException exception) {
            logger.error("Error saving XML");

        }
    }
}
