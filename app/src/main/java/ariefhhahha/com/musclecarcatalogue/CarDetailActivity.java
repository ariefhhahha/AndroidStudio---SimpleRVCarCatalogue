package ariefhhahha.com.musclecarcatalogue;

/*
* buat menampilkan detail mobil yang dipilih oleh pengguna dari cardview yang tadi.
* */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CarDetailActivity extends AppCompatActivity {

    public static String CAR_ID = "car_id";
    public static String CAR_NAME = "car_name";
    public String carName;
    public String carId;

    private ImageView imgCar;
    private TextView tvCarName;
    private TextView tvCarBrand;
    private TextView tvCarEngine;
    private TextView tvCarPower;
    private TextView tvCarTorque;
    private TextView tvCarDesc;
    private TextView tvCarPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_detail);

        imgCar = findViewById(R.id.img_car);
        tvCarName = findViewById(R.id.tv_car_name);
        tvCarBrand = findViewById(R.id.tv_car_brand);
        tvCarEngine = findViewById(R.id.tv_car_engine);
        tvCarPower = findViewById(R.id.tv_car_hp);
        tvCarTorque = findViewById(R.id.tv_car_torque);
        tvCarDesc = findViewById(R.id.tv_car_desc);
        tvCarPrice = findViewById(R.id.tv_car_price);

        carId = getIntent().getStringExtra(CAR_ID);
        carName = getIntent().getStringExtra(CAR_NAME);

        if (carId.equals("c1")) {
            carName = "Mustang";
            imgCar.setImageResource(R.drawable.mustang);
            tvCarName.setText(R.string.car_name_c1);
            tvCarBrand.setText(R.string.car_brand_c1);
            tvCarEngine.setText(R.string.car_engine_c1);
            tvCarPower.setText(R.string.car_hp_c1);
            tvCarTorque.setText(R.string.car_torque_c1);
            tvCarDesc.setText(R.string.car_desc_c1);
            tvCarPrice.setText(R.string.car_price_c1);

        } else if (carId.equals("c2")) {
            imgCar.setImageResource(R.drawable.camaro);
            tvCarName.setText(R.string.car_name_c2);
            tvCarBrand.setText(R.string.car_brand_c2);
            tvCarEngine.setText(R.string.car_engine_c2);
            tvCarPower.setText(R.string.car_hp_c2);
            tvCarTorque.setText(R.string.car_torque_c2);
            tvCarDesc.setText(R.string.car_desc_c2);
            tvCarPrice.setText(R.string.car_price_c2);

        } else if (carId.equals("c3")) {
            imgCar.setImageResource(R.drawable.challenger);
            tvCarName.setText(R.string.car_name_c3);
            tvCarBrand.setText(R.string.car_brand_c3);
            tvCarEngine.setText(R.string.car_engine_c3);
            tvCarPower.setText(R.string.car_hp_c3);
            tvCarTorque.setText(R.string.car_torque_c3);
            tvCarDesc.setText(R.string.car_desc_c3);
            tvCarPrice.setText(R.string.car_price_c3);

        } else if (carId.equals("c4")) {
            imgCar.setImageResource(R.drawable.charger);
            tvCarName.setText(R.string.car_name_c4);
            tvCarBrand.setText(R.string.car_brand_c4);
            tvCarEngine.setText(R.string.car_engine_c4);
            tvCarPower.setText(R.string.car_hp_c4);
            tvCarTorque.setText(R.string.car_torque_c4);
            tvCarDesc.setText(R.string.car_desc_c4);
            tvCarPrice.setText(R.string.car_price_c4);

        } else if (carId.equals("c5")) {
            imgCar.setImageResource(R.drawable.chrysler);
            tvCarName.setText(R.string.car_name_c5);
            tvCarBrand.setText(R.string.car_brand_c5);
            tvCarEngine.setText(R.string.car_engine_c5);
            tvCarPower.setText(R.string.car_hp_c5);
            tvCarTorque.setText(R.string.car_torque_c5);
            tvCarDesc.setText(R.string.car_desc_c5);
            tvCarPrice.setText(R.string.car_price_c5);

        } else if (carId.equals("c6")) {
            imgCar.setImageResource(R.drawable.cts_v);
            tvCarName.setText(R.string.car_name_c6);
            tvCarBrand.setText(R.string.car_brand_c6);
            tvCarEngine.setText(R.string.car_engine_c6);
            tvCarPower.setText(R.string.car_hp_c6);
            tvCarTorque.setText(R.string.car_torque_c6);
            tvCarDesc.setText(R.string.car_desc_c6);
            tvCarPrice.setText(R.string.car_price_c6);

        }

        setActionBarTitle(carName);


    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
}
