package xml;

import model.Address;
import model.Employee;
import model.PhoneNumber;
import model.PhoneNumberType;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;



import java.io.File;
import java.util.ArrayList;


public class ToXML {
    public static void main(String[] args) {
       JAXBContext jaxbContext =null;
        try {
            jaxbContext = JAXBContext.newInstance(Employee.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

            Employee employee = new Employee(
                    "Mher","Badalyan",28,
                    new Address(0064,"Armenia","Yerevan","Silikyan"),
                    new ArrayList<>() {{
                        add(new PhoneNumber("055-55-71-21", PhoneNumberType.MOBILE));
                        add(new PhoneNumber("099-977-972",PhoneNumberType.MOBILE));
                    }});
            marshaller.marshal(employee,new File("employee.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
