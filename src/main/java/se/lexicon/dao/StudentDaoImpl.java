package se.lexicon.dao;

import jdk.internal.org.commonmark.node.Link;
import se.lexicon.model.Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{

    private List<Student>  students = new LinkedList<>();

    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student findByEmail(String email) {
        for (Student student : students){
            if (student.getEmail().equalsIgnoreCase(email)){
                return student;
            }
        }
        return null;

    }

    @Override
    public List<Student> findByName(String name) {
        List<Student> studentFound = new LinkedList<>();
        for (Student student : students) {
            if (student.getEmail().equalsIgnoreCase(name)) {
                studentFound.add(student);

            }
        }
        if (!studentFound.isEmpty()){
            return studentFound;
        }
        else {
            return null;
        }

    }
    @Override
    public Student findByid(int id) {
        for (Student student : students) {
            if (student.getId() == id){
                return student;
            }

            }
       return null;
        }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public boolean delete(Student student) {
        return students.removeIf(o -> o.equals(student));
    }
}