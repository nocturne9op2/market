package com.market.util.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.market.util.R;
import com.market.util.adapters.MainAdapter;
import com.market.util.entities.Item;
import com.market.util.entities.Shop;
import com.market.util.utils.DiscreteScrollViewUtils;
import com.yarolegovich.discretescrollview.DiscreteScrollView;
import com.yarolegovich.discretescrollview.Orientation;
import com.yarolegovich.discretescrollview.transform.ScaleTransformer;

import java.util.List;

public class MainActivity extends AppCompatActivity implements DiscreteScrollView.OnItemChangedListener, MainAdapter.ItemClickListener, View.OnClickListener {
    private TextView currentItemName;
    private TextView currentItemSize;
    private ImageView rateItemButton;

    private Shop shop;
    private List<Item> data;

    private DiscreteScrollView itemPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentItemName = (TextView) findViewById(R.id.item_name);
        currentItemSize = (TextView) findViewById(R.id.item_size);
        rateItemButton = (ImageView) findViewById(R.id.item_btn_rate);

        shop = Shop.get();
        data = shop.getData();

        itemPicker = (DiscreteScrollView) findViewById(R.id.item_picker);
        itemPicker.setOrientation(Orientation.HORIZONTAL);
        itemPicker.setOnItemChangedListener(this);
        itemPicker.setAdapter(new MainAdapter(this, data));
        itemPicker.setItemTransitionTimeMillis(DiscreteScrollViewUtils.getTransitionTime());
        itemPicker.setItemTransformer(new ScaleTransformer.Builder()
                .setMinScale(0.8f)
                .build());

        onItemChanged(data.get(0));

        findViewById(R.id.item_btn_rate).setOnClickListener(this);
        findViewById(R.id.item_btn_buy).setOnClickListener(this);
        findViewById(R.id.item_btn_comment).setOnClickListener(this);

        findViewById(R.id.btn_smooth_scroll).setOnClickListener(this);
    }

    @Override
    public void onItemClick(int i) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_NAME, data.get(i));
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.item_btn_rate:
                Item current = data.get(itemPicker.getCurrentItem());
                shop.setRated(current.getId(), !shop.isRated(current.getId()));
                changeRateButtonState(current);
                break;
            case R.id.btn_smooth_scroll:
                DiscreteScrollViewUtils.smoothScrollToUserSelectedPosition(itemPicker, v);
                break;
            default:
                showUnsupportedSnackBar();
                break;
        }
    }

    @Override
    public void onCurrentItemChanged(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        onItemChanged(data.get(position));
    }

    private void onItemChanged(Item item) {
        currentItemName.setText(item.getName());
        currentItemSize.setText(item.getSize());
        changeRateButtonState(item);
    }

    private void changeRateButtonState(Item item) {
        if (shop.isRated(item.getId())) {
            rateItemButton.setImageResource(R.drawable.ic_star_black_24dp);
            rateItemButton.setColorFilter(ContextCompat.getColor(this, R.color.shopRatedStar));
        } else {
            rateItemButton.setImageResource(R.drawable.ic_star_border_black_24dp);
            rateItemButton.setColorFilter(ContextCompat.getColor(this, R.color.shopSecondary));
        }
    }

    private void showUnsupportedSnackBar() {
        Snackbar.make(itemPicker, R.string.msg_unsupported_op, Snackbar.LENGTH_SHORT).show();
    }
}