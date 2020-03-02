public class Runner {

    public static void main(String[] args) {
        School bhs = new School("Berkeley High School");

        Section maths = new Section("Math");
        Section biology = new Section("Biology");
        Section compsci = new Section("Computer Science");

        Teacher albi = new Teacher("Albinson", "Computer Science");
        Teacher henri = new Teacher("Henri", "Math");
        Teacher mb = new Teacher("M-B", "Biology");

        Student me = new Student("Nathan", 12);
        Student ben = new Student("Benjamin", 12);
        Student carly = new Student("Carolyn", 9);
        Student gina = new Student("Gina", 12);
        Student elena = new Student("Elena", 12);
        Student auden = new Student("Auden", 9);

        // School Settings:

        bhs.addSection(maths);
        bhs.addSection(biology);
        bhs.addSection(compsci);

        // Section Settings:

        biology.setTeacher(mb);
        maths.setTeacher(henri);
        compsci.setTeacher(albi);

        biology.addStudent(me);
        maths.addStudent(me);
        compsci.addStudent(me);

        biology.addStudent(ben);
        maths.addStudent(ben);
        compsci.addStudent(ben);

        biology.addStudent(gina);
        maths.addStudent(gina);
        compsci.addStudent(gina);

        biology.addStudent(carly);
        maths.addStudent(carly);
        compsci.addStudent(carly);

        biology.addStudent(elena);
        maths.addStudent(elena);
        compsci.addStudent(elena);

        biology.addStudent(auden);
        maths.addStudent(auden);
        compsci.addStudent(auden);

        // Student Settings:

        me.addSection(maths);
        me.addSection(biology);
        me.addSection(compsci);

        ben.addSection(maths);
        ben.addSection(biology);
        ben.addSection(compsci);

        carly.addSection(maths);
        carly.addSection(biology);
        carly.addSection(compsci);

        gina.addSection(maths);
        gina.addSection(biology);
        gina.addSection(compsci);

        elena.addSection(maths);
        elena.addSection(biology);
        elena.addSection(compsci);

        auden.addSection(maths);
        auden.addSection(biology);
        auden.addSection(compsci);

        // Teacher Settings:

        albi.addSection(maths);
        albi.addSection(biology);
        albi.addSection(compsci);

        henri.addSection(maths);
        henri.addSection(biology);
        henri.addSection(compsci);

        mb.addSection(maths);
        mb.addSection(biology);
        mb.addSection(compsci);

        // toSting()

        System.out.println(bhs.toString());         // 1
        System.out.println(maths.toString());       // 2
        System.out.println(biology.toString());     // 3
        System.out.println(compsci.toString());     // 4
        System.out.println(albi.toString());        // 5
        System.out.println(henri.toString());       // 6
        System.out.println(mb.toString());          // 7
        System.out.println(me.toString());          // 8
        System.out.println(carly.toString());       // 9
        System.out.println(ben.toString());         // 10
        System.out.println(gina.toString());        // 11
        System.out.println(elena.toString());       // 12
        System.out.println(auden.toString());       // 13

    }
}