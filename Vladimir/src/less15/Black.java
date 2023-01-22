package src.less15;

public class Black {
    public int id;

    public Black(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    Black[] blacks = new Black[1];

    public Black black(int id) throws EntityNotFoundException {
        final Black black = new Black(1);
        black.id = 10;
        blacks[0] = black;

        for (int i = 0; i < blacks.length; i++) {
            if (blacks[i].id == this.id) {
                return blacks[i];
            }
        }
        throw new EntityNotFoundException("Black not exist");
    }

}
