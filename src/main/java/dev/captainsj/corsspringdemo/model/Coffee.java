package dev.captainsj.corsspringdemo.model;


public class Coffee {
    private Integer id;
    private String name;
    private Size size;

    public Coffee() {

    }

    public Coffee(Integer id, String name, Size size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
