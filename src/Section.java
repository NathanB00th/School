import java.util.Arrays;

public class Section {

    //Section needs:
    // teacher: Teacher          [X]
    // students: new Student[50] [X]
    // name: String              [X]
    // currentSize: int          [X]
    // -------------------------
    // getTeacher                [X]
    // setTeacher                [X]
    // getStudent                [X]
    // getName                   [X]
    // setName                   [X]
    // addStudent                [X]

    @Override
    public String toString() {
        return name + " is taught by " + teacher.getName() + " and has " + currentSize  +
                " students: " + studentNames();
    }

    private String name;
    private Teacher teacher;
    private int currentSize = 0;
    private Student[] students = new Student[50];



    public Section (String name) {
        this.name = name;

    }

    public String studentNames() {
        String names = "";
        for (int i = 0; i < currentSize; i++) {
            names += students[i].getName() + ", ";
        }
        return names;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public Teacher getTeacher() {
        return teacher;

    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;

    }

    public void addStudent (Student s) {
        students[currentSize] = s;
        currentSize++;
    }

    public Student[] getStudents() {
        return students;

    }

    public int getCurrentSize() {
        return currentSize;

    }

}