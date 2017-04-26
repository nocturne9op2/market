package com.market.util.utils;

import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.market.util.entities.Item;
import com.market.util.entities.Shop;
import com.yarolegovich.discretescrollview.DiscreteScrollView;

import java.util.List;

public class DiscreteScrollViewUtils {
    public static void smoothScrollToUserSelectedPosition(final DiscreteScrollView scrollView, View anchor) {
        PopupMenu popupMenu = new PopupMenu(scrollView.getContext(), anchor);
        Menu menu = popupMenu.getMenu();

        List<Item> data = Shop.get().getData();

        for (int i = 0; i < scrollView.getAdapter().getItemCount(); i++) {
            menu.add(Menu.NONE, data.get(i).getId(), Menu.NONE, data.get(i).getName());
        }

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int destination = item.getItemId() - 1;
                scrollView.smoothScrollToPosition(destination);
                return true;
            }
        });
        popupMenu.show();
    }

    public static int getTransitionTime() {
        return 150;
    }
}