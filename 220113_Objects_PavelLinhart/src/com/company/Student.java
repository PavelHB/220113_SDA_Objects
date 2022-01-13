package com.company;
/*
### Student class
Implement the <code>Student</code> class. It should extend the <code>Person</code> class.
Implementation should meet the below criteria:
- three fields: type of study, year of study, study price
- three-arguments constructor: type of study, year of study, study price
- <code>getter</code> methods which will be responsible for returning declared fields
- <code>setter</code> methods which will be responsible for setting declared fields
- <code>toString</code> method which should return details information about a student
 */

public class Student extends Person {
    private String typeOfStudy;
    private int yearOfStudy;
    private int studyPrice;

    public Student(String typeOfStudy, int yearOfStudy, int studyPrice) {
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.studyPrice = studyPrice;
    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getStudyPrice() {
        return studyPrice;
    }

    public void setStudyPrice(int studyPrice) {
        this.studyPrice = studyPrice;
    }

    @Override
    public String toString() {
        return "Student: "+super.toString()+"\nType of study: "+ typeOfStudy +
                ",Year of study: " + yearOfStudy +", Study price: " + studyPrice;
    }
}

