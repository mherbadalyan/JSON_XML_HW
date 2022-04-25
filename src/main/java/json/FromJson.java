package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Employee;

import java.io.FileReader;
import java.io.IOException;

public class FromJson {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().create();
        Employee employee;
        try (FileReader reader = new FileReader("employee.json")){
            employee = gson.fromJson(reader,Employee.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(employee);
    }
}
