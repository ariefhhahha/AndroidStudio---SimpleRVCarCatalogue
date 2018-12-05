package ariefhhahha.com.musclecarcatalogue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCarList;
    private ArrayList<Car>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCarList = findViewById(R.id.rv_car_list);
        list = new ArrayList<>();
        list.addAll(CarData.getListData());

/*
* mengisi RecycleView dengan data yang telah disiapkan di CardViewCarAdapter.java
* */
        rvCarList.setLayoutManager(new LinearLayoutManager(this));
        CardViewCarAdapter cardViewCarAdapter = new CardViewCarAdapter(this);
        cardViewCarAdapter.setListCar(list);
        rvCarList.setAdapter(cardViewCarAdapter);

    }

}
