import java.util.Arrays;

public class Teacher extends Person{

    //Teacher needs:
    // subject: String      [X]
    // sections: Sections[] [X]
    // sectionCount: int    [X]
    // --------------------
    // getSubject           [X]
    // setSubject           [X]
    // getSections          [X]
    // addSection           [X]

    private String subject;
    private Section[] sections = new Section[10];
    private int sectionCount = 0;

    public Teacher (String name, String subject) {
        super(name);
        this.subject = subject;

    }

    public String getSubject() {
        return subject;

    }

    public void setSubject(String n) {
        this.subject = n;

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
            names += sections[i].getName() + " (" + sections[i].getCurrentSize() + "), ";
        }
        return names;
    }

    @Override
    public String toString() {
        return name + " teaches the following sections: " + sectionNames() + "and that's it.";
    }
}
