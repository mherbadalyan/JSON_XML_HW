package model;

import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.*;
import java.util.List;
import java.util.Objects;
@XmlRootElement(name = "employeeXML")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
    @XmlElement
    private int age;
    @XmlElement
    private String firstName;
    @XmlElement
    private String lastName;
    @XmlElement
    private Address address;
    @XmlElement
    private List<PhoneNumber> phoneNumberList;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int age, Address address, List<PhoneNumber> phoneNumberList) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumberList = phoneNumberList;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public  List<PhoneNumber> getPhoneNumberList() {
        return phoneNumberList;
    }

    public void setPhoneNumberList(List<PhoneNumber> phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(address, employee.address) && Objects.equals(phoneNumberList, employee.phoneNumberList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, lastName, address, phoneNumberList);
    }

    @Override
    public String toString() {
        return "model.Employee{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", phoneNumberList=" + phoneNumberList +
                '}';
    }
}
