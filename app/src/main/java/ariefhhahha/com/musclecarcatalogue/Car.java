package ariefhhahha.com.musclecarcatalogue;

/*
* untuk mengambil data dari CarData.java dan mengirimkannya ke CardViewCarAdapter.java
* */

public class Car {

    private String name, id, brand;
    private int photo;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
