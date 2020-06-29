package org.tsedneva.tasks.plantsconverter;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.tsedneva.tasks.plantsconverter.entities.Plants;

/** Entry point for Plants Converter. */
public final class App {

    private App() {
    }

    /** Main entry point. */
    public static void main(String[] args) {
        System.out.println("Start plants converting...");

        try {
            FileHelper helper = new FileHelper();
            String appBaseDir = helper.getFilePathToSave();

            Plants plants = PlantsConverter.fromJson(Files.newBufferedReader(Paths.get(appBaseDir, "plants.json")));

            FileOutputStream output = new FileOutputStream(Paths.get(appBaseDir, "plants.xml").toString());
            PlantsConverter.toXml(output, plants);
            output.close();

            System.out.println("End convering.");

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
