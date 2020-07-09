package org.tsedneva.tasks.plantsconverter;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

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

        } catch (Exception exception) {
            logger.error("Error convering", exception);
        }
    }
}
