public class Person {

    //Person needs:
    // name: String [X]
    // id: int      [X]
    // nextId: int  [X]
    // ------------
    // getName      [X]
    // setName      [X]
    // getId        [X]
    // setId        [X]

    protected String name;
    private int id;
    private static int nextId = 0;

    public Person (String name) {
        this.name = name;
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;

    }

    public int getId() {
        return id;

    }

    public void setName(String name) {
        this.name = name;

    }

    public void setId(int id) {
        this.id = id;

    }

}
