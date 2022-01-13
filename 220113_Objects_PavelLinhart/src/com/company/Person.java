package com.company;

/*
### Person class
Implement the Person <code>abstract</code> class. It should contain:
- two String <codename</code>, <code>address</code>
- non-arguments constructor which will set <code>name</code>, <code>address</code> fields as empty
  strings
- two-arguments constructor: <code>String name</code>, <code>String address</code>
- <code>getter</code> methods which will be responsible for returning <code>name</code>, <code>address</code> fields values
- <code>setter</code> methods which will be responsible for setting <code>name</code>, <code>address</code> fields values
- <code>toString</code> method which should return string in the following format: <code>?->?</code>,
  where <code>?</code> is the name and adress value accordingly
 */

public abstract class Person {
    private String name;
    private String address;

    public Person() {
        this.name = "";
        this.address = "";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return name + ", Address: " + address;
    }
}
