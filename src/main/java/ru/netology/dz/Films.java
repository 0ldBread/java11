package ru.netology.dz;
public class Films {
    private int id;
    private String posterName;

    public Films(int id, String posterName) {
        this.id = id;
        this.posterName = posterName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosterName() {
        return posterName;
    }

    public void setPosterName(String posterName) {
        this.posterName = posterName;
    }


}
