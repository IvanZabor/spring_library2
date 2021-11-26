package springMVC2.models;

public class Lib {
    private int id;
    private String name;
    private String dateAdded;
    private boolean available;

    public Lib() {

    }

    public Lib(int id, String name, String dateAdded, boolean available) {
        this.id = id;
        this.name = name;
        this.dateAdded = dateAdded;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public boolean getAvailable() {
        return available;
    }


    public void setAvailable(boolean available) {
        this.available = available;
    }
}
