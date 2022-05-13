
package com.company;

        import javax.xml.bind.JAXBContext;
        import javax.xml.bind.JAXBException;
        import javax.xml.bind.Marshaller;
        import javax.xml.bind.Unmarshaller;
        import java.io.File;

public class xml {
    public static void XmlWrite(String filename)
    {
        try {
            File file = new File(filename);
            JAXBContext context = JAXBContext.newInstance(person.class);
            Marshaller marshaller = context.createMarshaller();
            person person2 = new person(21, "moricifosatar");
            marshaller.marshal(person2, file);

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
    public static void XmlRead(String filename)
    {   System.out.println("Информация из XML-файла:");
        try {
            File file = new File(filename);
            JAXBContext context = JAXBContext.newInstance(person.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            person person3 = (person) unmarshaller.unmarshal(file);
            System.out.println(person3);

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }}
}
