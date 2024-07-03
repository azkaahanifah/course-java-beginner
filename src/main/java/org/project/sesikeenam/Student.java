package org.project.sesikeenam;

public class Student {

    /**
     * Field/Attribute
     */
    private String name;

    private String major;

    private int graduateYear;

    /**
     * GETTER & SETTER
     * 1. GETTER : untuk mengambil nilai yang ada di attribute
     * 2. SETTER : untuk mengassign atau mengubah nilai attribute
     */

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String newMajor) {
        this.major = newMajor;
    }

    public int getGraduateYear() {
        return this.graduateYear;
    }

    public void setGraduateYear(int newGraduateYear) {
        this.graduateYear = newGraduateYear;
    }

    /**
     * Default Constructor
     */
    public Student() {

    }

    /**
     * Constructor Parameterized
     * - Constructor Overloading -> konsepnya mirip seperti Method Overloading
     */
    public Student(String name) {
        this.name = name;
   }

    public Student(int graduateYear) {
        this.graduateYear = graduateYear;
   }

    public Student(String name, String major, int graduateYear) {
        this.name = name;
        this.major = major;
        this.graduateYear = graduateYear;
    }

}
