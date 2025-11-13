package se.lexicon.model;
import java.util.List;
import java.time.LocalDate;

public class Course {
    private static int sequencer = 0;
    private int id;
    private String courseName;
    private LocalDate startDate;
    private int weekDuration;
    private List<Student> students;

    public Course(int id, String courseName, LocalDate startDate, int weekDuration){
        this.id = sequencer++;
        this.courseName = courseName;
        this.startDate = startDate;
        this.weekDuration = weekDuration;

    }

    public int getId() {
        return id;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getWeekDuration() {
        return weekDuration;
    }

    public void setWeekDuration(int weekDuration) {
        this.weekDuration = weekDuration;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void register(Student student){
        students.add(student);

    }
    public void unregister(Student student) {

    }
}
