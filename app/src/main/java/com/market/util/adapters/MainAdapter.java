package com.market.util.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.market.util.R;
import com.market.util.entities.Item;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private ItemClickListener callback;
    private List<Item> data;

    public MainAdapter(ItemClickListener callback, List<Item> data) {
        this.callback = callback;
        this.data = data;
    }

    public interface ItemClickListener {
        void onItemClick(int i);
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ItemClickListener callback;
        private ImageView image;

        public ViewHolder(ItemClickListener callback, View itemView) {
            super(itemView);
            this.callback = callback;
            image = (ImageView) itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (callback != null) {
                callback.onItemClick(getAdapterPosition());
            }
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_shop_card, parent, false);
        return new ViewHolder(callback, v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(data.get(position).getImage())
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}