package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Marks this class as a JPA Entity
// This class will be mapped to a database table
@Entity
public class Teacher {

    // Marks this field as the Primary Key of the table
    @Id
    private int id;

    // Column to store teacher name
    private String name;

    // Column to store teacher age
    private int age;


    // -------------------------------
    // Getter for id
    // Used to retrieve the primary key value
    // -------------------------------
    public int getId() {
        return id;
    }

    // Setter for id
    // Used to assign primary key value
    public void setId(int id) {
        this.id = id;
    }


    // -------------------------------
    // Getter for name
    // -------------------------------
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }


    // -------------------------------
    // Getter for age
    // -------------------------------
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}