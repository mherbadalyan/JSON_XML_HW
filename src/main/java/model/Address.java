package model;

import java.util.Objects;

public class Address {
    private String country;
    private String city;
    private String street;
    private int postalCode;

    public Address() {
    }

    public Address(int postalCode , String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        street = street;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return postalCode == address.postalCode && Objects.equals(country, address.country) && Objects.equals(city, address.city) && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, street, postalCode);
    }

    @Override
    public String toString() {
        return "model.Address " +
                "country = " + country + '\'' +
                ", city = " + city + '\'' +
                ", street = " + street + '\'' +
                ", postalCode = " + postalCode +
                '}';
    }
}
