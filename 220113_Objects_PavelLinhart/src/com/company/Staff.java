package com.company;
/*
### Staff class
Implement the <code>Lecturer</code> class. It should extend the <code>Person</code> class.
Implementation should meet the below criteria:
- two fields: specialization, salary
- two-arguments constructor: specialization, salary
- <code>getter</code> methods which will be responsible for returning declared fields
- <code>setter</code> methods which will be responsible for setting declared fields
- toString method which should return details information about a lecturer
 */

public class Staff extends Person{
    private String specialization;
    private int salary;

    public Staff(String specialization, int salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecture: "+super.toString()+
                "\nSpecialization: " + specialization +", Salary: " + salary;
    }
}
