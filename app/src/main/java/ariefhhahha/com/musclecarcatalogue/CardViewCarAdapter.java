package ariefhhahha.com.musclecarcatalogue;

/*
* menyiapkan tampilan data yang sudah diambil lewat Car.java untuk ditampilkan dalam widget cardview.
*
* meyiapkan aksi untuk tombol detail agar bisa membuka CarDetailActivity dan mengirim data ke CarDetailActivity.
* tombol detail itu objeknya dibuat di CustomOnItemClickListener.java
* */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewCarAdapter extends RecyclerView.Adapter<CardViewCarAdapter.CardViewViewHolder> {

    private ArrayList<Car> listCar;
    private Context context;

    public CardViewCarAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Car> getListCar() {
        return listCar;
    }

    public void setListCar(ArrayList<Car> listCar) {
        this.listCar = listCar;
    }

    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_car, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder (CardViewViewHolder holder, int position) {

        Car c = getListCar().get(position);

        Glide.with(context)
                .load(c.getPhoto())
                .override(520, 320)
                .into(holder.imgPhoto);



        holder.tvName.setText(c.getName());
        holder.tvBrand.setText(c.getBrand());

        holder.btnShare.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Shared : " + getListCar().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));

        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent carIntent = new Intent(context, CarDetailActivity.class);
                carIntent.putExtra(CarDetailActivity.CAR_ID, getListCar().get(position).getId());
                carIntent.putExtra(CarDetailActivity.CAR_NAME, getListCar().get(position).getName());
                context.startActivity(carIntent);
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListCar().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvBrand;
        Button btnShare, btnDetail;

        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvBrand = itemView.findViewById(R.id.tv_item_brand);
            btnShare = itemView.findViewById(R.id.btn_share);
            btnDetail = itemView.findViewById(R.id.btn_detail);
        }
    }
}
