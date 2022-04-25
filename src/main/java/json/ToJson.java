package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Address;
import model.Employee;
import model.PhoneNumber;
import model.PhoneNumberType;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ToJson {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<PhoneNumber> list = new ArrayList<>();
        list.add(new PhoneNumber("055-55-71-21",PhoneNumberType.MOBILE));
        list.add(new PhoneNumber("099-977-972",PhoneNumberType.MOBILE));

        Employee employee = new Employee(
                "Suren","Badalyan",28,
                new Address(0064,"Armenia","Yerevan","Silikyan"),
                list);

        try (FileWriter writer = new FileWriter("phoneNumber.json");){
            gson.toJson(list,writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
