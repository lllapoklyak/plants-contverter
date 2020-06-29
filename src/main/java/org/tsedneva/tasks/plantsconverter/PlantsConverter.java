package org.tsedneva.tasks.plantsconverter;

import com.google.gson.Gson;
import java.io.FileOutputStream;
import java.io.Reader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.tsedneva.tasks.plantsconverter.entities.Plants;

/** Converts Plants JSON to XML. */
public final class PlantsConverter {

    private PlantsConverter() {
    }

    /** Converts JSON reader -> {@link Plants}. */
    public static Plants fromJson(Reader reader) {
        return (new Gson()).fromJson(reader, Plants.class);
    }

    /** Converts {@link Plants} -> XML. */
    public static void toXml(FileOutputStream output, Plants plants) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Plants.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(plants, output);
    }
}
