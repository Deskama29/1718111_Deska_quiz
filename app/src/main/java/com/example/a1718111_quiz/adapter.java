package com.example.a1718111_quiz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.FamilyViewHolder> {

    private ArrayList<keluarga> dataList;
    public adapter(ArrayList<keluarga> FamilyArrayList) {
        this.dataList = FamilyArrayList;
    }

    @NonNull
    @Override
    public adapter.FamilyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item,parent,false);
        return new FamilyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.FamilyViewHolder holder, int position) {
        holder.srcGambar.setImageDrawable(dataList.get(position).getGambar());
        holder.tvNama.setText(dataList.get(position).getNama());
        holder.tvNim.setText(dataList.get(position).getJabatan());

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0 ;
    }

    public class FamilyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNama, tvNim;
        private ImageView srcGambar;

        public FamilyViewHolder(@NonNull View itemView) {
            super(itemView);
            srcGambar = (ImageView) itemView.findViewById(R.id.gambar);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvNim = itemView.findViewById(R.id.tv_jabatan);
        }
    }
}