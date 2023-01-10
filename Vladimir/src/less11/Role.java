package src.less11;

public enum Role {
    STUDENT(1),
    TEACHER(2);
    private int id;

    Role() {
    }

    Role(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
