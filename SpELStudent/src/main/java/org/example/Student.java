package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Student {
    @Value("#{120}")
    public int id;
    @Value("#{new java.lang.String('Thomas')}")
    public String name;
    @Value("#{T(java.util.Arrays).asList(new org.example.Phone('999-888-7777'), new org.example.Phone('111-222-3333'))}")
    public List<Phone> ph;
    @Value("#{new org.example.Address('Dallas', 'TX', 'USA', '12345')}")
    public Address add;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }
}
