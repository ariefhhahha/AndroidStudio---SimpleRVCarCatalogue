package ariefhhahha.com.musclecarcatalogue;

/*
* untuk menyiapkan data yang akan diambil dan ditampillkan.
* */

import java.util.ArrayList;

public class CarData {

    public static String[][] data = new String [][] {
            {"c1", "Mustang", "Ford"},
            {"c2", "Camaro", "Chevrolet"},
            {"c3", "Challenger", "Dodge"},
            {"c4", "Charger", "Dodge"},
            {"c5", "300C", "Chrysler"},
            {"c6", "CTS-V", "Cadillac"}
    };
    public static int[] carImg = {R.drawable.mustang, R.drawable.camaro, R.drawable.challenger, R.drawable.charger, R.drawable.chrysler, R.drawable.cts_v};

    public static ArrayList<Car> getListData() {
        Car car = null;
        ArrayList<Car> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            car = new Car();
            car.setId(data[i][0]);
            car.setName(data[i][1]);
            car.setBrand(data[i][2]);
            car.setPhoto(carImg[i]);

            list.add(car);
        }

        return list;
    }
}
