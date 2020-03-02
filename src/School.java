import java.util.Arrays;

public class School {
    /*
        -name:String                            [X]
        -sections:Section[] = new Section[200]  [X]
        -sectionCount: int                      [X]
        --------------------------------------
        +getName():String                       [X]
        +setName(String n): void                [X]
        +addSection(Section s); void            [X]
        +getSections():Section[]                [X]
    */

    private String name;
    private Section[] sections = new Section[200];
    private int sectionCount = 0;

    public School (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSection(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }

    @Override
    public String toString() {
        return "The school named " + name + " has " + sectionCount + " sections.";
    }
}
