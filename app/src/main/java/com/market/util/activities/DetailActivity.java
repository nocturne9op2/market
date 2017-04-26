package com.market.util.activities;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.market.util.R;
import com.market.util.entities.Item;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "item_name";

    private Item item;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        item = getIntent().getParcelableExtra(EXTRA_NAME);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(item.getName());

        loadInfo();
    }

    private void loadInfo() {
        ImageView backdrop = (ImageView) findViewById(R.id.imageViewBackdrop);
        TextView ingredients = (TextView) findViewById(R.id.textViewIngredients);
        TextView instructions = (TextView) findViewById(R.id.textViewInstructions);

        Glide.with(this)
                .load(item.getImage())
                .into(backdrop);
        ingredients.setText(item.getIngredients());
        instructions.setText(item.getInstructions());
    }
}