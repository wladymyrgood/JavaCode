package src.less10;

public class Lection extends Material {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public boolean setId(int id) {
        this.id = id;
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lection{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
