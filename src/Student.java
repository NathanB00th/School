import java.util.Arrays;

public class Student extends Person{

    //Student needs:
    // sections: Section [] = new Section[10] [X]
    // grade: int                             [X]
    // sectionCount: int                      [X]
    // --------------------------------------
    // getName                                [X]
    // setName                                [X]
    // getSections                            [X]
    // addSection                             [X]

    private int grade;
    private int sectionCount = 0;
    private Section[] sections = new Section[10];

    public Student (String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;

    }

    public void setGrade(int g) {
        this.grade = g;

    }

    public Section[] getSections() {
        return sections;

    }

    public void addSection(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }

    public String sectionNames() {
        String names = "";
        for (int i = 0; i < sectionCount; i++) {
            names += sections[i].getName() + " (" + sections[i].getTeacher().getName() + "), ";
        }
        return names;
    }

    @Override
    public String toString() {
        return name + " is in " + grade + "th grade and is enrolled in the following sections "
                + sectionNames() + "and that's all.";
    }
}