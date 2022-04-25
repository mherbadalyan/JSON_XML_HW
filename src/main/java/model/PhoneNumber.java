package model;

import java.util.Objects;

public class PhoneNumber {
    private String number;
    private PhoneNumberType type;

    public PhoneNumber() {
    }

    public PhoneNumber(String number, PhoneNumberType type) {
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneNumberType getType() {
        return type;
    }

    public void setType(PhoneNumberType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(number, that.number) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type);
    }

    @Override
    public String toString() {
        return "model.PhoneNumber{" +
                "number='" + number + '\'' +
                ", type=" + type +
                '}';
    }
}
