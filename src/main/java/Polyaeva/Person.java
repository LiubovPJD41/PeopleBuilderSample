package Polyaeva;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age;
    protected String address;
    //...

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;     //...
    }

    public Person(String name, String surname, Integer age) {
        this(name, surname);
        this.age = age;//...
    }


    public boolean hasAge() {
        return age != null; /*...*/
    }

    public boolean hasAddress() {
        return address != null; /*...*/
    }

    public String getName() {
        return name;/*...*/
    }

    public String getSurname() {
        return surname;  /*...*/
    }

    public Integer getAge() {
        return age; /*...*/
    }

    public String getAddress() {
        return address;/*...*/
    }

    public void setAddress(String address) {
        this.address = address; /*...*/
    }

    public void happyBirthday() {
        if (this.hasAge()) {
            this.age++;  /*...*/
        }
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(address);    /*...*/
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}


