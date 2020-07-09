package org.tsedneva.tasks.plantsconverter;

import com.google.gson.Gson;
import java.io.FileOutputStream;
import java.io.Reader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.tsedneva.tasks.plantsconverter.entities.Plants;

/** Converts Plants JSON to XML. */
public final class PlantsConverter {

    private static final Logger logger = LogManager.getLogger(PlantsConverter.class);

    private PlantsConverter() {
    }

    /** Converts JSON reader -> {@link Plants}. */
    public static Plants fromJson(Reader reader) {
        logger.info("Start converting JSON to entities.");
        Plants plants = (new Gson()).fromJson(reader, Plants.class);
        logger.info("End converting JSON to entities.");

        return plants;
    }

    /** Converts {@link Plants} -> XML. */
    public static void toXml(FileOutputStream output, Plants plants) throws JAXBException {
        logger.info("Strart converting entities to XML.");
        JAXBContext context = JAXBContext.newInstance(Plants.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(plants, output);
        logger.info("End converting entities to XML.");
    }
}
