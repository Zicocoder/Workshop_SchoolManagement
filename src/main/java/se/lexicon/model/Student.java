package se.lexicon.model;

import java.util.Objects;

public class Student {
    private static int sequencer = 0;
    private int id;
    private String name;
    private String email;
    private String adress;

    public Student(String name, String email, String adress) {
        setName(name);
       setEmail(email);
        setAdress(adress);
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(email, student.email) && Objects.equals(adress, student.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, adress);
    }
}

